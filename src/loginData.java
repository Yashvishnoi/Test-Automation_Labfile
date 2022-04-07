
import org.testng.annotations.DataProvider;

public class loginData {
 
  @DataProvider(name="loginData")
  public static Object[][] loginData1() { // static data because your login data called by any script 
    
	  Object [][] data = new Object[3][4]; // Object is super class of all int,float, string etc.
	  
	  data[0][0] = "500077601@stu.upes.ac.in";
      data[0][1] = "kuchbhi";
      data[0][2] = "chrome";
      data[0][3] = "98.0.4758.102";
      
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
}
