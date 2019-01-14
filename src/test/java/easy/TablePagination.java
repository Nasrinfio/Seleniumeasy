package easy;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TablePagination {

	@Given("Ensure the user is in seleniumeasyhome page")
	public void ensure_the_user_is_in_seleniumeasyhome_page() {
	   Hook.driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("the user is in table and table pagination")
	public void the_user_is_in_table_and_table_pagination() {
	   PomTable table = new PomTable();
	   table.getTable().click();
	   table.getTablepagination().click();
	}
	
	@When("the user is in table pagination")
	public void the_user_is_in_table_pagination() {
	   List<WebElement> tRows = Hook.driver.findElements(By.tagName("tr"));
	   for(int i=0;i<tRows.size();i++) {
		   WebElement w = tRows.get(i);
		   List<WebElement> tData = w.findElements(By.tagName("td"));
		   for(int j=0;j<tData.size();j++) {
			   WebElement s = tData.get(j);
			   System.out.println(s.getText());
		   }
	   }
	}
	
	@Then("print the table data")
	public void print_the_table_data() {
	    Assert.assertTrue("Verify the url contains table-pagination-demo", Hook.driver.getCurrentUrl().contains("table-pagination-demo"));
	}


}
