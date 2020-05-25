package com.apm.one;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce2 extends EcomBase{
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath, id, classname,androidUIautomator
		// Syntax for Xpath //tagname(@attribute='value')
		//driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");

		  //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     

		   //  driver.findElement(By.xpath("//*[@text='India']")).click();

		   //  driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

		    // driver.hideKeyboard();

		     driver.findElement(By.xpath("//*[@text='Female']")).click();

		     //driver.findElement(By.id("android:id/text1")).click();
		     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		     
		     String toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		     
		     System.out.println(toastMessage);
		     Assert.assertEquals(toastMessage, "Please enter your name");
		    
	}

}
