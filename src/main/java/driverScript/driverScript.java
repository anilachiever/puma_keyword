package driverScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utils.Excel;
import utils.FunctionsLib;
import utils.propF;

public class driverScript {

	
	/*
	static WebDriver driver; 
	ExtentReports report;
	ExtentTest test;

	public static void ExecutionFlow() throws Throwable {


		Excel excel=new Excel();	
		
		String testSheet="VerifyingCart";
		String status = null;
		
		System.out.println(excel.rowCount("VerifyingCart"));
		
		for (int i = 1; i <excel.rowCount("VerifyingCart") ; i++) 
		
		{

			
			if (excel.getData("MainSheet", i, 2).equalsIgnoreCase("y"))
			{

		 
				
				testSheet=excel.getData("MainSheet", i, 1);
			
				

				for (int j = 1; j < excel.rowCount(testSheet); j++) {


					String desc    =excel.getData(testSheet, j, 0);
					String method  =excel.getData(testSheet, j, 1);
					String attrib  =excel.getData(testSheet, j, 2);
					String Value   =excel.getData(testSheet, j, 3);
					String data    =excel.getData(testSheet, j, 4);

					System.out.println(desc);
					
					try {
						
				
						//if(method.equalsIgnoreCase("OpenApplication")){
						//	FunctionsLib.OpenApplication(driver);

						//}
						if(method.equalsIgnoreCase("clickAction")){

							FunctionsLib.clickAction(driver, attrib, Value);
						}
				
						if(method.equalsIgnoreCase("typeAction")){

							FunctionsLib.typeAction(driver, attrib, Value, data);

						}
						if(method.equalsIgnoreCase("visibleElement")){
							FunctionsLib.visibleElement(driver, attrib, data);

						}
						if(method.equalsIgnoreCase("InvisibleElement")){

							FunctionsLib.InvisibleElement(driver, attrib, data);

						}
						if(method.equalsIgnoreCase("closeBrowser")){

							FunctionsLib.closeBrowser(driver);

						}
						
						if(method.equalsIgnoreCase("mouseHover")){

							FunctionsLib.mouseHover(driver, Value);

						}
				
				
						excel.setData(testSheet, j,5,"PASS");


						status  = "passed";
						}
					
			
					catch (Exception e) {

						excel.setData(testSheet, j, 5, "FAIL");
						status = "failed";

						}
					}


					if (status.equalsIgnoreCase("passed")) {

						//excel.setData("MainSheet", i, 3, "PASS");

						}
					else
						if(status.equalsIgnoreCase("failed")){
		
						//	excel.setData("MainSheet", i, 3, "FAIL");
						}		
			
				
					}
		else // (excel.getData(mainSheet, i, 2).equalsIgnoreCase("n"))
			{
				System.out.println("hi");
				
				excel.setData("MainSheet", i, 3, "Skipped");
		**
		*/
		
			}
				
			
				
		
		
		
				
	
		