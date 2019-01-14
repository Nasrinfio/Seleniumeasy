package easy;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easy1.Jqueryformpom;

public class Jqueryform {

	@When("the user click the jqueryform fill the details")
	public void the_user_click_the_jqueryform_fill_the_details() {
	    
		Jqueryformpom jquery = new Jqueryformpom();
		//jquery.getSelectstate().click();
		jquery.getMultiselect().click();
		jquery.getMultiselect().click();
		//jquery.getLabeldropclick().click();
		jquery.getPython().click();
	}

	@Then("the user can view the expected result")
	public void the_user_can_view_the_expected_result() {
	    
	}

}
