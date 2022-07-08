package com.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclasses.BaseClass;

public class HomePage extends BaseClass {
	
	SearchPage searchPage;
	public HomePage (WebDriver driver) {
		super();
	}
	//Locators
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/div[9]/span")
	public WebElement popUpElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span")
	public WebElement preFilledElementFromCity;
	
	@FindBy(xpath = "//*[@placeholder='From']")
	public WebElement inputBoxElementFromCity;
	
	@FindBy(xpath = "//*[@id=\"react-autowhatever-1-section-0-item-0\"]")
	public WebElement firstListElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/span")
	public WebElement preFilledElementToCity;
	
	@FindBy(xpath = "//*[@placeholder='To']")
	public WebElement inputBoxElementToCity;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")
	public WebElement departureDatePickerElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[3]/div/p[1]")
	public WebElement dateElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")
	public WebElement searchBtnElement;
	
	//Actions
	public void removeLanguagePopup() {
		popUpElement.click();
	}
	
	public void clickOnFromCityElement() {
		preFilledElementFromCity.click();
	}
	
	public void provideFromCityInputField(String fromCity) {
		inputBoxElementFromCity.sendKeys(fromCity);
	}
	
	public void clickOnFirstListOption() {
		firstListElement.click();
	}
	
	public void clickOnToCityElement() {
		preFilledElementToCity.click();
	}
	
	public void provideToCityInputField(String toCity) {
		inputBoxElementToCity.sendKeys(toCity);
	}
	
	public void enterDateForDeparture() {
		departureDatePickerElement.click();
		waitForElement(dateElement);
		dateElement.click();
	}
	
	public SearchPage clickOnSearchBtn() {
		searchBtnElement.click();
		searchPage = new SearchPage(driver);
		PageFactory.initElements(driver, searchPage);
		return searchPage;
	}
	
	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
