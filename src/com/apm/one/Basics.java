package com.apm.one;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//xpath, id, classname,androidUIautomator
		// Syntax for Xpath //tagname(@attribute='value')
		//
		//
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/widget_frame").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click(); //By Me
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		//android.widget.RelativeLayout("")
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").clear();
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("Click On Cancel");
		driver.findElementsByClassName("android.widget.Button").get(0).click();
	}

}
