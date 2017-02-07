/**
 * Created by gloria on 17/1/22.
 */


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;


import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import static java.lang.Thread.sleep;

public class apptest2 {
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
            capabilities.setCapability("app", "/Users/gloria/jobs/apppackages/GoldWallet0207.app");
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


            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            //滑屏

            SwipUtils.swipeToLeft((AppiumDriver<WebElement>) wd,500,1);
            sleep(100);
            System.out.println("滑屏成功1");
            //滑屏
            SwipUtils.swipeToLeft((AppiumDriver<WebElement>) wd,500,1);
            sleep(100);
            System.out.println("滑屏成功2");
            sleep(100);
            //最后一屏点确认

            SwipUtils.swipeToLeft((AppiumDriver<WebElement>) wd,500,1);//此处点了立即体验
            sleep(100);
            System.out.println("滑屏成功3");
            sleep(100);
            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
            sleep(1000);

//            SwipUtils.swipeToLeft((AppiumDriver<WebElement>) wd,500,1);
//            sleep(100);
//            System.out.println("滑屏成功4");

//            //新手窗点xx
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
//            sleep(100);
//


            SwipUtils.swipeToUp((AppiumDriver<WebElement>) wd,500,1);
            SwipUtils.swipeToDown((AppiumDriver<WebElement>) wd,500,2);
            sleep(100);
            System.out.println("滑屏成功5");

            //点新手金

            System.out.println(wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAElement[2]")));
            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAElement[2]")).click();

            //System.out.print(wd.getPageSource());
            sleep(100);
//
//            //回退
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
//            sleep(100);
//
//            SwipUtils.swipeToLeft((AppiumDriver<WebElement>) wd,500,1);
//            sleep(100);
//            System.out.println("滑屏成功6");
//            //点买金
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[1]")).click();
//            sleep(100);
//
//            SwipUtils.swipeToLeft((AppiumDriver<WebElement>) wd,500,1);
//            sleep(100);
//            System.out.println("滑屏成功7");
//            //输入用户信息
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]/UIATextField[1]")).sendKeys("15001141469");
//            sleep(100);
//
//            //点下一步
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
//            sleep(100);
//
//            //输入密码
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]/UIASecureTextField[1]")).sendKeys("123456");
//            sleep(100);
//
//            //点登录
//           wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
//            sleep(100);
////

//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATextField[1]").xpath("//UIAApplication[1]/UIAWindow[2]/UIATextField[1]/UIATextField[1]")).sendKeys("100000");
//            Thread.sleep(100);
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATextField[2]").xpath("//UIAApplication[1]/UIAWindow[2]/UIATextField[2]")).sendKeys("111111");
////
//            Thread.sleep(100);

//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[1]\n")).click();
//            Thread.sleep(1000);


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
