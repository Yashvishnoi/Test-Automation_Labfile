
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SearchingTestNg {
	WebDriver driver;

    @BeforeTest
    public void beforeTest() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\Udemy\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().fullscreen();
        driver.get("https://www.amazon.in");
    }
    
    @Test
    public void test() {
    	WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
    	 searchbar.sendKeys("Echoshow");

         driver.findElement(By.id("nav-search-submit-button")).click();


         driver.findElement(By.linkText("All new Echo Show 5 (2nd Gen, 2021 release) - Smart speaker with 5.5\" screen, crisp sound and Alexa (Black)"));

//         Boolean isDisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[1]/span[2]/span[2]")).isDisplayed();
//
//
//         if(isDisplayed == true) {
//             System.out.println("Test passed!!!");
//         }
    }
    
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
