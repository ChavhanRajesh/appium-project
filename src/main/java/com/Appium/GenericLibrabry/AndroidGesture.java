package com.Appium.GenericLibrabry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class AndroidGesture {
	public void dragAndDrop(AndroidDriver driver, WebElement element, int endx, int endy) {
//		RemoteWebElement element = null;
		// Java
		(driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "endX", endx, "endY", endy));

	}

	public void swipe(AndroidDriver driver, WebElement element2) {
		// Java
		(driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				// "left", 100, "top", 100, "width", 200, "height", 200,
				"elementId", ((RemoteWebElement) element2).getId(), "direction", "up", "percent", 1.0));
	}

//		public void scroll(AndroidDriver driver, int left, int top, int height, int width)
//		{
//			// Java
//			(driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//			    "left", left, "top",top, "height", height , "width", width,
//			    "direction", "down",
//			    "percent", 1.0
//			));
	// }
	public void scroll(AndroidDriver driver, WebElement element2) {
		// Java
		(driver).executeScript("mobile: scrollGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) element2).getId(), "direction", "down", "percent", 1.0));
	}

	public void scrollTillEndUsingCordinate(int left, int top, int width, int height, AndroidDriver driver)
		{
			boolean scrollMore=true;
			while(scrollMore)
			{
				scrollMore=(Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", left, "top",top, "height", height , "width", width,
				    "direction", "down",
				    "percent", 1));
			}
		}

	public void scrollTillEndUsingEle(AndroidDriver driver, WebElement element2)
		{
			boolean scrollMore=true;
			while(scrollMore)
			{
				scrollMore=(Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
						"elementId",((RemoteWebElement) element2).getId(),
				    "direction", "down",
				    "percent", 1));
			}
		}

}
