package easy1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import easy.Hook;

public class Inputformpom {
	
	public Inputformpom() {
		PageFactory.initElements(Hook.driver, this);
	}
	//Firstname
	@FindBy(name="first_name")
	private WebElement Firstname;

	public WebElement getFirstname() {
		return Firstname;
	}
   //lastname
	@FindBy(name="last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	
	//email
	@FindBy(name="email")
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}
	
	@FindBy(name="phone")
	private WebElement phone;

	public WebElement getPhone() {
		return phone;
	}
	
	@FindBy(name="address")
	private WebElement Address;

	public WebElement getAddress() {
		return Address;
	}
	
	@FindBy(name="city")
	private WebElement City;

	public WebElement getCity() {
		return City;
	}
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select/option[2]")
	private WebElement State;

	public WebElement getState() {
		return State;
	}
	
	@FindBy(name="zip")
	private WebElement Zipcode;

	public WebElement getZipcode() {
		return Zipcode;
	}
	
	@FindBy(name="website")
	private WebElement website;

	public WebElement getWebsite() {
		return website;
	}
	
	@FindBy(xpath="(//input[@type=\"radio\"])[2]")
	private WebElement Hosting;

	public WebElement getHosting() {
		return Hosting;
	}
	
    @FindBy (xpath="//textarea[@placeholder=\"Project Description\"]")
    private WebElement Projectdescription;

	public WebElement getProjectdescription() {
		return Projectdescription;
	}
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	
    
}
