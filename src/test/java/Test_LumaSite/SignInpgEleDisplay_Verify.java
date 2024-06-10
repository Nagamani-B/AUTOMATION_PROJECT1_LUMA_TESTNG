package Test_LumaSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInpgEleDisplay_Verify 
{
   
	WebDriver drv1=new FirefoxDriver();
    SignIn_WebElements signele=new SignIn_WebElements(drv1);
    

	@BeforeMethod
	public void openSignIn()
	{
				
		signele.Op_URL();
				
	}
	
	@Test(enabled=true)
	public void verifySignInlinkfunction_Test() 
	{
		
		signele.enteremail("nagamanibvr25@gmail.com");
		signele.enterpwd("Admin@456");
		signele.Clicksubmit();
		
	}
		
	@Test(enabled=true)
	public void verifyEmailTxtDisplay_Test()
	{
		signele.Displayemail();
		
	}
	
	@Test(enabled=true)
	public void verifyPasswordTxtDisplay_Test()
	{
		
		signele.Displaypwd();
	}
	
			
	@Test(enabled=true)
	public void verifyCrtActBtn_Test()
	{
		
		signele.DisplayCrtActBtn();
		
	}
	
	
		@AfterMethod
	
	   public void closedriver()
	   {
			
		   drv1.quit();
			
	   }
	

}
