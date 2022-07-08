package com.stepdef;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclasses.BaseClass;
import com.pageclasses.HomePage;
import com.pageclasses.SearchPage;
import com.utilities.Utils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SD_OneWayTrip extends BaseClass {
	
	HomePage homePage = new HomePage(driver);
	SearchPage searchPage;
	Properties prop = new Properties();
	FileInputStream fin;
	
	@When("^User navigates to MakeMyTrip URL$")
	public void user_navigates_to_MakeMyTrip_URL() throws Throwable {
	    BaseClass.openBrowserAndNavigateToURL();
	}

	@Then("^User should be able to remove any pop ups on the home page$")
	public void user_should_be_able_to_remove_any_pop_ups_on_the_home_page() throws Throwable {
		PageFactory.initElements(driver, homePage);
	    homePage.waitForElement(homePage.popUpElement);
	    homePage.removeLanguagePopup();
	}

	@Then("^User should be able provide From City input field$")
	public void user_should_be_able_provide_From_City_input_field() throws Throwable {
		homePage.waitForElement(homePage.preFilledElementFromCity);
		homePage.clickOnFromCityElement();
		homePage.waitForElement(homePage.inputBoxElementFromCity);
		fin = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\testdata\\configuration.properties");
		prop.load(fin);
		String fromCity = prop.getProperty("cityFrom");
		homePage.provideFromCityInputField(fromCity);
		try {
			Thread.sleep(1000);
			homePage.clickOnFirstListOption();
		} catch (WebDriverException e) {
			homePage.clickOnFirstListOption();
		} catch (Exception ee) {
			ee.printStackTrace();
			throw ee;
		}
		Thread.sleep(3000);
	}

	@Then("^User should be able provide To City input field$")
	public void user_should_be_able_provide_To_City_input_field() throws Throwable {
		homePage.waitForElement(homePage.preFilledElementToCity);
		homePage.clickOnToCityElement();
		fin = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\testdata\\configuration.properties");
		prop.load(fin);
		String toCity = prop.getProperty("cityTo");
		homePage.provideToCityInputField(toCity);
		try {
			Thread.sleep(1000);
			homePage.clickOnFirstListOption();
		} catch (WebDriverException e) {
			homePage.clickOnFirstListOption();
		} catch (Exception ee) {
			ee.printStackTrace();
			throw ee;
		}
		Thread.sleep(3000);
	}

	@Then("^User should be able to provide departure date$")
	public void user_should_be_able_to_provide_departure_date() throws Throwable {
	    homePage.enterDateForDeparture();
	}

	@Then("^User clicks on the search button$")
	public void user_clicks_on_the_search_button() throws Throwable {
		searchPage = homePage.clickOnSearchBtn();
	}

	@SuppressWarnings("deprecation")
	@Then("^User should be landed to search page with flight details$")
	public void user_should_be_landed_to_search_page_with_flight_details() throws Throwable {
	    String searchPageURL = driver.getCurrentUrl().toString();
	    Boolean val = searchPageURL.contains("itinerary=CCU-DEL-12/07/2022");
	    Assert.assertEquals("true", val.toString());
	    Utils.toTakeScreenshot(driver, "searchPage");
	    driver.quit();
	}

}
