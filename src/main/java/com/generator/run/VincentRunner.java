package com.generator.run;

import org.apache.ibatis.io.Resources;
import org.mybatis.generator.api.ShellRunner;

import java.io.File;
import java.io.IOException;

/**
 * @author haokuixi
 */
public class VincentRunner {
    public static void main(String[] args) throws IOException {
        File configFile = Resources.getResourceAsFile("Vincent_generatorConfig_by_properties.xml");
        String[] arg = {"-configfile", configFile.getPath(), "-overwrite", "-verbose", "-tables", "system_param"};
        ShellRunner.main(arg);
    }
}
