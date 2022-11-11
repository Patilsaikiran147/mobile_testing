package mobile_Testing1;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;





import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class appiumBAsics1 {
	AndroidDriver driver;
		@BeforeClass
		public void configapp() throws MalformedURLException {

		UiAutomator2Options opt = new UiAutomator2Options();
		opt.setDeviceName("Kiran");
		opt.setApp("C:\\Users\\ng21408\\eclipse-workspace\\Mobile_Testing\\src\\test\\java\\utils\\General-Store.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), opt);

	}
		@AfterClass
		public void closeapp() {
			driver.quit();
		}
}
