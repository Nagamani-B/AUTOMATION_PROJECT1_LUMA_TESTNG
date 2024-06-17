package Test_LumaSite;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomenMenu_Verify
{
   WebDriver drvr;
   
   
   
    By emailTxtEle=By.id("email");
	By pwdTxtEle=By.id("pass");
	By submitBtn=By.name("send");
	By womenEl=By.cssSelector("a[id='ui-id-4'] span:nth-child(2)");
    By topsEl=By.xpath("//a[contains(text(),'Tops')]");   
    By botomsEl=By.xpath("//a[contains(text(),'Bottoms')]");
    
    By styleEle=By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[1]");
    By raincoatEle=By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[6]/a");
    By HoodeEle=By.xpath("//div[@class='block-content filter-content']//div[2]//div[2]//ol[1]//li[4]//a[1]");
    
    By LsizeEle=By.xpath("//*[@id='option-label-size-143-item-169']");
    By MsizeEl=By.xpath("//*[@id='option-label-size-143-item-168']");
    By CartBtnEle=By.xpath("//div[@class='actions-primary']/form/button/span");
    
    
    By CountCartEle=By.xpath("//a[@class='action showcart']/span[2] ");
    		
 
    @BeforeMethod
   public void setupURL()
   {
    	drvr=new ChromeDriver();
    	
	    drvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drvr.manage().window().maximize();
		drvr.manage().deleteAllCookies();
		drvr.get("https://magento.softwaretestingboard.com/");
		drvr.findElement(By.className("authorization-link")).click();
		drvr.findElement(emailTxtEle).sendKeys("nagamanibvr25@gmail.com");
		drvr.findElement(pwdTxtEle).sendKeys("Admin@456");
		drvr.findElement(submitBtn).click();
	   
		   
   }
   
   
   @Test(enabled =true)
   public void ClickWomen_Test() throws IOException
   {
	   
	   System.out.println("Executed ClickWomenTest");
	   
	   WebDriverWait wait = new WebDriverWait(drvr, Duration.ofSeconds(30));
       wait.until(ExpectedConditions.presenceOfElementLocated((By) womenEl));
	  
       WebElement womenEl1=drvr.findElement(womenEl);
	   boolean wmflag=womenEl1.isDisplayed();
		Assert.assertTrue(wmflag);
		womenEl1.click();
		
		TakesScreenshot ts=(TakesScreenshot)drvr;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:/SCREENSHOTS/ClickWomen_Test.PNG");
		FileUtils.copyFile(src, destination);
		
	     
		
   }
   
   


@Test(enabled=true)
   public void ClickWomenTops_Test() throws IOException
   {
	   //Women tab click
	    drvr.findElement(womenEl).click();
	    //tops tab
	      
		WebDriverWait wait = new WebDriverWait(drvr, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.presenceOfElementLocated((By) topsEl));
        drvr.findElement(topsEl).click();
        TakesScreenshot ts=(TakesScreenshot)drvr;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:/SCREENSHOTS/ClickWomenTops_Test.PNG");
		FileUtils.copyFile(src, destination);
 	      
   }
   
   @Test(enabled=true)
   public void ClickWomenBottoms_Test() throws IOException
   {
	   drvr.findElement(womenEl).click();
	   //bottoms click
	   WebDriverWait wait = new WebDriverWait(drvr, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.presenceOfElementLocated((By) botomsEl));
       drvr.findElement(botomsEl).click();
       TakesScreenshot ts=(TakesScreenshot)drvr;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:/SCREENSHOTS/ClickWomenBottoms_Test.PNG");
		FileUtils.copyFile(src, destination);
	      
	   
   }
   
   @Test(enabled=true)
   public void ClickWmTopRaincoat_Test()
   {
	   drvr.findElement(womenEl).click();
	   //bottoms click
	   WebDriverWait wait = new WebDriverWait(drvr, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.presenceOfElementLocated((By) topsEl));
       drvr.findElement(topsEl).click();
       drvr.findElement(styleEle).click();
       drvr.findElement(raincoatEle).click();
       drvr.findElement(LsizeEle).click();
       drvr.findElement(CartBtnEle).click();
         
    
       
   }
   @Test (enabled=true)
   public void CountOFAddtoCart_Verify_Test()
   {
	   drvr.findElement(womenEl).click();
	   //bottoms click
	   WebDriverWait wait = new WebDriverWait(drvr, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.presenceOfElementLocated((By) topsEl));
       drvr.findElement(topsEl).click();
       drvr.findElement(styleEle).click();
       drvr.findElement(HoodeEle).click();
       drvr.findElement(MsizeEl).click();
       drvr.findElement(CartBtnEle).click();
       String Count=drvr.findElement(CountCartEle).getText();
       System.out.println("Count value : "+ Count);
       
	   
   }
   
   
   @AfterMethod
   public void tearDown()
   {
	   drvr.quit();
   }
   

   
   
}
