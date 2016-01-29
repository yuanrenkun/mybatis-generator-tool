/**
 * 
 */
package com.generator.run;


/**
 *
 * @author tanxianwen 2015年11月11日
 */
public class TanxianwenKrplus2Runner {
    public static void main(String[] args) {
        Runner r = new Runner();

        r.setConfigFile(TanxianwenKrplus2Runner.class.getClassLoader().getResource("krplus2_generatorConfig.xml").getFile());
        r.setContextIds("context1");
        r.setTargetProject("D:/work/gitlab/krplus-service/src/main/java");
        // r.setJavaModelTargetPackage("com.kr.rong.model.company.test");
        //r.setJavaModelTargetPackage("com.kr.rong.model.activity.letter");
        r.setJavaModelTargetPackage("com.kr.rong.model.roadshow");
        // String mapperPackage = "com.kr.rong.mapper.company.test";
        // String mapperPackage = "com.kr.rong.mapper.blacklist";
        //String mapperPackage = "com.kr.rong.mapper.activity.letter";
        String mapperPackage = "com.kr.rong.mapper.roadshow";
        r.setJavaClientTargetPackage(mapperPackage);
        r.setSqlMapTargetPackage(mapperPackage);

        // 设置要生成的表
        // r.addFullyQualifiedTable("company");
        // r.addFullyQualifiedTable("company_funds");
        // r.addFullyQualifiedTable("user_blacklist");
        //r.addFullyQualifiedTable("activity_company_letter");

        //r.addFullyQualifiedTable("roadshow_reply");
        //r.addFullyQualifiedTable("roadshow_comment");
        r.addFullyQualifiedTable("roadshow");

        r.run();
    }

}
