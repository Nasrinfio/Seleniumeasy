package easy1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import easy.Hook;

public class Jqueryformpom {

	public Jqueryformpom() {
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div[2]/span/span[1]/span/ul/li/input")
	private WebElement Selectstate;
	
	public WebElement getSelectstate() {
		return Selectstate;
	}

	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div[2]/span/span[1]/span/ul/li[1]")
	private WebElement Multiselect;
    
	public WebElement getMultiselect() {
		return Multiselect;
	}
	
     @FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div[2]/label")
     private WebElement labeldropclick;

     public WebElement getLabeldropclick() {
	  return labeldropclick;
     }
     
     
     @FindBy(xpath="//*[@id=\"files\"]/optgroup[1]/option[1]")
     private WebElement python;

	public WebElement getPython() {
		return python;
	}
     
    
     
     
}
