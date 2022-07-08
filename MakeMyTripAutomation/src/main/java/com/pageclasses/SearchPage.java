package com.pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.BaseClass;

public class SearchPage extends BaseClass {
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, BaseClass.class);
	}
	
	//Locators
	
	//Actions 

}
