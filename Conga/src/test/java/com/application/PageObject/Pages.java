package com.application.PageObject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import com.application.TestCase.BaseClass;

import junit.framework.Assert;

public class Pages {
	WebDriver driver;
	WebDriverWait wait;
	Properties prop=new Properties();
	
	public Pages(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;
	
	PageFactory.initElements(driver,this);
	}	
	@FindBy(css = ".login")
	WebElement clickSignIn;	
	
	@FindBy(css = "#email")
	WebElement userId;
	
	@FindBy(css = "#passwd")
	WebElement password;
	
	@FindBy(css = "#SubmitLogin")
	WebElement SubmitLogin;
	
	@FindBy(linkText = "http://automationpractice.com/index.php?id_category=5&controller=category")
	WebElement linkText;
	
	@FindBy(className = "button ajax_add_to_cart_button btn btn-default")
	WebElement addToCart;
	

	@FindBy(linkText ="http://automationpractice.com/index.php?controller=order")
	WebElement checkout;
	
	@FindBy(xpath ="//*[text()='Faded Short Sleeve T-shirts']")
	WebElement description;
	
	
	public void login() {
		clickSignIn.click();
		userId.sendKeys("jetblue@grr.la");
		password.sendKeys("jetblue");
		SubmitLogin.click();
		
	}
	public void selectTShrits() throws InterruptedException {
		Thread.sleep(2000);
		linkText.click();
		Thread.sleep(2000);
		addToCart.click();
		Thread.sleep(2000);
		checkout.click();
		
	}
	public void assertion() {
		String valu=description.getText();
		Assert.assertEquals(valu, "aded Short Sleeve T-shirts");
		
		
	}
	}


