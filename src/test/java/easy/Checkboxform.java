package easy;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easy1.Checkdemopom;

public class Checkboxform {

	@When("the user clicks the checkbox fill the details")
	public void checkboxfill() {
	   
		Checkdemopom checkbox = new Checkdemopom();
		checkbox.getSinglecheckbox().click();
	    checkbox.getMultiplecheckbox().click();
	}
	@Then("the user view the result")
	public void viewpage() {
	    Assert.assertTrue("Verify the url contains the word checkbox-demo", Hook.driver.getCurrentUrl().contains("checkbox-demo"));
	}
}
