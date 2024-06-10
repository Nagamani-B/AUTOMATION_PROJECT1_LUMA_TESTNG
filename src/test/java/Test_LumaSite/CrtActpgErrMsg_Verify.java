package Test_LumaSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrtActpgErrMsg_Verify
{
	
	WebDriver drv=new FirefoxDriver();
	CrtActPage_WebElements crtpgEle=new CrtActPage_WebElements(drv);
	
	
	@BeforeMethod
	public void setup()
	{
        crtpgEle.Launch_URL();		
	}
	
	@Test
	public void Verify_FnameErmsg_Test()
	{
		crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname(" ");
		crtpgEle.Enterlname("S");
		crtpgEle.EnterEml("xyz@gmail.com ");
		crtpgEle.EnterPwd("pkr@1234");
		crtpgEle.EnterCnfPwd("pkr@1234");
		
		crtpgEle.ClickCrtActbtn();
		crtpgEle.VerifyFnameErMsg();
	}  
	
	@Test
	public void Verify_LstnameErmsg_Test()
	{
		crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname("abc ");
		crtpgEle.Enterlname(" ");
		crtpgEle.EnterEml("xyz@gmail.com ");
		crtpgEle.EnterPwd("pkr@123 ");
		crtpgEle.EnterCnfPwd("pkr@123 ");
		
		crtpgEle.ClickCrtActbtn();
		crtpgEle.VerifyLnameErMsg();
	}
	
	@Test
	public void Verify_EmlErmsg_Test()
	{
		crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname("abc ");
		crtpgEle.Enterlname("s");
		crtpgEle.EnterEml(" ");
		crtpgEle.EnterPwd("pkr@123 ");
		crtpgEle.EnterCnfPwd("pkr@123 ");
		
		crtpgEle.ClickCrtActbtn();
		crtpgEle.VerifyEmlErMsg();
	}
	
	@Test
	public void Verify_PwdErmsg_Test()
	{
		crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname("abc ");
		crtpgEle.Enterlname("S");
		crtpgEle.EnterEml("xyz@gmail.com ");
		crtpgEle.EnterPwd(" ");
		crtpgEle.EnterCnfPwd("pkr@123 ");
		
		crtpgEle.ClickCrtActbtn();
		crtpgEle.VerifyPwdErMsg();
	}
	
	@Test
	public void Verify_CnfPwdErmsg_Test()
	{
		crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname("abc ");
		crtpgEle.Enterlname("S");
		crtpgEle.EnterEml("xyz@gmail.com ");
		crtpgEle.EnterPwd("pkr@123 ");
		crtpgEle.EnterCnfPwd(" ");
		
		crtpgEle.ClickCrtActbtn();
		crtpgEle.VerifyCnfPwdErMsg();
	}
	
	@Test
	public void Verify_AllTxtErmsg_Test()
	{
		crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname(" ");
		crtpgEle.Enterlname(" ");
		crtpgEle.EnterEml(" ");
		crtpgEle.EnterPwd(" ");
		crtpgEle.EnterCnfPwd(" ");
		
		crtpgEle.ClickCrtActbtn();
		
		crtpgEle.VerifyFnameErMsg();
		crtpgEle.VerifyLnameErMsg();
		crtpgEle.VerifyEmlErMsg();
		crtpgEle.VerifyPwdErMsg();
		crtpgEle.VerifyCnfPwdErMsg();
			
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		drv.quit();
               
	
	}
}
