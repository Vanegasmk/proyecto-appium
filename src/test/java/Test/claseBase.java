package Test;

import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.j2objc.annotations.ReflectionSupport.Level;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class claseBase {

	private String reportDirectory = "reports";
	private String reportFormat = "xml";
	private String testName = "Untitled";
	protected AndroidDriver<AndroidElement> driver = null;

	DesiredCapabilities dc = new DesiredCapabilities();


	@BeforeTest
	//Antes de prueba
	public void up() {
		try {

			dc.setCapability("reportDirectory", reportDirectory);
			dc.setCapability("reportFormat", reportFormat);
			dc.setCapability("testName", testName);

			dc.setCapability("deviceName", "Vanegasmk");
			dc.setCapability("udid", "R9JN30PFYLJ");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "11");
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.spotify.music");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
			driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
		} catch (Exception e) {
			System.out.println("Exception Cause: "+e.getCause());
			System.out.println("Exception Message: "+e.getMessage());
			e.printStackTrace();
		}

	}


}









