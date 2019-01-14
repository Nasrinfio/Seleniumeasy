package easy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTable {

	public PomTable(){
		PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[3]")
	private WebElement Table;

	public WebElement getTable() {
		return Table;
	}
	
	@FindBy(xpath="//a[text()='Table Pagination']")
	private WebElement Tablepagination;

	public WebElement getTablepagination() {
		return Tablepagination;
	}
	
	@FindBy(xpath="//a[text()='Table Data Search']")
	private WebElement TableDataSearch;

	public WebElement getTableDataSearch() {
		return TableDataSearch;
	}
	
	@FindBy(xpath="//a[text()='Table Filter ']")
	private WebElement Tablefilter;

	public WebElement getTablefilter() {
		return Tablefilter;
	}
	
	@FindBy(xpath="//a[text()='Table Sort & Search']")
	private WebElement Tablesortandsearch;

	public WebElement getTablesortandsearch() {
		return Tablesortandsearch;
	}
	
}
