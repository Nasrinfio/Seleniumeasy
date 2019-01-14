package easy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomform {
	
	public Pomform() {
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")
	private WebElement Inputforms;

	public WebElement getInputforms() {
		return Inputforms;
	}
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")
	private WebElement Simpleform;
	
	public WebElement getSimpleform() {
		return Simpleform;
	}
	
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[2]/a")
	private WebElement Checkboxdemo;

	public WebElement getCheckboxdemo() {
		return Checkboxdemo;
	}
	
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[3]/a")
	private WebElement Radiobutton;

	public WebElement getRadiobutton() {
		return Radiobutton;
	}
	
	@FindBy(xpath="//a[text()='Input Form Submit']")
	private WebElement submitinputform;

	public WebElement getSubmitinputform() {
		return submitinputform;
	}
	
	@FindBy(xpath="//a[text()='Ajax Form Submit']")
	private WebElement ajaxformclick;

	public WebElement getAjaxformclick() {
		return ajaxformclick;
	}
	
	@FindBy(xpath="//a[text()='JQuery Select dropdown']")
	private WebElement jqueryformclick;

	public WebElement getJqueryformclick() {
		return jqueryformclick;
	}
	
	
	

	


}
