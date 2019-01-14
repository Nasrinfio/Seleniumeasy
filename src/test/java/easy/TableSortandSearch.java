package easy;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TableSortandSearch {

	@Given("The user in seleniumeasy home page")
	public void the_user_in_seleniumeasy_home_page() {
		Hook.driver.get("https://www.seleniumeasy.com/test/");
	   	}

	@Given("the user click table and tablesort and search")
	public void the_user_click_table_and_tablesort_and_search() {
	   PomTable table4 = new PomTable();
	   table4.getTable().click();
	   table4.getTablesortandsearch().click();
	}
	
	@When("the user search and sort for the data")
	public void the_user_search_and_sort_for_the_data() {
	   Hook.driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Ramos");   
	}
	
	
	@Then("expected result should be viewed")
	public void expected_result_should_be_viewed() {
	Assert.assertTrue("Verify the user is in table-sort-search-demo", Hook.driver.getCurrentUrl().contains("table-sort-search-demo"));
		
	}


}
