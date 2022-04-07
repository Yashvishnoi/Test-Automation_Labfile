import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
public static void main(String[] args) {
System.out.println();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.amazon.in/");
driver.findElement(By.id("nav-signin-tooltip")).click();
driver.findElement(By.id("createAccountSubmit")).click();
driver.findElement(By.id("ap_customer_name")).sendKeys ("Yash Vishnoi");

driver.findElement(By.id("ap_phone_number")). sendKeys ("7060516974"); 
driver.findElement (By.id("ap_email")).sendKeys("yashvishnoi1001@@gmail.com");
driver. findElement(By.id("ap_password")).sendKeys ("yash@123");
driver.findElement( By.id( "ap_password_check")).sendKeys("yash@123");
driver. findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[6]/span/span/input")).click();

}
}