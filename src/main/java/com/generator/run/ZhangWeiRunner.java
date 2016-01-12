package com.generator.run;

/**
 * 运行前的配置文件
 *
 * @author zhangwei 2015年11月9日
 */
public class ZhangWeiRunner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.setConfigFile(ZhangWeiRunner.class.getClassLoader().getResource("krplus2_generatorConfig.xml").getFile());
        runner.setContextIds("context1");
        runner.setTargetProject("/Users/36kr/krspace/krplus-service/src/main/java");
        runner.setJavaModelTargetPackage("com.kr.rong.model.company");
        String mapperPackage = "com.kr.rong.mapper.company";
        runner.setSqlMapTargetPackage(mapperPackage);
        runner.setJavaClientTargetPackage(mapperPackage);

        //设置生成的表
//        runner.addFullyQualifiedTable("company");

        runner.run();
    }
}
