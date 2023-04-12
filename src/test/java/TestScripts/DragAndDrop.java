package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class DragAndDrop {
	@Test
	public void dragDrop() throws MalformedURLException
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

		    AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		    
			   WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
			   views.click();
			   
			   driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
			  WebElement dot = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
			  dot.click();
			  
//			  AndroidGesture ag= new AndroidGesture();
//			  
//			  ag.dragAndDrop(driver, dot, 480, 440);
			   
	}

}
