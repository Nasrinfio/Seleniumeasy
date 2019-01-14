package easy;

import cucumber.api.java.en.Given;

public class Homepagetable {
	
	@Given("Confirm user is in seleniumeasypage")
	public void confirm_user_is_in_seleniumeasypage() {
	   Hook.driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("the user is in table and table data search")
	public void the_user_is_in_table_and_table_data_search() {
	   PomTable table1 = new PomTable();
	   table1.getTable().click();
	   table1.getTableDataSearch().click();
	}
	

}
