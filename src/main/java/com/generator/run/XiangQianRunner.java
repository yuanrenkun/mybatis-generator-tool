package com.generator.run;

import org.mybatis.generator.api.ShellRunner;

public class XiangQianRunner {
    public static void main(String[] args) {
        String config = XiangQianRunner.class.getClassLoader().getResource("xingqian_generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite" , "-verbose"};
        ShellRunner.main(arg);
    }
}
