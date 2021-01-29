package com.browserstack.run_local_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;


public class LocalTest extends BrowserStackTestNGTest {

  @Test
  public void test() throws Exception {
	  IOSElement textButton = (IOSElement) new WebDriverWait(driver, 90).until(
		        ExpectedConditions.elementToBeClickable(MobileBy.name("HTTP")));
		    textButton.click();
		    Thread.sleep(5000);
		    IOSElement inputField = (IOSElement) new WebDriverWait(driver, 90).until(
			        ExpectedConditions.elementToBeClickable(MobileBy.name("navigation bar")));
		    inputField.sendKeys("http://bs-local.com/MAMP/?language=English");
		    Thread.sleep(5000);
			    IOSElement GoButton = (IOSElement) new WebDriverWait(driver, 90).until(
				        ExpectedConditions.elementToBeClickable(MobileBy.name("Go")));
				    GoButton.click();
				    Thread.sleep(50000);
		    
	 File scrFile = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Thread.sleep(50000);
	    
     
  
    }

  }

