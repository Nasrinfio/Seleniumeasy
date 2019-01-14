package easy1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import easy.Hook;

public class Checkdemopom {
	
 public Checkdemopom() {
	 PageFactory.initElements(Hook.driver, this);
 }
 
 @FindBy(xpath="//*[@id=\"isAgeSelected\"]")
 private WebElement Singlecheckbox;
 
 @FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")
 private WebElement Multiplecheckbox;

public WebElement getSinglecheckbox() {
	return Singlecheckbox;
}

public WebElement getMultiplecheckbox() {
	return Multiplecheckbox;
}
 
 
 
}
