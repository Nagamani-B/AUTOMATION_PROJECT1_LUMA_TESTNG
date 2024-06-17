package Test_LumaSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMElements_Luma.POMSignIn_WebElements;

public class SignInpgErrMsg_Verify
{
  WebDriver drv=new ChromeDriver();
  POMSignIn_WebElements signele=new POMSignIn_WebElements(drv);
  
  @BeforeMethod
    public void setup()
  {
	  drv=new ChromeDriver();
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
  
  @Test(enabled=true)
  public void Verify_PwdErrorMsg_Test()
  {
	  signele.enteremail("nagamanibvr25@gmail.com");
	  signele.enterpwd("");
	  signele.Clicksubmit();
	  signele.ErrMsgPwdBlank();
	  
  }
  
  @Test(enabled=true)
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
