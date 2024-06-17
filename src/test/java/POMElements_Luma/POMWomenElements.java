package POMElements_Luma;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class POMWomenElements 
{
	WebDriver drvr;
	
	By womenTabEle=By.cssSelector("a[id='ui-id-4'] span:nth-child(2)");
	 By topsEl=By.xpath("//a[contains(text(),'Tops')]");   
	    By botomsEl=By.xpath("//a[contains(text(),'Bottoms')]");
	
	public POMWomenElements(WebDriver drv)
	{
		this.drvr=drv;
	
	}
	
	public void Display_WomenTab()
	{
		WebDriverWait wait = new WebDriverWait(drvr, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.presenceOfElementLocated((By) womenTabEle));
		
		boolean wmflag=drvr.findElement(womenTabEle).isDisplayed();
		Assert.assertTrue(wmflag);
		drvr.findElement(womenTabEle).click();
	}
	
	public void Click_WomenTab()
	{
		drvr.findElement(womenTabEle).click();
	}
	
	public void Click_WmnTops()
	{
		WebDriverWait wait = new WebDriverWait(drvr, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.presenceOfElementLocated((By) topsEl));
        drvr.findElement(topsEl).click();
	}
	
	public void Click_WoMensBottoms()
	{
		WebDriverWait wait = new WebDriverWait(drvr, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.presenceOfElementLocated((By) botomsEl));
        drvr.findElement(botomsEl).click();
	}
	
	
	
	
	
	
	
}
