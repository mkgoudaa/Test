package com.application.TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.application.PageObject.Pages;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	Properties prop=new Properties();
	Pages page;
	@BeforeClass()
public void beforeTest() throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://Automationpractice.com/");
	
	
	
	page=new Pages(driver,wait);
	
}

}
