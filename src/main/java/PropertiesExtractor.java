import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesExtractor {

    public String getProperty(String key){
        String value = "";
        try {
            Properties prop = new Properties();
            String file = "jenkies.properties";
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(file);
            if(inputStream != null){
                prop.load(inputStream);
            }else{
                throw new FileNotFoundException("property file'" + file + "' not found.");
            }
            value = prop.getProperty(key);
        }catch(Exception ex){
            return null;
        }
        return value;
    }
}
