package com.ecommerceDomain.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerceDomain.Wipro.PomPages.CoreJavaPage;
import com.ecommerceDomain.Wipro.PomPages.LoginPage;
import com.ecommerceDomain.Wipro.PomPages.WishlistPage;

import genericLib.BaseClass;

public class TestCase3 extends BaseClass {
@Test
public void testcase3() throws FileNotFoundException, IOException {
	test=reports.createTest("testcase3");
	LoginPage lp=new LoginPage(driver);
CoreJavaPage c=lp.searchcourse(driver,fu.getPropertyFile("cn"));
			WishlistPage ad=c.corejavaselenium(driver);
	utilities.switchframe(driver);
	ad.playvideo();
	utilities.switchBackFrame(driver);
	ad.addtowishlist();
Assert.assertEquals(driver.getTitle(),fu.getPropertyFile("title"));
}
}
