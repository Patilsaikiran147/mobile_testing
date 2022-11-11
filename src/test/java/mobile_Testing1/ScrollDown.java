package mobile_Testing1;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollDown extends appiumBAsics1{
		@Test
		public void ScrollDownwards() {
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		}
}
