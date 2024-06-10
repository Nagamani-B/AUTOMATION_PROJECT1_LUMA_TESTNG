package Test_LumaSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInpgErrMsg_Verify
{
  WebDriver drv=new FirefoxDriver();
  SignIn_WebElements signele=new SignIn_WebElements(drv);
  
  @BeforeMethod
    public void setup()
  {
	  signele.Op_URL();
  }
  
  
  @Test(enabled=true)
  public void Verify_EmailErrorMsg_Test()
  {
	  signele.enteremail("");
	  signele.enterpwd("Admin@456");
	  signele.Clicksubmit();
	  signele.ErrMsgEmlBlank();
	  
  }
  
  @Test(enabled=false)
  public void Verify_PwdErrorMsg_Test()
  {
	  signele.enteremail("nagamanibvr25@gmail.com");
	  signele.enterpwd("");
	  signele.Clicksubmit();
	  signele.ErrMsgPwdBlank();
	  
  }
  
  @Test(enabled=false)
  public void Verify_EmlPwdErMsg_Test()
  {
	  signele.enteremail("");
	  signele.enterpwd("");
	  signele.Clicksubmit();
	  signele.ErrMsgEmlPwdBlank();
	  
	  
  }
   
  
  @AfterMethod
  public void close_driver()
  {
	  drv.quit();
  }
  
  
}
