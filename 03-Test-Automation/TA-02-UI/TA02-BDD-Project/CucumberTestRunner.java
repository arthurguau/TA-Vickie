package Cucumber;  
  
@RunWith(Cucumber.class)  
@CucumberOptions(  
      plugin = {"pretty"},  
      glue = {"Cucumber.stepDefinitions"},  
      features = {"src/test/java/Cucumber/features"})  
   
public class CucumberTestRunner { 
}