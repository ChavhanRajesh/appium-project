package GeneralStore;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.Appium.GenericLibrabry.AndroidGesture;
import com.Appium.GenericLibrabry.BaseClass;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;

public class DriverActions2
{
	@Test
	public void actions() throws MalformedURLException, InterruptedException
	{
	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	//AndroidGesture ag= new AndroidGesture();

	desiredCapabilities.setCapability("platformName", "Android");
	desiredCapabilities.setCapability("appium:deviceName", "RajeshDevice");
	desiredCapabilities.setCapability("appium:udid", "WCS8FQYHNVW8KNOV");
	desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
	desiredCapabilities.setCapability("appium:appPackage", "com.androidsample.generalstore");
	desiredCapabilities.setCapability("appium:appActivity", ".SplashActivity");

	URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(remoteUrl,desiredCapabilities);
	//driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	Thread.sleep(10);
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	Thread.sleep(10);


	//    public void scrollTillEndUsingCordinate(int left, int top, int width, int height, AndroidDriver driver)
	//	{
	String an="text";
	String av="India";
	//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))")).click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))")).click();
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rajesh");
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='ADD TO CART'])[1]")).click();

	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		
   
    
	
	
	}

    }
