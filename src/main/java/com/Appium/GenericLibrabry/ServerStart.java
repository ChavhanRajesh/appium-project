package com.Appium.GenericLibrabry;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ServerStart {
	AppiumDriverLocalService server;
	@BeforeMethod
 public void start()
 {
		 server = AppiumDriverLocalService.buildDefaultService();
		 server.start();
		 server.clearOutPutStreams();
		 
		 
 }
	@AfterMethod
	public void stopServer()
	{
		server.stop();
	}
	

}
