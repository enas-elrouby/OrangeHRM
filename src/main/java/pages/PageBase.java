package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;

	// create constructor
	public PageBase(WebDriver webDriver) {
		driver = webDriver;
		//this --> read the page from the current class
		PageFactory.initElements(driver, this);
	}
}
