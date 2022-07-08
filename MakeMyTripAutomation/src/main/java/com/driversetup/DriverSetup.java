package com.driversetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	
	public static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName) {
		
		try {
			
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (browserName.equals("firefox")) {
				System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return driver;
		
	}

}
