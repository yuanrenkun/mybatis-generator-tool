package com.generator.run;

import org.mybatis.generator.api.ShellRunner;

/**
 * 运行前的配置文件
 * @author zhangwei
 * 2015年11月9日
 */
public class ZhangWeiRunner {
    public static void main(String[] args) {
        String config = ZhangWeiRunner.class.getClassLoader().getResource("zhangwei_generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite" , "-verbose", "-tables", "krlass_tutor" };
        ShellRunner.main(arg);
    }
}
