import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.logging.Level;
public class logger {
	WebDriver driver;
	String driverpath;
	String baseurl;
	@Test
	public void logSample() {
		WebDriver driver;
		driverpath= "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\chromedriver_win32 (2)\\chromedriver.exe";
		baseurl = "https://www.google.com/";
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		Reporter.log("Browser is opened now",true);
		driver.get(baseurl);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized",true);
		screenshot.captureScreenShot(driver);
		Reporter.log("Google is opened",true);
	}
}
