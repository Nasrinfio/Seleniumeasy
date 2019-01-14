package easy;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import easy1.TableDatasearchpom;

public class TableDatasearch {
	@When("the user is in tabledataserch pass the values to searchfor")
	public void tabledataserch() {
	  
	TableDatasearchpom tabledata = new TableDatasearchpom();
	tabledata.getTasks().sendKeys("John Smith");
	tabledata.getBtnfilter().click();
	tabledata.getUsername().sendKeys("jacobs");
	}
	
	@Then("view the expected result")
	public void result() {
	   Assert.assertTrue("Very url contains the word table-search-filter-demo", Hook.driver.getCurrentUrl().contains("table-search-filter-demo"));
	}
	
	
}
