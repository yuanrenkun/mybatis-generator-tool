package com.generator.run;


/**
 * 运行默认的配置文件
 * 
 * @author tanxianwen 2015年4月29日
 */
public class QuXiaoRunner {
    public static void main(String[] args) {
        Runner r = new Runner();

        r.setConfigFile(TanxianwenKrplus2Runner.class.getClassLoader().getResource("krplus2_generatorConfig.xml").getFile());
        r.setContextIds("context1");
        r.setTargetProject("E:/code");
        r.setJavaModelTargetPackage("com.kr.rong.model.company");
        String mapperPackage = "com.kr.rong.mapper.company";
        r.setJavaClientTargetPackage(mapperPackage);
        r.setSqlMapTargetPackage(mapperPackage);

        // 设置要生成的表
        r.addFullyQualifiedTable("company_funds");
        r.addFullyQualifiedTable("company");


        r.run();
    }
}
