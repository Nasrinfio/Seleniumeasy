package easy1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import easy.Hook;

public class Simpleformpom {

	public Simpleformpom() {
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder=\"Please enter your Message\"]")
	private WebElement Entermessage;

	public WebElement getEntermessage() {
		return Entermessage;
	}
	
	
	
	@FindBy(id="sum1")
	private WebElement Value1;
	
	public WebElement getValue1() {
		return Value1;
	}

	@FindBy(id="sum2")
	private WebElement Value2;
	
	public WebElement getValue2() {
		return Value2;
	}
	
	@FindBy(xpath="//*[@id=\"get-input\"]/button")
	private WebElement btnv1click;

	public WebElement getBtnv1click() {
		return btnv1click;
	}
	
	@FindBy(xpath="//*[@id=\"gettotal\"]/button")
	private WebElement btngettotal;

	public WebElement getBtngettotal() {
		return btngettotal;
	}
	


}
