package com.apm.one;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce4_1 extends EcomBase{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath, id, classname,androidUIautomator
		// Syntax for Xpath //tagname(@attribute='value')
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(5000);
		
		String amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
//120.0
		amount1 = amount1.substring(1);
		double amount1Value = Double.parseDouble(amount1);
		System.out.println(amount1Value);
		
		
		  String amount2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText(); 
//120.23
		  amount2 = amount2.substring(1); 
		  double amount2Value = Double.parseDouble(amount2); 
		  System.out.println(amount2Value);
		  double totalAmount = amount1Value + amount2Value;
		  
		  System.out.println(totalAmount);
		  
		  String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText(); 
		  total = total.substring(1);
		  double totalValue = Double.parseDouble(total); 
		  System.out.println(totalValue);
		 
		  try {
			  Assert.assertEquals(totalAmount, totalValue);
			} catch (AssertionError e) {
			    System.out.println("Not equal");
			    throw e;
			}
			System.out.println("Equal");
		 
		 
		
		

	}

}
