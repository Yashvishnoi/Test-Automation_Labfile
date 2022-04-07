import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	String driverpath;
	String baseurl;
	
	@Test
	public static void setUpBrowser() {
		driverpath= "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\chromedriver_win32 (2)\\chromedriver.exe";
		baseurl = "https://www.amazon.in/";
	}
	
	@Test
	public static WebD
}
