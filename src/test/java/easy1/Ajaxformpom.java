package easy1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import easy.Hook;

public class Ajaxformpom {
 
	public Ajaxformpom() {
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(id="title")
	private WebElement Name;

	public WebElement getName() {
		return Name;
	}
	
	@FindBy(id="description")
	private WebElement description;

	public WebElement getDescription() {
		return description;
	}
	
	@FindBy(id="btn-submit")
	private WebElement btnsubmit;

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	
	
}
