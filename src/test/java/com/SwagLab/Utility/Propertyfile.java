package com.SwagLab.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile
{
	public static Properties p1;

	public Propertyfile()
	{
		File f1=new File("./"+"\\config\\property.properties");
		FileInputStream fs;
		 p1=new Properties();
		try {
			fs=new FileInputStream(f1);
			p1.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getProp(String key)
	{
	return p1.getProperty(key);
	}
	
	
}
