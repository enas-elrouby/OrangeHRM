package pages;

import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;
	protected static String InsertedemployeeName = "Orange Test";
	protected static String Insertedusername = "User"+UUID.randomUUID().toString();

	// create constructor
	public PageBase(WebDriver webDriver) {
		driver = webDriver;
		//this --> read the page from the current class
		PageFactory.initElements(driver, this);
	}
}
