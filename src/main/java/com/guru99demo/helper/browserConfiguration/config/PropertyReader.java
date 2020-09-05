package com.guru99demo.helper.browserConfiguration.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import com.guru99demo.helper.browserConfiguration.BrowserType;
import com.guru99demo.helper.resource.ResourceHelper;

public class PropertyReader implements ConfigReader {
	
	public static Properties OR;
	
    private static FileInputStream file;
    
	static{
		
		try {
			file = new FileInputStream(ResourceHelper.getResourcePath("resources/configFile/config.properties"));
			OR = new Properties();
			try {
				OR.load(file);
			} catch (IOException e) {
		     e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	
	public int getImpliciteWait() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	public int getExplicitWait() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPageLoadTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	public BrowserType getBrowserType() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
