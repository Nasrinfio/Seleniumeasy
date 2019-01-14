package easy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSliders {

	@Given("the user is in seleniumeasy page")
	public void the_user_is_in_seleniumeasy_page() {
	   Hook.driver.get("https://www.seleniumeasy.com/test/");
	}

	@Given("the user is in progressbar and clicks draganddrop")
	public void the_user_is_in_progressbar_and_clicks_draganddrop() {
		
		PomSliders sliders = new PomSliders();
		sliders.getProgressbar().click();
		sliders.getDragandDrop().click();
	  }

	@When("the user in draganddrop")
	public void the_user_in_draganddrop() {
	 WebElement slider1=  Hook.driver.findElement(By.name("range"));
	 Actions acc = new Actions(Hook.driver);
	 acc.moveByOffset(0, 55).release().build().perform();
	   
	   
	}


}
