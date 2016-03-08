package com.generator.run;

/**
 * Created by wangshengren on 15/12/31.
 */
public class WangsrRunner {
    public static void main(String[] args) {
        //        //=====kr-impush======
        //        Runner r = new Runner();
        //        r.setConfigFile(WangsrRunner.class.getClassLoader().getResource("krplus2_generatorConfig.xml").getFile());
        //        r.setContextIds("context1");
        //
        //        r.setTargetProject("/Users/wangshengren/workspace/git/kr-impush/src/main/java");
        //        r.setJavaClientTargetPackage("com.kr.impush.mapper");
        //        r.setSqlMapTargetPackage("com.kr.impush.mapper");
        //        r.setJavaModelTargetPackage("com.kr.impush.api.model");
        //
        //        r.addFullyQualifiedTable("user_binding");
        //        r.run();
        //        //=====kr-impush======

        //====kr-msg====
        //        Runner r = new Runner();
        //        r.setConfigFile(WangsrRunner.class.getClassLoader().getResource("kr_msg_generatorConfig.xml").getFile());
        //        r.setContextIds("context");
        //        // model 单独的工程(dubbo接口使用)
        //        r.setJavaModelTargetProject("/Users/wangshengren/workspace/git/kr-msg-projects/kr-msg-api/src/main/java");
        //        r.setJavaModelTargetPackage("com.kr.msg.api.model");
        //
        //        // mapper 工程
        //        r.setTargetProject("/Users/wangshengren/workspace/git/kr-msg-projects/kr-msg/src/main/java");
        //        r.setJavaClientTargetPackage("com.kr.msg.mapper");
        //        r.setSqlMapTargetPackage("com.kr.msg.mapper");
        //
        //        // 设置要生成的表
        //        r.addFullyQualifiedTable("notice");
        //        r.addFullyQualifiedTable("notice_tpl");
        //
        //        //r.addFullyQualifiedTable("inbox");
        //        //r.addFullyQualifiedTable("outbox");
        //        //r.addFullyQualifiedTable("mail_content");
        //        r.run();
        //====kr-msg=====

        //====kr-msg====
        Runner r = new Runner();
        r.setConfigFile(WangsrRunner.class.getClassLoader().getResource("kr_msg_generatorConfig.xml").getFile());
        r.setContextIds("context");
        // model 单独的工程(dubbo接口使用)
        r.setJavaModelTargetProject("/Users/wangshengren/workspace/git/kr-msg-projects/kr-msg-api/src/main/java");
        r.setJavaModelTargetPackage("com.kr.msg.api.model");

        // mapper 工程
        r.setTargetProject("/Users/wangshengren/workspace/git/kr-msg-projects/kr-msg/src/main/java");
        r.setJavaClientTargetPackage("com.kr.msg.mapper");
        r.setSqlMapTargetPackage("com.kr.msg.mapper");

        // 设置要生成的表
        r.addFullyQualifiedTable("user_rc_token");

        r.run();
        //====kr-msg=====



    }
}
