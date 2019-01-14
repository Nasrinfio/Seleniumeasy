package easy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSliders {
	
	public PomSliders() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[4]")
	private WebElement Progressbar;

	public WebElement getProgressbar() {
		return Progressbar;
	}
	
	@FindBy(xpath="//a[text()='Drag & Drop Sliders']")
	private WebElement DragandDrop;

	public WebElement getDragandDrop() {
		return DragandDrop;
	}
	
	
}
