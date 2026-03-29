package Cucumber.stepDefinitions;  
   
public class PlaceOrderStepDefs extends BaseSteps{  
      @Given(“Customer navigates to the website”)  
      public void navigateToWebsite(){  
            driver.get(System.getProperty(“url”));  
      }  
 
      @And(“Customer login to his account”)  
      public void customerLogin(){
            driver.findElement(By.id(“username”)).enterData(“username”);  
            driver.findElement(By.id(“password”)).enterData(“password”);  
            driver.findElement(By.id(“login”)).click();  
      }  
 
      @When(“customer searches for laptop”)  
      public void searchForLaptop(){  
            driver.findElement(By.id(“searchBox”)).enterData(“Laptop”);  
            driver.findElement(By.id(“searchButton”)).click();  
      }  
 
      @And(“clicks on add to cart button”)  
      public void clickAddToCart(){  
            driver.findElement(By.id(“addToCart”)).click();  
      }  
 
      @Then(“Customer is redirected to cart page”)  
      public void redirectionToCartPage(){  
            Assert.assertTrue(driver.findElement(By.id(“cartPageHeader”)).isDisplayed());  
      }  
 
      @And(“Customer is able to click the place order button”)  
      public void clickPlaceOrderButton(){  
            Assert.assertTrue(driver.findElement(By.id(“placeOrderButton”)).isClickable());  
      }  
}