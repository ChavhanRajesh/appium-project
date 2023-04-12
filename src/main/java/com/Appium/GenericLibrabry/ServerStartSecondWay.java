package com.Appium.GenericLibrabry;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class ServerStartSecondWay {
	AppiumDriverLocalService server;
	@BeforeMethod
 public void start()
 {
		 server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				 .usingPort(4723)
				 .withLogFile(new File ("../Appium_New/Serverlogs/New.log"))
				 .withArgument(GeneralServerFlag.SESSION_OVERRIDE));
				 
		 server.start();
		 server.clearOutPutStreams();
		 
		 
		 
 }
	@AfterMethod
	public void stopServer()
	{
		server.stop();
	}
	

}
