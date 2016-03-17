package com.generator.run;


/**
 * 运行默认的配置文件
 * 
 * @author tanxianwen 2015年4月29日
 */
public class QuXiaoRunner {
    public static void main(String[] args) {
        Runner r = new Runner();

        r.setConfigFile(QuXiaoRunner.class.getClassLoader().getResource("krplus2_generatorConfig.xml").getFile());
        r.setContextIds("context1");
        r.setTargetProject("D:\\IdeaWorkspace\\kr\\kr-chuang-service\\src\\main\\java");
        r.setJavaModelTargetPackage("com.kr.chuang.model");
        String mapperPackage = "com.kr.chuang.mapper";
        r.setJavaClientTargetPackage(mapperPackage);
        r.setSqlMapTargetPackage(mapperPackage);

        // 设置要生成的表
        r.addFullyQualifiedTable("service_act_best_provider");
        r.addFullyQualifiedTable("service_act_best_provider_support_record");


        r.run();
    }
}
