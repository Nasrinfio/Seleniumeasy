package easy;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easy1.Simpleformpom;

public class Simpleform {

	@When("the user clicks the simple form fill the details")
	public void formfill() {
	   
		Simpleformpom simple = new Simpleformpom();
		simple.getEntermessage().sendKeys("hi good morning");
	    simple.getBtnv1click().click();
		simple.getValue1().sendKeys("10");
		simple.getValue2().sendKeys("20");
        simple.getBtngettotal().click();
		
	}
	
	@Then("The user view the result")
	public void viewresult() {
		Assert.assertTrue("Url contains first-form-demo", Hook.driver.getCurrentUrl().contains("first-form-demo"));
		
	}
	




}
