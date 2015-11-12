package com.generator.plugin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.db.ConnectionFactory;

/**
 * Desc: User: HaiNan.Wang Date: 14/12/31
 */
public class CommentPlugin extends PluginAdapter {
    private static final String AUTHOR = "modelClassAuthor";

    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
            IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        String remark = introspectedColumn.getRemarks();
        field.addJavaDocLine("/** " + remark + " */");

        return true;
    }

    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        String remarks = "";
        String author = getProperties().getProperty(AUTHOR);
        if (null == author || "".equals(author)) {
            author = System.getProperty("user.name");
        }

        FullyQualifiedTable table = introspectedTable.getFullyQualifiedTable();
        try {
            Connection connection = ConnectionFactory.getInstance().getConnection(context.getJdbcConnectionConfiguration());
            ResultSet rs =
                    connection.getMetaData().getTables(table.getIntrospectedCatalog(), table.getIntrospectedSchema(),
                            table.getIntrospectedTableName(), null);

            if (null != rs && rs.next()) {
                String catlog = rs.getString("TABLE_CAT");
                if (null != catlog) {
                    remarks += catlog + ".";
                }
                String schema = rs.getString("TABLE_SCHEM");
                if (null != schema) {
                    remarks += schema + ".";
                }
                String tableName = rs.getString("TABLE_NAME");
                remarks += tableName + "  ";

                String defaultRemark = rs.getString("REMARKS");
                rs.close();
                if (null == defaultRemark || "".equals(defaultRemark)) {
                    defaultRemark = tryGetTableRemarks(connection, tableName);
                }
                remarks += defaultRemark;
            }
            closeConnection(connection, rs);
        } catch (SQLException e) {}

        SimpleDateFormat format = new SimpleDateFormat("yyyy-M-d");
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * " + remarks);
        topLevelClass.addJavaDocLine(" *");
        topLevelClass.addJavaDocLine(" * @author " + author);
        topLevelClass.addJavaDocLine(" * @date " + format.format(new Date()));
        topLevelClass.addJavaDocLine(" *");
        topLevelClass.addJavaDocLine(" */");
        return true;
    }

    public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return true;
    }

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    private void closeConnection(Connection connection, ResultSet rs) {
        if (null != rs) {
            try {
                rs.close();
            } catch (SQLException e) {}
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {}
        }

    }

    /**
     * 与pgsql不同，mysql数据库难以直接拿到表注释，尝试第二种方式获取表注释
     * 
     * @param connection
     * @param tableName
     * @return
     */
    private String tryGetTableRemarks(Connection connection, String tableName) {
        try {
            ResultSet rt = connection.createStatement().executeQuery("show table status ;");
            while (rt.next()) {
                if (tableName.equalsIgnoreCase(rt.getString("Name"))) {
                    return rt.getString("Comment");
                }
            }
            rt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
