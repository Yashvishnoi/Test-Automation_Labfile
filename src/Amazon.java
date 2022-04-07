import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the window
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-signin-tooltip")).click();
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("7060516974");
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("ghhg7755");
		driver.findElement(By.id("signInSubmit")).submit();
		driver.close();
		
		
	}

}
