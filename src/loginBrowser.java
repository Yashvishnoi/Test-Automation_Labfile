import org.testng.annotations.Test;

public class loginBrowser {
  @Test(dataProviderClass= loginData.class, dataProvider="loginData")
  public void loginTestDataDisplay(String username, String passwd, String browser, String version) {
	  System.out.println("Username    " + username);
      System.out.println("pwd        " + passwd);
      System.out.println("browser    " + browser);
      System.out.println("vrsn        " + version);  
  }
  
}
