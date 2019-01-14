package easy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import easy1.Simpleformpom;

public class Homepage {
    // Simple form
	@Given("Ensure the user is in seleniumeasy home page")
	public void homepage() {
	   Hook.driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("the user clicks the Input form and simple form")
	public void the_user_clicks_the_Input_form_and_simple_form() {
		
		Pomform pom = new Pomform();
		//Inputform click
		pom.getInputforms().click();
		//Simpleform click
		pom.getSimpleform().click();
		
		
	}
	
	//Checkbox
	@Given("Ensure the user is in Seleniumeasy home page")
	public void ensure_the_user_is_in_Seleniumeasy_home_page() {
		
		 Hook.driver.get("https://www.seleniumeasy.com/test/");
	   
	}
	
	@Given("the User clicks the Inputform and checkbox form")
	public void the_User_clicks_the_Inputform_and_checkbox_form() {
	    Pomform check = new Pomform();
	    check.getInputforms().click();
	    check.getCheckboxdemo().click();
	}
	
	// Radio
	@Given("Confirm the user is in seleniumeasypage")
	public void seleniumeasypage() {
		Hook.driver.get("https://www.seleniumeasy.com/test/");
	    
	}
	
	@Given("the User clicks the Inputform and radiobutton")
	public void the_User_clicks_the_Inputform_and_radiobutton() {
	   Pomform radio = new Pomform();
	   radio.getInputforms().click();
	   radio.getRadiobutton().click();
	}
	
	//Input
	@Given("the user is in seleniumeasypage")
	public void the_user_is_in_seleniumeasypage_inputform() {
		Hook.driver.get("https://www.seleniumeasy.com/test/");
		   
	}
	
	@Given("the user clicks the Inputform and inputformdemo")
	public void the_user_clicks_the_Inputform_and_inputformdemo() {
	   Pomform input = new Pomform();
	   input.getInputforms().click();
	   input.getSubmitinputform().click();
	}
	
	//ajax
	@Given("Make sure user is in seleniumeasypage")
	public void seleniumeasypage_ajax() {
		Hook.driver.get("https://www.seleniumeasy.com/test/");

	}
	
	@Given("the user clicks the Inputform and ajaxform")
	public void the_user_clicks_the_Inputform_and_ajaxform() {
	    Pomform ajax= new Pomform();
	    ajax.getInputforms().click();
	    ajax.getAjaxformclick().click();
	}
	
	//jquery
	@Given("user in seleniumeasyhome page")
	public void user_in_seleniumeasyhome_page() {
		Hook.driver.get("https://www.seleniumeasy.com/test/");

	}
	
	@Given("the user click the inputform and jqueryform")
	public void the_user_click_the_inputform_and_jqueryform() {
	    Pomform jquery = new Pomform();
	    jquery.getInputforms().click();
	    jquery.getJqueryformclick().click();
	}
	
	@Given("the user in seleniumhome page")
	public void the_user_in_seleniumhome_page() {
		Hook.driver.get("https://www.seleniumeasy.com/test/");

	   	}

	@Given("the user click inputform and dropdownform")
	public void the_user_click_inputform_and_dropdownform() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	
	

	
	


	
}
