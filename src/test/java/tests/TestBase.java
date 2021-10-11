package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {

	public static WebDriver driver;
	@BeforeSuite
	@Parameters({"browser"}) //parameter name like the one in testng.xml
	public void startDriver(@Optional("chrome") String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			String driverPath = System.getProperty("user.dir")+"\\Drivers\\chromedriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driverPath);
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("fireFox")) {
			System.out.println("useing browseris firefox");
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	
	public void navigation( String url) {
		driver.navigate().to(String.format("https://btt-dev.noprod-b.kmt.orange.com/%s", url));
	}
	
	@AfterSuite
	public void stopDriver() {
//		driver.quit();
	}
}
