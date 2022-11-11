package mobile_Testing1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Apidemos extends appiumBAsics1 {
	@Test
	public void settingapp() {
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
	driver.findElement(AppiumBy.id("android:id/checkbox")).click();
	driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
	String text = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
	Assert.assertEquals(text, "WiFi settings");
	driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("kiran wifi");
	driver.findElement(AppiumBy.id("android:id/button1")).click();
}
}