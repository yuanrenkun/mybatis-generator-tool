package com.generator.run;

import org.mybatis.generator.api.ShellRunner;

/**
 * 运行默认的配置文件
 * @author tanxianwen 
 * 2015年4月29日
 */
public class QuXiaoRunner {
    public static void main(String[] args) {
        String config = QuXiaoRunner.class.getClassLoader().getResource("quxiao_generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite", "-verbose", "-tables", "company" };
        ShellRunner.main(arg);
    }
}
