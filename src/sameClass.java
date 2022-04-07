import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sameClass {
	
	 @DataProvider(name="loginData")
	  public static Object[][] loginData1() { // static data because your login data called by any script 
	    
		  Object [][] data = new Object[3][4]; // Object is super class of all int,float, string etc.
		  
		  data[0][0] = "500076616@stu.upes.ac.in";
	      data[0][1] = "Yash@123";
	      data[0][2] = "chrome";
	      data[0][3] = "100.0.4896.60";
	      
	      data[1][0] = "yashvishnoi1001@gmail.com";
	      data[1][1] = "xyz009";
	      data[1][2] = "chromium brave";
	      data[1][3] = "1.35.103";
	      
	      data[2][0] = "xyz@outlook.com";
	      data[2][1] = "xyz698";
	      data[2][2] = "IE";
	      data[2][3] = "69.78.04";
		  return data;
	  }
	 
	 
	 @Test(dataProvider="loginData")
	  public void loginTestDataDisplay(String username, String passwd, String browser, String version) {
		  System.out.println("Username    " + username);
	      System.out.println("pwd        " + passwd);
	      System.out.println("browser    " + browser);
	      System.out.println("vrsn        " + version);  
	  }
}
