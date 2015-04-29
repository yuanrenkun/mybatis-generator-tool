package com.generator.run;

import org.mybatis.generator.api.ShellRunner;

public class DefaultRunner {
    public static void main(String[] args) {
        String config = DefaultRunner.class.getClassLoader().getResource("generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite", "-verbose" };
        ShellRunner.main(arg);
    }
}
