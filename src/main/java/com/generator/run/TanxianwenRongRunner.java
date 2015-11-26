/**
 * 
 */
package com.generator.run;


/**
 *
 * @author tanxianwen 2015年11月11日
 */
public class TanxianwenRongRunner {
    public static void main(String[] args) {
        Runner r = new Runner();

        r.setConfigFile(TanxianwenRongRunner.class.getClassLoader().getResource("tanxianwen_generatorConfig.xml").getFile());
        r.setContextIds("context1");
        r.setJdbcDriverClass("com.mysql.jdbc.Driver");
        r.setJdbcConnectionUrl("jdbc:mysql://db1.test/krplus2");
        r.setUsername("krplus");
        r.setPassword("MUe0glR9XjnYfLn5");
        r.setTargetProject("D:/work/gitlab/krplus-service/src/main/java");
        r.setJavaModelTargetPackage("com.kr.rong.model.company.test");
        String mapperPackage = "com.kr.rong.mapper.company.test";
        r.setJavaClientTargetPackage(mapperPackage);
        r.setSqlMapTargetPackage(mapperPackage);

        // 设置要生成的表
        r.addFullyQualifiedTable("company_funds");
        r.addFullyQualifiedTable("company");


        r.run();
    }

}
