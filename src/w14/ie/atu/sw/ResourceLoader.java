package w14.ie.atu.sw;

import java.io.File;

// use this to get file from resources folder
public class ResourceLoader {
    private static final String RESOURCE_FOLDER = "resources";
    private static final String USER_DIRECTORY = System.getProperty("user.dir");

    public static File getResourceFiles(){
        // use "\\" to make slashes independent of OS
        System.out.println(USER_DIRECTORY+"\\"+RESOURCE_FOLDER);
        return new File(USER_DIRECTORY+"\\"+RESOURCE_FOLDER);
    }
}
