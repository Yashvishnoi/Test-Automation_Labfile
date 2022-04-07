import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReport{
	static ExtentTest test;
	static ExtentReports report;

	String baseurl = "https://www.amazon.in/";
	String driverpath = "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\Udemy\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;

	@BeforeClass
	public static void initializeReport(){
		report = new ExtentReports("C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}

	@BeforeTest
	public void launchingBrowser(){
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}

	@Test(priority=0)
	public void verifyTitle()
	{
		String expected = "Amazon";
		String actual = driver.getTitle();	
		if(actual.contains(expected))		{
			test.log(LogStatus.PASS, "Title page verified");
		}		
		else		{
			test.log(LogStatus.FAIL, "Title page not verified");
		}
	}
	
	@Test(priority=1)
	public void goToLogin(){
		driver.findElement(By.id("nav-signin-tooltip")).click();
	}
	
	@Test(priority=2)
	public void verifyLoginPage() {
		if(driver.findElement(By.id("ap_email")) != null){
			test.log(LogStatus.PASS, "Login Page verified");
		}		
		else		{
			test.log(LogStatus.FAIL, "Login Page not verified");
		}
	}

	@Test(priority=3)
	public void verifyCredentials()
	{
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("8368072466");
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();		
		if(driver.findElement(By.id("ap_password")) != null){
			test.log(LogStatus.PASS, "Login name entered correctly");
		}		
		else		{
			test.log(LogStatus.FAIL, "Login name is not entered correctly");
		}
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("772648@gupta");
		driver.findElement(By.id("signInSubmit")).click();
		if(driver.findElement(By.id("signInSubmit")) == null){
			test.log(LogStatus.PASS, "Login Successful");
		}		
		else{
			test.log(LogStatus.FAIL, "Login Error");
		}
	}

	@AfterTest
	public void tearDown(){
		driver.close();
		test.log(LogStatus.PASS, "Browser Closed Successfully");
	}
	
	@AfterClass
	public void publishingReport(){
		report.endTest(test);
		report.flush();
	}
}