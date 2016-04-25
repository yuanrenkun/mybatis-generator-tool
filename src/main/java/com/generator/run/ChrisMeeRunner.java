package com.generator.run;

import org.mybatis.generator.api.ConfigurationParserCustomizedShellRunner;
import org.mybatis.generator.config.xml.KrConfigurationParser;

/**
 * @author Chris Mee
 * @Email micuncang@36kr.com 2015年11月11日
 */
public class ChrisMeeRunner {
    public static void main(String[] args) {
        String config = ChrisMeeRunner.class.getClassLoader().getResource("krplus2_generatorConfig.xml").getFile();
        String[] arg = {"-configfile", config, "-overwrite", "-verbose", "-contextids", "context1", "-tables", "sixin_quick_reply"};

        ConfigurationParserCustomizedShellRunner.configuration_parser_clazz = KrConfigurationParser.class;

        KrConfigurationParser.jdbcConnection_connectionURL = "jdbc:mysql://192.168.2.14:3306/krplus2";
        KrConfigurationParser.jdbcConnection_driverClass = "com.mysql.jdbc.Driver";
        KrConfigurationParser.jdbcConnection_password = "123456";
        KrConfigurationParser.jdbcConnection_userId = "db-test";

        KrConfigurationParser.initTargetProject("/Users/mcc/Downloads/mysqlgenerator");
        KrConfigurationParser.javaClientGenerator_targetPackage = "com.kr.rong.mapper.user";
        KrConfigurationParser.javaModelGenerator_targetPackage = "com.kr.rong.model.user";
        KrConfigurationParser.sqlMapGenerator_targetPackage = "com.kr.rong.mapper.user";

        ConfigurationParserCustomizedShellRunner.main(arg);
    }
}
