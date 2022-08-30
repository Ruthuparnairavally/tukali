package com.ecommerceDomain.Scripts;
import org.testng.annotations.Test;
import com.ecommerceDomain.Wipro.PomPages.AddToCartPage;
import com.ecommerceDomain.Wipro.PomPages.LoginPage;
import com.ecommerceDomain.Wipro.PomPages.SkillraryDemoLoginPage;

import genericLib.BaseClass;

public class TestCase1 extends BaseClass{
@Test
	public void testcase1() {
		test=reports.createTest("testcase1");
		LoginPage l=new LoginPage(driver);
		SkillraryDemoLoginPage s=l.demoApp(driver);
		utilities.switchTabs(driver);
		utilities.mouseHover(driver,s.getcoursebtn());
		AddToCartPage cart=s.course(driver);
		utilities.doubleclick(driver, cart.getAddbtn());
		cart.getAddtocartbtn().click();
		utilities.alertPopupok(driver);
		driver.quit();
	}
}
