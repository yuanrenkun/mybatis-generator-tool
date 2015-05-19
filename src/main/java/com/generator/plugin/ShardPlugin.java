package com.generator.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.TableConfiguration;

import com.mysql.jdbc.StringUtils;

/**
 * 类上添加散表字段
 * 
 * @author Chris Mee
 * @Email micuncang@36kr.com 2015年5月14日
 */
public class ShardPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        TableConfiguration tc = introspectedTable.getTableConfiguration();
        String shardKey = tc.getProperty("shardBy");
        if (!StringUtils.isEmptyOrWhitespaceOnly(shardKey)) {
            StringBuffer sb = new StringBuffer();
            sb.append("@ShardBy(\"").append(shardKey).append("\")");
            topLevelClass.addAnnotation(sb.toString());
            // @ShardBy注解可以作为基本类型并入common-util, 此处不进行引入强制
            topLevelClass.addImportedType("");
        }
        return true;
    }
}
