package Com.Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Common_Properties {
	
	
	public static String propertiesFile(String key) {
	
	  File file = new File("C:\\Users\\sanp3\\git\\TestNG\\Project_Testng\\PROP\\prop.Properties");
	  
	  FileReader fileReader = null;
	try {
		fileReader = new FileReader(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  Properties properties= new Properties();
		  
	  try {
		properties.load(fileReader);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	  
	  return properties.getProperty(key);
	  
	  

}
	
	
}