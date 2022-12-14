package com.ecommerceDomain.Wipro.PomPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	public WebElement getCoursedd() {
		return coursedd;
	}
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getcoursebtn() {
		return coursebtn;
	}
	
	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}
	
	public AddToCartPage course(WebDriver driver)
	{
		seleniumtraining.click();
		return new AddToCartPage(driver);
		}
	}
