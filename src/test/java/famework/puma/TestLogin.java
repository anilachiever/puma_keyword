package famework.puma;



import org.testng.annotations.Test;

import driverScript.BaseClass;
import utils.Excel;
import utils.FunctionsLib;

@Test
public class TestLogin extends BaseClass{

	
	public void Logintest() throws Throwable {
	
		Excel excel=new Excel();
		
		String sheet="VerifyingCart";
		
		for (int i = 1; i <= excel.rowCount(sheet); i++) {	
			
			
			String desc= excel.getData(sheet, i, 0);
			
			String method=excel.getData(sheet, i, 1);
		
			String attr=excel.getData(sheet, i, 2);
		
			String value=excel.getData(sheet, i, 3);
		
			String data=excel.getData(sheet, i, 4);
			
			System.out.println(data);
			
			if(method.equalsIgnoreCase("openBrowser"))
			{
				BaseClass.openBrowser();
				
			}
		
			if(method.equalsIgnoreCase("InvisibleElement"))
			{
				FunctionsLib.InvisibleElement(driver, value, data);
				
			}
			
			
			if (method.equalsIgnoreCase("closeBrowser")) {
				BaseClass.closeBrowser();
				
			}
			
			if (method.equalsIgnoreCase("mouseHover")) {
				
				FunctionsLib.mouseHover(driver, value);
			}
			
			
			if (method.equalsIgnoreCase("clickAction")) {
				
				FunctionsLib.clickAction(driver, attr, value);
				
			}
			
			
			if (method.equalsIgnoreCase("switchwindow")) {
				
				FunctionsLib.switchwindow(driver);
			}
			
			
			
			
		}
			
		
	}

}
