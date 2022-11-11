package mobile_Testing1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class longpress extends appiumBAsics1{
				
	@Test
	public void longpressGesture() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));
		((JavascriptExecutor)driver).executeScript("mobile:longClickGesture",ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),"duration",3000));
		Thread.sleep(2000);
	}
}
