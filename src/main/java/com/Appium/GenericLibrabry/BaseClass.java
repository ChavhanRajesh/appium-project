package com.Appium.GenericLibrabry;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	public AndroidDriver driver;
@BeforeClass
	public void LouchApp() throws MalformedURLException
	{
		
      
	  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:deviceName", "RajeshDevice");
	    desiredCapabilities.setCapability("appium:appPackage", "io.appium.android.apis");
	    desiredCapabilities.setCapability("appium:appActivity", ".ApiDemos");
	    desiredCapabilities.setCapability("appium:udid", "WCS8FQYHNVW8KNOV");
	    desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appium:noReset", true);
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
	    
	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

	     driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	    
}

}
