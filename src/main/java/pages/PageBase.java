package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;
	protected static String username = "User"+new Random().nextInt(100) + 20;

	// create constructor
	public PageBase(WebDriver webDriver) {
		driver = webDriver;
		//this --> read the page from the current class
		PageFactory.initElements(driver, this);
	}
}
