/**
 * 
 */
package com.generator.run;


/**
 *
 * @author tanxianwen 2015年11月11日
 */
public class TanxianwenKrAdminRunner {
    public static void main(String[] args) {
        Runner r = new Runner();

        r.setConfigFile(TanxianwenKrAdminRunner.class.getClassLoader().getResource("kr_admin_generatorConfig.xml").getFile());
        r.setContextIds("context1");
        r.setTargetProject("D:/work/gitlab/kr-x/src/main/java");
        r.setJavaModelTargetPackage("com.kr.x.model.user.test");
        String mapperPackage = "com.kr.x.mapper.user.test";
        r.setJavaClientTargetPackage(mapperPackage);
        r.setSqlMapTargetPackage(mapperPackage);

        // 设置要生成的表
        // r.addFullyQualifiedTable("x_resource");
        r.addFullyQualifiedTable("x_user");


        r.run();
    }

}
