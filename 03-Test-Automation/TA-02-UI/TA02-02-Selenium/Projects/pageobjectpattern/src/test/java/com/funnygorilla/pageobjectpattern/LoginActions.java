package com.funnygorilla.pageobjectpattern;

import org.openqa.selenium.support.PageFactory;

public class LoginActions {
	
	private LoginLocators locators; 
	
    public LoginActions() {
    	
    	this.locators = new LoginLocators();
        /*
         * Class used to initialize all the previously declared web elements with @FindBy/@FindAll).
         */
        PageFactory.initElements(SeleniumSupport.getInstance().getDriver(), this.locators);
        SeleniumSupport.getInstance().visit("https://bonigarcia.dev/selenium-webdriver-java/login-form.html");
    }

    public void login(String username, String password) {  
    	setUserName(username);
    	setPassword(password);
    	submit();
    }

    public boolean successBoxPresent() {  
        return isSuccessDisplayed();
    }
    
    public void quit() {
    	SeleniumSupport.getInstance().quit();
    }
    
    public void close() {
    	SeleniumSupport.getInstance().close();
    }
        
    public void deleteCookies() {
    	SeleniumSupport.getInstance().getDriver().manage().deleteAllCookies();
    }    
    public void teardown() {
    	
    }
    
    //---------------------------------------------------------- private methods
    private void setUserName(String username) {
    	SeleniumSupport.getInstance().type(locators.usernameInput, username);
    }
    
    private void setPassword(String password) {
    	SeleniumSupport.getInstance().type(locators.passwordInput, password);
    }
    
    private void submit() {
    	SeleniumSupport.getInstance().click(locators.submitButton);
    }
    
    private boolean isSuccessDisplayed() {
    	return SeleniumSupport.getInstance().isDisplayed(locators.successBox);
    }
}
