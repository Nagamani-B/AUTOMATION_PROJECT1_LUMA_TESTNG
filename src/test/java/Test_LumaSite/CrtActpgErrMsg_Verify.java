package Test_LumaSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import POMElements_Luma.POMCrtActPg_WebElements;


public class CrtActpgErrMsg_Verify
{
	
	WebDriver drv=new ChromeDriver();
	
	POMCrtActPg_WebElements crtpgEle=new POMCrtActPg_WebElements(drv); 
	
	
	@BeforeMethod
	public void setup() 
	{
		drv=new ChromeDriver();
        crtpgEle.Launch_URL();
        //Thread.sleep(3000);
        crtpgEle.Click_CrtActLink();
        
	}
	
	@Test(enabled=true)
	public void Verify_FnameErmsg_Test()
	{
		//crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname(" ");
		crtpgEle.Enterlname("S");
		crtpgEle.EnterEml("xyz@gmail.com ");
		crtpgEle.EnterPwd("pkr@1234");
		crtpgEle.EnterCnfPwd("pkr@1234");
		
		crtpgEle.ClickCrtActbtn();
		crtpgEle.VerifyFnameErMsg();
	}  
	
	@Test(enabled=true)
	public void Verify_LstnameErmsg_Test()
	{
		//crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname("abc ");
		crtpgEle.Enterlname(" ");
		crtpgEle.EnterEml("xyz@gmail.com ");
		crtpgEle.EnterPwd("pkr@123 ");
		crtpgEle.EnterCnfPwd("pkr@123 ");
		
		crtpgEle.ClickCrtActbtn();
		crtpgEle.VerifyLnameErMsg();
	}
	
	@Test(enabled=true)
	public void Verify_EmlErmsg_Test()
	{
		//crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname("abc ");
		crtpgEle.Enterlname("s");
		crtpgEle.EnterEml(" ");
		crtpgEle.EnterPwd("pkr@123 ");
		crtpgEle.EnterCnfPwd("pkr@123 ");
		
		crtpgEle.ClickCrtActbtn();
		crtpgEle.VerifyEmlErMsg();
	}
	
	@Test(enabled=true)
	public void Verify_PwdErmsg_Test()
	{
		//crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname("abc ");
		crtpgEle.Enterlname("S");
		crtpgEle.EnterEml("xyz@gmail.com ");
		crtpgEle.EnterPwd(" ");
		crtpgEle.EnterCnfPwd("pkr@123 ");
		crtpgEle.ClickCrtActbtn();
		crtpgEle.VerifyPwdErMsg();
	}
	
	@Test(enabled=true)
	public void Verify_CnfPwdErmsg_Test()
	{
		//crtpgEle.Click_CrtActLink();
		crtpgEle.Enterfname("abc ");
		crtpgEle.Enterlname("S");
		crtpgEle.EnterEml("xyz@gmail.com ");
		crtpgEle.EnterPwd("pkr@123 ");
		crtpgEle.EnterCnfPwd(" ");
		
		crtpgEle.ClickCrtActbtn();
		crtpgEle.VerifyCnfPwdErMsg();
	}
	
	@Test(enabled=true)
	public void Verify_AllTxtErmsg_Test()
	{
		//crtpgEle.Click_CrtActLink();
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
