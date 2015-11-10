package com.generator.run;

import org.mybatis.generator.api.ConfigurationParserCustomizedShellRunner;
import org.mybatis.generator.config.xml.KrConfigurationParser;

/**
 * @author Chris Mee
 * @Email micuncang@36kr.com 2015年11月11日
 */
public class ChrisMeeRunner {
    public static void main(String[] args) {
        String config = ChrisMeeRunner.class.getClassLoader().getResource("ChrisMeeGeneratorConfig.xml").getFile();
        String[] arg = {"-configfile", config, "-overwrite", "-verbose", "-contextids", "krplus2", "-tables", "assistor_msg"};

        ConfigurationParserCustomizedShellRunner.configuration_parser_clazz = KrConfigurationParser.class;

        KrConfigurationParser.jdbcConnection_connectionURL = "jdbc:mysql://127.0.0.1:33061/krplus2";
        KrConfigurationParser.jdbcConnection_driverClass = "com.mysql.jdbc.Driver";
        KrConfigurationParser.jdbcConnection_password = "MUe0glR9XjnYfLn5";
        KrConfigurationParser.jdbcConnection_userId = "krplus";

        KrConfigurationParser.initTargetProject("/Users/mcc/Downloads/mysqlgenerator2");
        KrConfigurationParser.javaClientGenerator_targetPackage = "com.kr.rong.mapper.app.v3.assistor";
        KrConfigurationParser.javaModelGenerator_targetPackage = "com.kr.rong.model.app.v3.assistor";
        KrConfigurationParser.sqlMapGenerator_targetPackage = "com.kr.rong.mapper.app.v3.assistor";

        ConfigurationParserCustomizedShellRunner.main(arg);
    }
}
