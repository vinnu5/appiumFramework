package Framework;

	import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
	import static io.appium.java_client.touch.offset.ElementOption.element;
	import static java.time.Duration.ofSeconds;
	import java.io.IOException;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import io.appium.java_client.MobileBy;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
	public class testCase extends capabilities {
		
		@BeforeTest
		public void KillAllProcesses() throws IOException, InterruptedException {
		
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			Thread.sleep(8000);
			//String filepath = "D:\\eclipse workspace\\aPPFrame\\emulator.bat";
			// Runtime.getRuntime().exec(filepath);
		//	Runtime.getRuntime().exec(System.getProperty("user.dir")+"//src//main//resources//run.bat");
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//emulator.bat");
		//batch.waitFor();
			Thread.sleep(10000);
			
		}
		@Test
		public void tc1() throws IOException, InterruptedException {
			service = startServer();
			AndroidDriver<AndroidElement> driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
			Thread.sleep(3000);
			driver.findElement(MobileBy.id("android:id/text1")).click();
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))").click();
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("vinay");
			
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			Thread.sleep(3000);
			driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
			driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
			
			driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();			
			
		}
		
}