/**
 * 
 */
package txw;

import java.io.File;

/**
 *
 * @author tanxianwen 2015年9月6日
 */
public class TxwDeleterTest {

    private static String modelName = "CompanyFunds";
    private static String function = "finance";

    private static String baseDir = "D:/work/gitlab/";
    private static String project = "krplus-service/";
    private static String basePackage = "com/kr/rong/";
    private static String modelDir = baseDir + project + "src/main/java/" + basePackage + "model/" + function + "/";
    private static String mapperDir = baseDir + project + "src/main/java/" + basePackage + "mapper/" + function + "/";

    /**
     * @param args
     */
    public static void main(String[] args) {
        File modelClass = new File(modelDir + modelName + ".java");
        if (modelClass.exists()) {
            modelClass.delete();
            System.out.println(modelClass.getPath() + " is deleted");
        } else {
            System.out.println(modelClass.getPath() + " is not exist");
        }

        File modelConditionClass = new File(modelDir + modelName + "Condition.java");
        if (modelConditionClass.exists()) {
            modelConditionClass.delete();
            System.out.println(modelConditionClass.getPath() + " is deleted");
        } else {
            System.out.println(modelConditionClass.getPath() + " is not exist");
        }

        File mapperClass = new File(mapperDir + modelName + "Mapper.java");
        if (mapperClass.exists()) {
            mapperClass.delete();
            System.out.println(mapperClass.getPath() + " is deleted");
        } else {
            System.out.println(mapperClass.getPath() + " is not exist");
        }

        File mapperXml = new File(mapperDir + modelName + "Mapper.xml");
        if (mapperXml.exists()) {
            mapperXml.delete();
            System.out.println(mapperXml.getPath() + " is deleted");
        } else {
            System.out.println(mapperXml.getPath() + " is not exist");
        }
    }

}
