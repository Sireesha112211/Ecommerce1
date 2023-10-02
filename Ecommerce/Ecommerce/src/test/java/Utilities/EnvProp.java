package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvProp {
    private static Properties properties;
    public static void init(){
        if ( properties == null){
            try {
                properties = new Properties();
                properties.load(new FileInputStream("C:\\Users\\kandu\\eclipse-workspace\\Ecommerce\\src\\test\\resources\\env.properties"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static String getproperty(String key){
        init();
        return properties.getProperty(key);
    }

}
