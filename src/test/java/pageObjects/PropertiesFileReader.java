package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This Class is used to get the instance of properties from application.properties file
 */
public class PropertiesFileReader {

    private static PropertiesFileReader INSTANCE = null;
    static Properties properties = new Properties();
    static InputStream in, input = null;
    static {

	try {
//	    in = PropertiesFileReader.class.getResourceAsStream(PROP_FILE);
		 in = new FileInputStream(new File("./src/test/resources/application.properties"));
	    properties.load(in);

	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static synchronized PropertiesFileReader getInstance() {
	if (INSTANCE == null) {
	    INSTANCE = new PropertiesFileReader();
	}
	return INSTANCE;
    }

    public static Properties readProperties(String name) {

	try {
	    if (null != name) {
//		in = properties.getClass().getResourceAsStream("/com/resources/" + name);
	    	 in = new FileInputStream(new File("./src/test/resources/application.properties"));

		properties.load(in);
	    }
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
	return properties;
    }

    public static String getProperty(String key) {
	String value = null;
	if (null != key && !"".equalsIgnoreCase(key)) {
	    value = (String) properties.get(key);
	}
	return value;
    }
    
    public static void main(String[] args){
    	readProperties("application.properties");
    }

}
