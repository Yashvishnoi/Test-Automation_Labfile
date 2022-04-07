import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the window
		driver.get("https://www.amazon.in/");
		
		 WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBar.sendKeys("echo show");
	        
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        driver.findElement(By.linkText("All new Echo Show 5 (2nd Gen, 2021 release) - Smart speaker with 5.5\" screen, crisp sound and Alexa (Black)")).click();
	        
	        ArrayList<String> chromeTabs = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(chromeTabs.get(1));
	        
	        WebElement articleTitle = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[4]/div[11]/div[4]/div[3]/div/h1/span"));
	        System.out.println(articleTitle.getText());
	        articleTitle.getText().contains("echo show");
	        
	        WebElement AddtoCart = driver.findElement(By.id("add-to-cart-button"));
	        System.out.println(AddtoCart.isDisplayed());
	        
	        
	        WebElement articlePrice = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[4]/div[11]/div[4]/div[15]/div[1]/div[1]/span[2]/span[2]/span[2]"));
	        System.out.println(articlePrice.getText());
	        articlePrice.getText().contains("echo show");
	        
	        
	        WebElement Customerreview = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[4]/div[11]/div[4]/div[7]/div/span[1]/span/span[1]/a/i[1]"));
	        System.out.println(Customerreview.isDisplayed());
	       
	        
	        WebElement EMI = driver.findElement(By.id("trigger_emioptions"));
	        System.out.println(EMI.isDisplayed());
	       
	        
	        driver.switchTo().window(chromeTabs.get(0));		
		
	}

}
