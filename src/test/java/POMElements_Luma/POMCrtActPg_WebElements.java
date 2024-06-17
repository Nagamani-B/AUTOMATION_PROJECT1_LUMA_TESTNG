
package POMElements_Luma;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class POMCrtActPg_WebElements
{
	WebDriver drv;
	
	public POMCrtActPg_WebElements(WebDriver drv)
	{
		this.drv=drv;
	}
	
	public void Launch_URL()
	{
		
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drv.manage().window().maximize();
		drv.manage().deleteAllCookies();
		drv.get("https://magento.softwaretestingboard.com/");
		
		
	}
	
	By crtactlinkEle=By.xpath("//ul[@class='header links']/li[3]/a");
    By crtfnametxtEle=By.id("firstname");
    By crtlnametxtEle=By.id("lastname");
    By crtEmltxtEle=By.xpath("//input[@id='email_address']");
    By crtPwdtxtEle=By.xpath("//input[@id='password']");
    By crtcnfPwdtxtEle=By.id("password-confirmation");
    By crtActBtnEle=By.xpath("//button[@class='action submit primary']");
    
    
    By fnameErele=By.xpath("//div[@id='firstname-error']");
    By lnameErEle=By.xpath("//div[@id='lastname-error']");
    By EmlErEle=By.xpath("//div[@id='email_address-error']");
    By pwdErEle=By.xpath("//div[@id='password-error']");
    By CnfpwdEle=By.xpath("//div[@id='password-confirmation-error']");
    		
    
    
    
   public void Click_CrtActLink()
   {
	   drv.findElement(crtactlinkEle).click();
   }
        
    public void Enterfname(String fn)
    {
       	drv.findElement(crtfnametxtEle).sendKeys(fn);
    }
    
    public void Enterlname(String ln)
    {
    	drv.findElement(crtlnametxtEle).sendKeys(ln);
    }
    
    public void EnterEml(String eml)
    {
    	drv.findElement(crtEmltxtEle).sendKeys(eml);
    }
    
    public void EnterPwd(String pwd)
     {
    	drv.findElement(crtPwdtxtEle).sendKeys(pwd);
     }
    public void EnterCnfPwd(String cnf)
    {
    	drv.findElement(crtcnfPwdtxtEle).sendKeys(cnf);
    }
    
	public void ClickCrtActbtn()
	{
		drv.findElement(crtActBtnEle).click();
	}
	
	public void VerifyFnameErMsg()
	{
		boolean Fnameflag=drv.findElement(fnameErele).isDisplayed();
		Assert.assertTrue(Fnameflag);
		String FnameErrTxt=drv.findElement(fnameErele).getText();
		System.out.println(FnameErrTxt);
		Assert.assertEquals(FnameErrTxt,"This is a required field." );
		
	}
	
	public void VerifyLnameErMsg()
	{
		boolean Lnameflag=drv.findElement(lnameErEle).isDisplayed();
		Assert.assertTrue(Lnameflag);
		String LnameErrmsg=drv.findElement(lnameErEle).getText();
		System.out.println(LnameErrmsg);
		Assert.assertEquals(LnameErrmsg,"This is a required field." );
	}
	
	public void VerifyEmlErMsg()
	{
		boolean Emlflag=drv.findElement(EmlErEle).isDisplayed();
		Assert.assertTrue(Emlflag);
		String EmlErrmsg=drv.findElement(EmlErEle).getText();
		System.out.println(EmlErrmsg);
		Assert.assertEquals(EmlErrmsg,"This is a required field." );
	}
	public void VerifyPwdErMsg()
	{
		boolean Pwdflag=drv.findElement(pwdErEle).isDisplayed();
		Assert.assertTrue(Pwdflag);
		String PwdErrmsg=drv.findElement(pwdErEle).getText();
		System.out.println(PwdErrmsg);
		Assert.assertEquals(PwdErrmsg,"This is a required field." );
	}
	public void VerifyCnfPwdErMsg()
	{
		boolean cnfpwdflag=drv.findElement(CnfpwdEle).isDisplayed();
		Assert.assertTrue(cnfpwdflag);
		String cnfErrmsg=drv.findElement(CnfpwdEle).getText();
		System.out.println(cnfErrmsg);
		Assert.assertEquals(cnfErrmsg,"This is a required field." );
	}
	
	
	
	
	
	
	
	
}
