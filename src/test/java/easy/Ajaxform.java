package easy;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easy1.Ajaxformpom;

public class Ajaxform {

	@When("the user clicks the ajaxform fill the details")
	public void the_user_clicks_the_ajaxform_fill_the_details() {
	  
		Ajaxformpom ajaxform = new Ajaxformpom();
		ajaxform.getName().sendKeys("Nasrin");
		ajaxform.getBtnsubmit().sendKeys("Practice .. Hi Good Morning");
		ajaxform.getBtnsubmit().click();
	}

	@Then("the user see the expected result")
	public void the_user_see_the_expected_result() {
		Assert.assertTrue("Url contains ajax-form", Hook.driver.getCurrentUrl().contains("ajax-form"));

	    	}


}
