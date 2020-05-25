package pageObjects;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import com.apm.one.Base;

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
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		
		  HomePage h = new HomePage(driver);
		  
		  h.Preference.click();
		  
		  Preference p = new Preference(driver);
		  
		  p.dependencies.click();
		 

		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		//driver.findElementsByClassName("android.widget.Button").get(1).click();
		p.buttons.get(1).click();
		
		System.out.println("Test Done!!!");
	}

}
