/**
 * Created by gloria on 17/1/22.
 */


import io.appium.java_client.AppiumDriver;


import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class apptest1 {
        public static void main(String[] args) throws MalformedURLException, InterruptedException {
            WebDriver wd;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium-version", "1.0");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "9.3");
            capabilities.setCapability("deviceName", "iPhone 6s Plus");
            capabilities.setCapability("appPackage", "com.company.AppName");
            capabilities.setCapability("appActivity", "com.company.AppName.AppMainActivity");
            capabilities.setCapability("autoAcceptAlerts",true);
            capabilities.setCapability("waitForAppScript", "$.delay(6000); $.acceptAlert(); true;");
            capabilities.setCapability("app", "/Users/gloria/jobs/appiumtest/sample-code/sample-code/apps/TestApp/build/release-iphonesimulator/TestApp.app");
            wd = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities) {
                public void rotate(DeviceRotation deviceRotation) {

                }

                public DeviceRotation rotation() {
                    return null;
                }

                public MobileElement scrollTo(String s) {
                    return null;
                }

                public MobileElement scrollToExact(String s) {
                    return null;
                }
            };
            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[2]\n")).click();
            sleep(100);
            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[3]\n")).click();
            sleep(100);
////
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATextField[1]").xpath("//UIAApplication[1]/UIAWindow[2]/UIATextField[1]/UIATextField[1]")).sendKeys("100000");
//            Thread.sleep(100);
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATextField[2]").xpath("//UIAApplication[1]/UIAWindow[2]/UIATextField[2]")).sendKeys("111111");
////
//            Thread.sleep(100);

            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIASwitch[1]\n")).click();
            Thread.sleep(1000);

            wd.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);
            wd.quit();
            //wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[3]\n")).click();

//            wd.findElement(By.name("TextField1")).sendKeys("4");
//            wd.findElement(By.name("(null)")).sendKeys("5");
//            wd.switchTo().alert().accept();
//            wd.findElement(By.name("show alert")).click();
//            wd.findElement(By.name("(null)")).click();
//            wd.findElement(By.name("ComputeSumButton")).click();
//            wd.findElement(By.name("locationStatus")).click();
            //wd.shake();
//            wd.findElement(By.name("DisabledButton")).click();
//            (JavascriptExecutor)wd.executeScript("mobile: swipe", new HashMap<String, Double>() {{
//                put("touchCount", (double) 1); put("startX", (double) 125);
//                put("startY", (double) 389); put("endX", (double) 283);
//                put("endY", 390); put("duration", 1.3539453125); }});
//            wd.findElement(By.name("show alert")).click();
//            wd.findElement(By.name("contact alert")).click();

            
        }


}
