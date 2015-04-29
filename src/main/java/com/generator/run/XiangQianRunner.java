package com.generator.run;

import org.mybatis.generator.api.ShellRunner;

/**
 * 运行幸倩的配置文件
 * @author tanxianwen 
 * 2015年4月29日
 */
public class XiangQianRunner {
    public static void main(String[] args) {
        String config = XiangQianRunner.class.getClassLoader().getResource("xingqian_generatorConfig.xml").getFile();
        String[] arg = { "-configfile", config, "-overwrite" , "-verbose"};
        ShellRunner.main(arg);
    }
}
