package parametrized;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		// Excel file 2 column username & password
		String username= "";
		String password="";
		// how to read Excel file
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\ExcelReader.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("login");
			int rowCount = sheet.getLastRowNum();
			for(int i=1;i<=rowCount;i++) {
				XSSFRow row = sheet.getRow(i); 
				if(row.getCell(0).getCellType()==CellType.NUMERIC) {
					username = row.getCell(0).getRawValue();}
				else {
					username = row.getCell(0).toString();
				}
				password = row.getCell(1).getRawValue();
				login (username,password);
				}
		fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		login(username, password);

	}
	public static void login(String username1, String password1) {
		System.out.println("Running TC with username" + username1+"password" + password1);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the window
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-signin-tooltip")).click();
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys(username1);
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys(password1);
		driver.findElement(By.id("signInSubmit")).submit();
		driver.close();
	}
}
