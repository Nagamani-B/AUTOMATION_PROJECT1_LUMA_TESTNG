package Test_LumaSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homepage_verify 
{
	WebDriver drv;
	
	@BeforeMethod
	public void openURL()
	{
		drv=new FirefoxDriver();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		drv.manage().window().maximize();
		drv.manage().deleteAllCookies();
		drv.get("https://magento.softwaretestingboard.com/");
	}
	@Test(priority=1)
	public void verifyPageTitle_Test()
	{
		String title=drv.getTitle();
		System.out.println("Page Title: "+ title);
		Assert.assertEquals(title, "Home Page");
	}
	
	@Test(priority=2)
	public void VerifyLogoDisplay_Test()
	{
		boolean flag=drv.findElement(By.xpath("//*[@class='logo']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void verifySignInlinkDisplay_Test()
	{
		WebElement signInEle=drv.findElement(By.className("authorization-link"));
		boolean signflag=signInEle.isDisplayed();
		Assert.assertTrue(signflag);
		signInEle.click();
				
	}
				
	@Test(priority=4)
	
	public void verifyCreateAccountDisplay_Test()
	{
		WebElement crtEle=drv.findElement(By.xpath("//ul[@class='header links']/li[3]/a"));
		boolean crlink=crtEle.isDisplayed();
		Assert.assertTrue(crlink);
		crtEle.click();
	}
	
	@Test(priority=5)
	public void verifySearchboxDisplay_Test()
	{
		WebElement searchEle=drv.findElement(By.id("search"));
		boolean Searchlink=searchEle.isDisplayed();
		Assert.assertTrue(Searchlink);
		searchEle.sendKeys("Tops");
	}
	
		@AfterMethod
	
   public void closeDriver()
   {
	   drv.quit();
   }
}
