package com.baseclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.driversetup.DriverSetup;

public class BaseClass extends DriverSetup {
	
	public static WebDriver driver;
	public static Properties prop = null;
	public static String baseURL = "";
	
	public static WebDriver openBrowserAndNavigateToURL() throws IOException {
		
		if (prop == null) {
			prop = new Properties();
			FileInputStream fin = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\testdata\\configuration.properties");
			prop.load(fin);
		}
		String browserName = prop.getProperty("browser");
		baseURL = prop.getProperty("baseURL");
		driver = DriverSetup.startBrowser(browserName);
		driver.get(baseURL);
		return driver;
		
	}

}
