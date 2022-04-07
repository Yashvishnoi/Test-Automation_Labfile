import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class screenshot {
	WebDriver driver;
	String driverpath= "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\chromedriver_win32 (2)\\chromedriver.exe";
	String baseurl = "https://www.amazon.in/";
	
	@Test
	public void takescreenshot() {
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		driver.get(baseurl);
		screenshot.captureScreenShot(driver);
		driver.manage().window().maximize();
		screenshot.captureScreenShot(driver);
	}
	
	@Test
	public void takescreenshotLoginButtonClick() {
		driver.findElement(By.id("nav-signin-tooltip")).click();
		screenshot.captureScreenShot(driver);
		
	}

	public static void captureScreenShot(WebDriver driver2) {
		// Take screenshot and store in file format
		File src =((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,new File("C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\screenshots"+System.currentTimeMillis()+".png"));
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
