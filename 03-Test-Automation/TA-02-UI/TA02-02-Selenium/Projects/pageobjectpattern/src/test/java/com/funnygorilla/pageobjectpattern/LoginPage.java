package com.funnygorilla.pageobjectpattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
    @FindBy(id = "username")
    @CacheLookup
    WebElement usernameInput;  

    @FindBy(id = "password")
    @CacheLookup
    WebElement passwordInput;

    @FindBy(css = "button")
    @CacheLookup
    WebElement submitButton;

    @FindBy(id = "success")
    @CacheLookup
    WebElement successBox;


    public LoginPage() {  
        /*
         * Class used to initialize all the previously declared web elements with @FindBy/@FindAll).
         */
        PageFactory.initElements(this.getDriver(), this); 
        visit("https://bonigarcia.dev/selenium-webdriver-java/login-form.html");
    }

    public void with(String username, String password) {  
        type(usernameInput, username);
        type(passwordInput, password);
        click(submitButton);
    }

    public boolean successBoxPresent() {  
        return isDisplayed(successBox);
    }
}
