package ChromeBrowser;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.Appium.GenericLibrabry.BaseClassChrome;
import com.Appium.GenericLibrabry.ServerStart;
import com.Appium.GenericLibrabry.ServerStartSecondWay;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class lounchBrowser extends ServerStartSecondWay  {
	@Test
	public void loch() throws MalformedURLException
	{

		  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("platformName", "Android");
		    desiredCapabilities.setCapability("appium:deviceName", "RajeshDevice");
		    desiredCapabilities.setCapability("appium:udid", "WCS8FQYHNVW8KNOV");
		    desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		    desiredCapabilities.setCapability("appium:noReset", true);
		    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
		    desiredCapabilities.setCapability("unlockType", "pin");
		    desiredCapabilities.setCapability("unlockKey", "069606");
		    desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		    desiredCapabilities.setCapability("chromeDriverExecutable", "‪C:\\Users\\HP\\Desktop\\chromedriver.exe");
		    
		    URL remoteUrl = new URL("http://127.0.0.1:4723");

		   AndroidDriver  driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		    
		driver.get("https://facebook.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.findElement(By.id(null))
	}

	
	

}
