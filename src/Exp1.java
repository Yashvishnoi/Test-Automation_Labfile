import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize(); // to maximize the window
		driver.close();
	}

}
