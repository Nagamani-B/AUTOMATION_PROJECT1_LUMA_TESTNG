package Test_LumaSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPwdPg_Verify
{
	
	WebDriver drv1=new FirefoxDriver();
    SignIn_WebElements signele=new SignIn_WebElements(drv1);
    
    
    @BeforeMethod
	public void openSignIn()
	{
				
		signele.Op_URL();
				
	}
    @Test(enabled=false)
	public void verifyFrgtPwdLinkDisplay_Test()
	{
		
		signele.DisplayFrgtPwd();
	}
    
    @Test(enabled=false)
	public void verifyFrgtPwdFunction_Test()
	{
		signele.ClickFrgtpwd();
		signele.DisplayFrgtEmlTxt();
		signele.DisplayResetEmailBtn();
		
	}
    @Test(enabled=true)
	public void verifyResetpwdfunction_Test()
	{
		signele.ClickFrgtpwd();
		signele.EnterEmlBlank_RstPwd();
		signele.ClickResetpwd();
		signele.DisplayErrMsg_ResetPwd();
			
	}
    
    @AfterMethod
	
	   public void closedriver()
	   {
			
		   drv1.quit();
			
	   }
	

}
