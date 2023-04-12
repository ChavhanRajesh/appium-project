package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.Appium.GenericLibrabry.AndroidGesture;
import com.Appium.GenericLibrabry.BaseClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ScrollWithElement extends BaseClass{
	@Test
	public void scroll() throws MalformedURLException
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
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    
			    WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
			    views.click();
			    
			    
			    WebElement view=  driver.findElement(AppiumBy.id("android:id/list"));// yamde purn list select keli ek page paryant ani
			    
			    AndroidGesture ag= new AndroidGesture();
			    ag.scroll(driver, view);
			    
			 		}

	}


