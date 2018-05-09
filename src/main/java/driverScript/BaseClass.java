package driverScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import utils.propF;


public class BaseClass 

{
	public static  WebDriver driver;
	public WebElement signIn;
	public static ExtentReports report;
	public static ExtentTest log;


	public static void openBrowser() throws Throwable {

		report=new ExtentReports("./extreport.html",true);

		log=report.startTest("login and logout");

		System.setProperty("webdriver.chrome.driver","./jar/chromedriver");
		driver=new ChromeDriver();

		log.log(LogStatus.INFO	,"Browser Invoked");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(propF.getValue("url"));
		log.log(LogStatus.INFO	, " Application Opened");
		/*
		WebDriverWait wait=new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.invisibilityOf
				      (driver.findElement(By.xpath("//div[@class='pumaslider-loader']"))));

		log.log(LogStatus.INFO	, "page loadeded suucessfully");

		System.out.println("open browser completed ");
		 */

	}

	public static void closeBrowser() throws Throwable {

		report.endTest(log);
		report.flush();
		report.close();

		Thread.sleep(5000);
		driver.close();



	}

}
