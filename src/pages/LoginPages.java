package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;

public class LoginPages extends PredefinedActions {

	public void login(String username,String password) {
		enterUserName(username);
		enterPassword(password);
		clickOnLoginBtn();
	}
	
	public void enterUserName(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public boolean isUsernameErrorMessageDisplayed() {
		WebElement loginErrorMessage=driver.findElement(By.cssSelector("#txtUsername-error"));
		return loginErrorMessage.isDisplayed();
	}
	
	public boolean isPasswordErrorMessageDisplayed() {
		WebElement passwordErrorMessage=driver.findElement(By.cssSelector("#txtPassword-error"));
		return passwordErrorMessage.isDisplayed();
	}
	
	public boolean isLogoDisplayed(){
		return driver.findElement(By.cssSelector("div.organization-logo.shadow>img")).isDisplayed();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
