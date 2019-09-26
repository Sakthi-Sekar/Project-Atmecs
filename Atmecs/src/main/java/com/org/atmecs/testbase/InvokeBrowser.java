package com.org.atmecs.testbase;

import java.io.IOException;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.org.atmecs.reports.LogReports;
import com.org.atmecs.utils.ReadPropertiesFile;
import com.org.atmecs.utils.ValidateTestResult;
import com.org.atmecs.constants.*;

public class InvokeBrowser {
	public LogReports log = new LogReports();
	public static WebDriver driver;
	Properties config = new Properties();
	protected ReadPropertiesFile read = new ReadPropertiesFile();
	protected String Xpath;
	protected ValidateTestResult validate = new ValidateTestResult();

//To invoke the chrome browser by practo URL
	@Test(priority = 1)
	public void setup() throws IOException {

		System.setProperty("webdriver.chrome.driver", ConstantPaths.CHROME_FILE);

		driver = new ChromeDriver();
		log.info("Chrome browser invoked...");
		driver.get(read.readPropertiesFile("url"));
		log.info("Application opened...");
		driver.manage().window().maximize();

	}
}