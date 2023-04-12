package GeneralStore;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Toast2 {
	@Test
	public void toastmsg() throws MalformedURLException
	{

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		//AndroidGesture ag= new AndroidGesture();
		
		desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:deviceName", "RajeshDevice");
	    desiredCapabilities.setCapability("appium:udid", "WCS8FQYHNVW8KNOV");
	    desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appium:appPackage", "com.androidsample.generalstore");
	    desiredCapabilities.setCapability("appium:appActivity", "com.androidsample.generalstore.SplashActivity");

		 URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
		 AndroidDriver driver=new AndroidDriver(remoteUrl,desiredCapabilities);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rajesh");
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 String msg = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getText();
		 System.out.println(msg);
	   
	}

}
