package easy;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easy1.Radiobuttonpom;

public class Radiobutton {
	
	@When("the user clicks the radiobtn fill the details")
	public void clickradiobutton() {
	   Radiobuttonpom radiobtn = new Radiobuttonpom();
	   radiobtn.getGender().click();
	   radiobtn.getBtngetcheck().click();
	   radiobtn.getGrpbtnGender().click();
	   radiobtn.getAgegroup().click();
	   radiobtn.getBtngetcheck().click();
	}

	@Then("the user clicks the radiobutton")
	public void the_user_clicks_the_radiobutton() {
		Assert.assertTrue("Url contains radiobutton-demo", Hook.driver.getCurrentUrl().contains("radiobutton-demo"));

	   	}


}
