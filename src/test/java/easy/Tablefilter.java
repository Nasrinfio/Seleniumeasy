package easy;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tablefilter {

	@Given("Make sure the user is in seleniumeasypage")
	public void make_sure_the_user_is_in_seleniumeasypage() {
	   Hook.driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("the user click table and tablefilter page")
	public void the_user_click_table_and_tablefilter_page() {
	    PomTable table3 = new PomTable();
	    table3.getTable().click();
	    table3.getTablefilter().click();
	}
	
	@When("the user in tablefilter page checks able to click button and changes")
	public void the_user_in_tablefilter_page_checks_able_to_click_button_and_changes() {
	    Hook.driver.findElement
	    (By.xpath("/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[1]")).click();    
	
	}
	
	@Then("the user view the changes in tablefilter page")
	public void the_user_view_the_changes_in_tablefilter_page() {
	 Assert.assertTrue("verify the url contains table-records-filter-demo", Hook.driver.getCurrentUrl().contains("table-records-filter-demo"));
	}

	

}
