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
        String[] arg = {"-configfile", config, "-overwrite", "-verbose", "-contextids", "passport", "-tables", "profile"};

        ConfigurationParserCustomizedShellRunner.configuration_parser_clazz = KrConfigurationParser.class;

        KrConfigurationParser.jdbcConnection_connectionURL = "jdbc:mysql://127.0.0.1:33065/passport";
        KrConfigurationParser.jdbcConnection_driverClass = "com.mysql.jdbc.Driver";
        KrConfigurationParser.jdbcConnection_password = "UflEyGJeJX9j6TJmXVPS";
        KrConfigurationParser.jdbcConnection_userId = "dev";

        KrConfigurationParser.initTargetProject("/Users/mcc/Downloads/mysqlgenerator");
        KrConfigurationParser.javaClientGenerator_targetPackage = "com.kr.passport.provider.mapper.account";
        KrConfigurationParser.javaModelGenerator_targetPackage = "com.kr.passport.api.model.account";
        KrConfigurationParser.sqlMapGenerator_targetPackage = "com.kr.passport.provider.mapper.account";

        ConfigurationParserCustomizedShellRunner.main(arg);
    }
}
