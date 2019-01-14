package easy1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import easy.Hook;

public class Radiobuttonpom {
	public Radiobuttonpom() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]")
	private WebElement Gender;

	public WebElement getGender() {
		return Gender;
	}
	
	@FindBy(id="buttoncheck")
	private WebElement btngetcheck;

	public WebElement getBtngetcheck() {
		return btngetcheck;
	}
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")
	private WebElement GrpbtnGender;

	public WebElement getGrpbtnGender() {
		return GrpbtnGender;
	}
	
	@FindBy(xpath="//input[@value=\"15 - 50\"]")
	private WebElement Agegroup;

	public WebElement getAgegroup() {
		return Agegroup;
	}
	
	@FindBy(xpath="//button[text()='Get Values']")
	private WebElement btngetvalue;

	public WebElement getBtngetvalue() {
		return btngetvalue;
	}
}
