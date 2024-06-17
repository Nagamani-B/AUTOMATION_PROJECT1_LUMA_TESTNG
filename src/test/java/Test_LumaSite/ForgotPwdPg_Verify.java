package Test_LumaSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POMElements_Luma.POMSignIn_WebElements;
public class ForgotPwdPg_Verify
{
	
	WebDriver drv1=new ChromeDriver();
    POMSignIn_WebElements signele=new POMSignIn_WebElements(drv1);
    
    
    @BeforeMethod
	public void openSignIn()
	{
    	drv1=new ChromeDriver();		
		signele.Op_URL();
				
	}
    @Test(enabled=true)
	public void verifyFrgtPwdLinkDisplay_Test()
	{
		
		signele.DisplayFrgtPwd();
	}
    
    @Test(enabled=true)
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
