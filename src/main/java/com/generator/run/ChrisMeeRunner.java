package com.generator.run;

import org.mybatis.generator.api.ShellRunner;

/**
 * 运行默认的配置文件
 * @author tanxianwen 
 * 2015年4月29日
 */
public class ChrisMeeRunner {
    public static void main(String[] args) {
        String config = ChrisMeeRunner.class.getClassLoader().getResource("ChrisMeeGeneratorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite", "-verbose", "-tables", "company_mini_feed" };
        ShellRunner.main(arg);
    }
}
