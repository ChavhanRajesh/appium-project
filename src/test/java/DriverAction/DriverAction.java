package DriverAction;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Appium.GenericLibrabry.BaseClass;

import io.appium.java_client.AppiumBy;

public class DriverAction extends BaseClass {
	@Test
	public void Action() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
		views.click();
		
		driver.runAppInBackground(Duration.ofSeconds(10));
		System.out.println("Api demos="+driver.queryAppState("io.appium.android.apis"));
		
		driver.activateApp("jp.rallwell.siriuth.touchscreentest");
		System.out.println("Api demos="+driver.queryAppState("io.appium.android.apis"));
		Thread.sleep(3000);
		
		driver.activateApp("Api demos=\"+\"io.appium.android.apis");
		System.out.println("TouchTest="+driver.queryAppState("jp.rallwell.siriuth.touchscreentest"));
				


		
	}

}
