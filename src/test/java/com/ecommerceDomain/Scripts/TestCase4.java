package com.ecommerceDomain.Scripts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ecommerceDomain.Wipro.PomPages.LoginPage;
import com.ecommerceDomain.Wipro.PomPages.SkillraryDemoLoginPage;
import com.ecommerceDomain.Wipro.PomPages.Testing;


import genericLib.BaseClass;
public class TestCase4 extends BaseClass{
@Test
	public void testcase4() throws SQLException, FileNotFoundException, IOException {
		test=reports.createTest("testcase4");
		LoginPage l=new LoginPage(driver);
		SkillraryDemoLoginPage s=l.demoApp(driver);
		utilities.switchTabs(driver);
		utilities.dropdown(s.getCoursedd(),fu.getPropertyFile("dropdown"));
		Testing t=new Testing(driver);
		String query="select * from course";
		String data = fu.queryExecution(query,1,"INR 19.00");
		
	}
}
