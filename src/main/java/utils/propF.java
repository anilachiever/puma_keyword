package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class propF {

	public static String getValue(String key) throws Throwable, Throwable
	{
		Properties p=new Properties();
		p.load(new FileInputStream(new File("./inputData/file.properties")));
		return p.getProperty(key); 
	}
	
}
