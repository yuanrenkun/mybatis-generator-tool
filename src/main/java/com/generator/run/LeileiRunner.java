package com.generator.run;

import org.mybatis.generator.api.ConfigurationParserCustomizedShellRunner;
import org.mybatis.generator.config.xml.KrConfigurationParser;

/**
 * @author leilei
 * @Email leilei@36kr.com  2015/12/17.
 */
public class LeileiRunner {
	public static void main(String[] args) {
		String config = DemoRunner.class.getClassLoader().getResource("statistics_generatorConfig.xml").getFile();
		String[] arg = {"-configfile", config, "-overwrite", "-verbose", "-contextids", "context1", "-tables", "user_behavior"};

		ConfigurationParserCustomizedShellRunner.configuration_parser_clazz = KrConfigurationParser.class;

		KrConfigurationParser.jdbcConnection_connectionURL = "jdbc:mysql://192.168.2.14:3306/statistics";
		KrConfigurationParser.jdbcConnection_driverClass = "com.mysql.jdbc.Driver";
		KrConfigurationParser.jdbcConnection_password = "123456";
		KrConfigurationParser.jdbcConnection_userId = "db-test";

		KrConfigurationParser.initTargetProject("D:\\workspace\\krplus-service\\src\\main\\java");
		KrConfigurationParser.javaClientGenerator_targetPackage = "com.kr.rong.mapper.statistics";
		KrConfigurationParser.javaModelGenerator_targetPackage = "com.kr.rong.model.statistics";
		KrConfigurationParser.sqlMapGenerator_targetPackage = "com.kr.rong.mapper.statistics";

		ConfigurationParserCustomizedShellRunner.main(arg);
	}
}
