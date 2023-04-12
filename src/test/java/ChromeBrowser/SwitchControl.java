package ChromeBrowser;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SwitchControl {
	@Test
	public void switchs() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:deviceName", "RajeshDevice");
	    desiredCapabilities.setCapability("appium:udid", "WCS8FQYHNVW8KNOV");
	    desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appium:appPackage", "com.androidsample.generalstore");
	    desiredCapabilities.setCapability("appium:appActivity", ".SplashActivity");

		 URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
		 AndroidDriver driver=new AndroidDriver(remoteUrl,desiredCapabilities);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rajesh");
		 
		 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		 
		 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/ancestor::android.widget.RelativeLayout//android.widget.TextView[@text='ADD TO CART']")).click();
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();
		 
	 Thread.sleep(4000);
	Set<String> contextHandles = driver.getContextHandles();
	
	for(String contextHandle:contextHandles)
	{
		System.out.println(contextHandle);
	}

	driver.context("WEBVIEW_com.androidsample.generalstore");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium"+Keys.ENTER);)
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium"+Keys.ENTER);
	   
	}


}

