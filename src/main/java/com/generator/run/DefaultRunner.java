package com.generator.run;

import org.mybatis.generator.api.ShellRunner;

/**
 * 运行默认的配置文件
 * @author tanxianwen 
 * 2015年4月29日
 */
public class DefaultRunner {
    public static void main(String[] args) {
        String config = DefaultRunner.class.getClassLoader().getResource("generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite", "-verbose" };
        ShellRunner.main(arg);
    }
}
