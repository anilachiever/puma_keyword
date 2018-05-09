package utils;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionsLib {
		 

	public static void clickAction(WebDriver driver,String attr,String value) {
		
		if(attr.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(value)).click();
		}
		else
			if(attr.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(value)).click();
			}
			else
				if(attr.equalsIgnoreCase("xpath")) {
					driver.findElement(By.xpath(value)).click();
				}

		}
	
	public static void typeAction(WebDriver driver,String attr,String value,String data) {
		
		if(attr.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(value)).clear();
			driver.findElement(By.id(value)).sendKeys(data);
		}
		else
			if(attr.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(value)).clear();
				driver.findElement(By.name(value)).sendKeys(data);
			}
			else
				if(attr.equalsIgnoreCase("xpath")) {
					driver.findElement(By.xpath(value)).clear();
					driver.findElement(By.xpath(value)).sendKeys(data);
				}

		}

	public static void visibleElement(WebDriver driver,String xpathvalue,String time) {
		
		WebDriverWait wait=new WebDriverWait(driver, Integer.parseInt(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathvalue)));
		
	}
	
	public static void InvisibleElement(WebDriver driver,String xpathvalue,String time) throws Throwable {
		
		WebDriverWait wait=new WebDriverWait(driver,Integer.parseInt(time));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathvalue)));
		Thread.sleep(3000);
		
	}
	
	public static void closeBrowser(WebDriver driver) {

		driver.close();
	}

	public static void mouseHover(WebDriver driver,String xpathValue)
	{
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath(xpathValue)));
		
		act.build().perform();
		
	}

	public static void switchwindow(WebDriver driver)
	{
	
		String parentWin=driver.getWindowHandle();
		
		Set<String>  winList =driver.getWindowHandles();
	
		for (String x : winList) {
			
			if(x!=parentWin) {
				
				driver.switchTo().window(x);
				
			}
			
		}
		
		
		
		
	}
	

}
