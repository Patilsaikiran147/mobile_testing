package mobile_Testing1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class GeneralStore extends appiumBAsics1 {
		@Test
		public void app() {
			driver.findElement(By.id("android:id/text1")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
			driver.findElement(By.xpath("//android.widget.TextView[@text='India'")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("tulasi");
			driver.hideKeyboard();
			driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	}

}
