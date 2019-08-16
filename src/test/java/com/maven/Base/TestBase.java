package com.maven.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	@BeforeClass
	public static void testSetup() throws IOException
		{			
		log=Logger.getLogger("TestBase");
		PropertyConfigurator.configure("log4j.properties");
	
		File f=new File("F://WorkSpace//Project//src//test//java//com//maven//Configuration//config.properties");
		FileInputStream fs=new FileInputStream(f);
		prop=new Properties();
		prop.load(fs);
	if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "F://WorkSpace//Project//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("baseURL"));
		log.info("browser launched in  ----"+prop.getProperty("browser"));
	
		 
	 	}
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", "F://WorkSpace//Project//Drivers//geckodriver.exe");
		driver=new FirefoxDriver();						
		driver.get(prop.getProperty("baseURL"));
		log.info("browser launched in  ----"+prop.getProperty("browser"));
		}
		}
	
	@AfterClass
	public static void testTearDown()
		{
		driver.quit();
		log.info("browser closed successfully");
		}

}
