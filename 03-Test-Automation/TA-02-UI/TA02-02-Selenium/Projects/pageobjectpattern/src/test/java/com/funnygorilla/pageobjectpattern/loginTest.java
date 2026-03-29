package com.funnygorilla.pageobjectpattern;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * mvn clean test -Dwebdriver.chrome.driver="C:\\Opt\\Selenium\\chromedriver.exe"
 * @author guson
 */
public class loginTest {
	
	private LoginActions actions;
    
    @BeforeAll
    public static void setup() {
    }
    
    @BeforeEach
    void setupTest() {
    	 actions = new LoginActions();
    }

    @AfterEach
    void teardownTest() {
    	 //driver.manage().deleteAllCookies();
    	actions.quit();
    }
    
    @AfterAll
    public static void teardown() {
    }    
    
    
    //------------------------------------------------------------- Page Objects
    @Test
    void testLoginSuccess() {
        //login.with("user", "user");
        actions.login("user", "user");
        Assertions.assertTrue(actions.successBoxPresent());
    }

//    @Test
//    void testLoginFailure() {
//        //login.with("bad-user", "bad-password");
//        actions.login("bad-user", "bad-password");
//        Assertions.assertFalse(actions.successBoxPresent());  
//    }

}
