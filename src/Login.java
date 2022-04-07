import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	  @BeforeTest
	  public void beforeLogin() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); // to maximize the window
			driver.get("https://www.amazon.in/");  
	  }
	
  @Test
  public void login() {
	  
		driver.findElement(By.id("nav-signin-tooltip")).click();
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("7060516974");
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		driver.findElement(By.id("ap_password")).sendKeys("ghhg7755");
		driver.findElement(By.id("signInSubmit")).submit();
  }
  
  @Test
  public void searchArticle() {
	  System.out.println("Search Article");
  }
  
  @AfterTest
  public void afterLogin() {
	  driver.close();
  }
}
