package Test_LumaSite;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SignIn_WebElements 
{
	
	WebDriver drv;
	
	public SignIn_WebElements(WebDriver drv1)
	{
		this.drv=drv1;
	}
	
	public void Op_URL()
	{
		drv=new FirefoxDriver();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drv.manage().window().maximize();
		drv.manage().deleteAllCookies();
		drv.get("https://magento.softwaretestingboard.com/");
		drv.findElement(By.className("authorization-link")).click();
		
	}
	//Repository of By class
	
	By signlinkEle=By.className("authorization-link");
	By emailTxtEle=By.id("email");
	By pwdTxtEle=By.id("pass");
	By submitBtn=By.name("send");
	
	By ErmsgemlEle=By.xpath("//*[@id='email-error']");
	By ErmsgpwdEle=By.xpath("//*[@id='pass-error']");
	
	By fgpwdBtn=By.xpath("//span[contains(text(),'Forgot Your Password?')]");	
	By crtactBtn=By.xpath("//span[contains(text(),'Create an Account')]");
	By rstpwdBtn=By.xpath("//span[contains(text(),'Reset My Password')]");
	By resetemailtxt=By.id("email_address");
	
	
	
	By ErrMsgResetPwd=By.xpath("//div[@for='email_address']");
	
	
	public void enteremail(String eml)
	{
		drv.findElement(emailTxtEle).sendKeys(eml);
	}
	public void enterpwd(String pwd)
	{
		drv.findElement(pwdTxtEle).sendKeys(pwd);
		
	}
	
    public void Clicksubmit()
    {
    	drv.findElement(submitBtn).click();
    	
    }
    
    
    
    public void Displayemail()
    {
    	boolean emlflag=drv.findElement(emailTxtEle).isDisplayed();
    	Assert.assertTrue(emlflag);
    }
    
    public void Displaypwd()
    {
    	boolean pwdflag=drv.findElement(pwdTxtEle).isDisplayed();
    	Assert.assertTrue(pwdflag);
    }
    
    public void DisplayFrgtPwd()
    {
    	boolean fgtflag=drv.findElement(fgpwdBtn).isDisplayed();
	     Assert.assertTrue(fgtflag);	
		
    }
    
    public void ClickFrgtpwd()
    {
    	drv.findElement(fgpwdBtn).click();
    }
    
    public void DisplayCrtActBtn()
    {
    	boolean crtEleflag=drv.findElement(crtactBtn).isDisplayed();
		Assert.assertTrue(crtEleflag);	
		
    }
    
    public void DisplayFrgtEmlTxt()
    {
    	boolean frgemlflag=drv.findElement(resetemailtxt).isDisplayed();
		Assert.assertTrue(frgemlflag);
    }
    public void DisplayResetEmailBtn()
    {
    	 boolean rstemlflag=drv.findElement(rstpwdBtn).isDisplayed();
		Assert.assertTrue(rstemlflag);
    	
    }
    public void ClickResetpwd()
    {
    	drv.findElement(rstpwdBtn).click();
    }
   
    public void DisplayErrMsg_ResetPwd()
    {
    	boolean errmsgflag=drv.findElement(ErrMsgResetPwd).isDisplayed();
    	Assert.assertTrue(errmsgflag);
    	
    	String errmsg=drv.findElement(ErrMsgResetPwd).getText();
		Assert.assertEquals(errmsg, "This is a required field.");
    }
    
    public void EnterEmlBlank_RstPwd()
    {
    	drv.findElement(resetemailtxt).sendKeys(" ");
    }

    public void ErrMsgEmlBlank()
    {
    	boolean errmsgemlflag=drv.findElement(ErmsgemlEle).isDisplayed();
    	Assert.assertTrue(errmsgemlflag);
    	String errmsgEml=drv.findElement(ErmsgemlEle).getText();
    	Assert.assertEquals(errmsgEml, "This is a required field.");
    }
    
    public void ErrMsgPwdBlank()
    {
    	boolean errmsgpwdflag=drv.findElement(ErmsgpwdEle).isDisplayed();
    	Assert.assertTrue(errmsgpwdflag);
    	String errmsgpwd=drv.findElement(ErmsgpwdEle).getText();
    	Assert.assertEquals(errmsgpwd, "This is a required field.");
    }
    
    public void ErrMsgEmlPwdBlank()
    {
    	String errmsgEml=drv.findElement(ErmsgemlEle).getText();
    	Assert.assertEquals(errmsgEml, "This is a required field.");
    	String errmsgpwd=drv.findElement(ErmsgpwdEle).getText();
    	Assert.assertEquals(errmsgpwd, "This is a required field.");
    	
    }
	
}
