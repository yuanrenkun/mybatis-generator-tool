package com.generator.run;

import org.mybatis.generator.api.ShellRunner;

/**
 * @author haokuixi
 */
public class HaokuixiRunner {
    public static void main(String[] args) {
        String config = HaokuixiRunner.class.getClassLoader().getResource("generatorConfig.xml").getFile();
        String[] arg = {"-configfile", config, "-overwrite", "-verbose", "-tables", "xxx"};
        ShellRunner.main(arg);
    }
}
