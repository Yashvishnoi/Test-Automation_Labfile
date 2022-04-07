
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateTestNg {
	int testCounter =0;
	boolean contains;
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in/");
	}
	
	@Test
	public void test() {
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("echo show");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("All new Echo Show 5 (2nd Gen, 2021 release) - Smart speaker with 5.5\" screen, crisp sound and Alexa (Black)")).click();
	}
	@Test
	public void test1() {
		ArrayList<String> chromeTabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(chromeTabs.get(1));
	}
	@Test
	public void test2() {
		WebElement articleTitle = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[4]/div[11]/div[4]/div[3]/div/h1/span"));
		System.out.println(articleTitle.getText());
		contains = articleTitle.getText().contains("Echo Show");
	}
	@Test
	public void test3() {
		WebElement articleTitle = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[4]/div[11]/div[4]/div[3]/div/h1/span"));
		System.out.println(articleTitle.getText());
		boolean contains = articleTitle.getText().contains("Echo Show");
	}
	
	
	@Test
	public void test4() {
		WebElement buyBtn = driver.findElement(By.id("buy-now-button"));
		if(contains) {
			contains = buyBtn.isDisplayed();
			testCounter++;
		}
	}
	@Test
	public void test5() {
		WebElement amznChoice = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[4]/div[11]/div[4]/div[9]/div/span[1]/span[1]"));
		if(contains) {
			contains = amznChoice.getText().contains("Amazon");
			testCounter++;
		}
		System.out.println(amznChoice.getText());
	}


	@Test
	public void test6() {
		if(contains) {
			System.out.println("Passed!!");
		}
		else {
			System.out.println("Failed!!");
		}
		System.out.println("No. of Tests passed: " + testCounter);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
