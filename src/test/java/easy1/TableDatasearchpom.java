package easy1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import easy.Hook;

public class TableDatasearchpom{

	public TableDatasearchpom() {
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(id="task-table-filter")
	private WebElement Tasks;

	public WebElement getTasks() {
		return Tasks;
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div/button")
	private WebElement btnfilter;

	public WebElement getBtnfilter() {
		return btnfilter;
	}
	
	@FindBy(xpath="//input[@placeholder=\"Username\"]")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}
	
}
