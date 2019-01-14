package easy;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easy1.Inputformpom;

public class Inputform {

	@When("the user clicks the inputform fill the details")
	public void inputform() {
	   Inputformpom input1 = new Inputformpom();
	   input1.getFirstname().sendKeys("nasrin");
	   input1.getLastname().sendKeys("rilwana");
	   input1.getEmail().sendKeys("nasrinrilwana@gmail.com");
	   input1.getPhone().sendKeys("7358193259");
	   input1.getAddress().sendKeys("sathyanagar");
	   input1.getCity().sendKeys("chennai");
	   input1.getState().click();
	   input1.getZipcode().sendKeys("6240007");
	   input1.getWebsite().sendKeys("cloud");
	   input1.getHosting().click();
	   input1.getProjectdescription().sendKeys("fast and secure");
	   input1.getSubmit().click();
	}

	@Then("the user views expected result")
	public void the_user_views_expected_result() {
		Assert.assertTrue("Url contains input-form-demo", Hook.driver.getCurrentUrl().contains("input-form-demo"));

	}
}
