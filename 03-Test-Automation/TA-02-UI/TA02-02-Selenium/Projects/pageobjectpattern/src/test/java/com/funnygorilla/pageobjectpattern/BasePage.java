/**
 * 
 */
package com.funnygorilla.pageobjectpattern;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * create a base page class that encapsulates the common logic for all the page classes.
 * @author guson
 *
 */
public class BasePage {
	
	private WebDriver driver;

	private WebDriverWait wait;
    private int timeoutSec = 5; // wait timeout (5 seconds by default)

    public BasePage() {
        /*
         * WebDriverManager is an open-source Java library that carries out the management 
         * (i.e., download, setup, and maintenance) of the drivers required by Selenium WebDriver
         *  WebDriverManager provides other relevant features, 
         *  such as the capability to discover browsers installed in the local system, building WebDriver objects
         */
    	//driver = WebDriverManager.getInstance(browser).create(); 
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, timeoutSec);  
    }

    public void setTimeoutSec(int timeoutSec) {  
        this.timeoutSec = timeoutSec;
    }

    public void visit(String url) {  
        driver.get(url);
    }

    public void click(WebElement element) {
    	element.click();
    }

    public void type(WebElement element, String text) {
    	element.sendKeys(text);    	
    }

    public void quit () {
    	driver.quit();
    }
    
    public boolean isDisplayed(WebElement element) {  
        try {
        	wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }
    
    public WebDriver getDriver() {
    	return driver;
    }
    
    public void setDriver(WebDriver driver) {
    	this.driver = driver;
    }
}
