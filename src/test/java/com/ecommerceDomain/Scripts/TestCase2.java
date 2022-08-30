package com.ecommerceDomain.Scripts;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;


import com.ecommerceDomain.Wipro.PomPages.ContactUsPage;
import com.ecommerceDomain.Wipro.PomPages.LoginPage;

import genericLib.BaseClass;

//public class TestCase2 extends Demo{
public class TestCase2 extends BaseClass{
	
	
@Test(dataProvider="readExceldata")
public void testcase2(String name,String mail,String subject,String message) throws InterruptedException  {
	
	test = reports.createTest("testcase2");
	
	LoginPage lp=new LoginPage(driver);
	lp.Acceptbtn();
	Thread.sleep(3000);
	//lp.getAcceptbtn();
	Point loc = lp.getContactusbtn().getLocation();
	int x = loc.getX();
	int y = loc.getY();
	utilities.scrollBar(driver, x, y);
	//Thread.sleep(5000);
    ContactUsPage cp=lp.contactus(driver);
    cp.sendDetails(name, mail, subject,message, message);
    Thread.sleep(5000);
	}
}
