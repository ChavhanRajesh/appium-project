package DriverAction;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Appium.GenericLibrabry.AndroidGesture;
import com.Appium.GenericLibrabry.BaseClass;

import io.appium.java_client.AppiumBy;

public class CloseApp extends BaseClass{
	@Test
public void Close() throws InterruptedException
{
	Thread.sleep(3000);
	WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
	views.click();
	
	WebElement list = driver.findElement(AppiumBy.id("android:id/list"));
	AndroidGesture ag= new AndroidGesture();
	
	ag.swipe(driver, list);
	System.out.println("apiDemo="+driver.isAppInstalled("io.appium.android.apis"));
	System.out.println("api demos="+driver.queryAppState("io.appium.android.apis"));
	
	driver.closeApp();
}
}
