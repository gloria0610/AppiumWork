/**
 * Created by gloria on 17/1/22.
 */


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class apptestGbankerAndroid {
        public static void main(String[] args) throws MalformedURLException, InterruptedException {
            WebDriver wd;
            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("appium-version", "1.5.3");
//            capabilities.setCapability("platformName", "Android");
//            capabilities.setCapability("platformVersion", "5.0.2");
//            capabilities.setCapability("deviceName", "eb97e654");
//            capabilities.setCapability("appPackage", "com.gbanker.gbankerandroid.dev");
//            capabilities.setCapability("appActivity", "com.gbanker.gbankerandroid.ui.WelcomeActivity");
//            capabilities.setCapability("autoAcceptAlerts",true);
//            capabilities.setCapability("waitForAppScript", "$.delay(6000); $.acceptAlert(); true;");
//            capabilities.setCapability("app", "/Users/gloria/jobs/apppackages/gbanker-android-3.9.0-20170213164250-devTest.apk");
            capabilities.setCapability("appium-version", "1.0");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "5.0");
            capabilities.setCapability("deviceName", "eb97e654");
            capabilities.setCapability("app", "/Users/gloria/jobs/apppackages/gbanker-android-3.9.0-20170213164250-devTest.apk");
            capabilities.setCapability("appPackage", "com.gbanker.gbankerandroid.dev");
            capabilities.setCapability("appActivity", "com.gbanker.gbankerandroid.ui.WelcomeActivity");

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

            sleep(5000);
//
            SwipUtils.swipeToLeftAndroid((AppiumDriver<WebElement>) wd,500,1);
            sleep(500);
            System.out.println("滑屏成功1");
//            //滑屏
            SwipUtils.swipeToLeftAndroid((AppiumDriver<WebElement>) wd,500,1);
            sleep(500);
            System.out.println("滑屏成功2");
            sleep(500);
            //最后一屏点确认

            SwipUtils.swipeToLeftAndroid((AppiumDriver<WebElement>) wd,500,1);//此处点了立即体验
            sleep(500);
            System.out.println("滑屏成功3");
            sleep(800);
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[2]")).click();
            sleep(800);
////
//
//            //上下滑屏
            SwipUtils.swipeToUpAndroid((AppiumDriver<WebElement>) wd,500,1);
            SwipUtils.swipeToDown((AppiumDriver<WebElement>) wd,500,2);
            sleep(100);
            System.out.println("滑屏成功5");

//            //点新手金
//
//            System.out.println(wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAElement[2]")));
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAElement[2]")).click();
//
//
//            sleep(1500);
//            //新手金回退至首页
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
//
//            sleep(60);
//            SwipUtils.swipeToUp((AppiumDriver<WebElement>) wd,500,1);
//
//            sleep(60);
//            System.out.println("新手金结束");
////
//            //下边栏 点击全部 发现 和我的
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[2]")).click();
//            sleep(100);
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[3]")).click();
//            sleep(100);
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[4]")).click();
//            System.out.println("下部按钮遍历成功");
//
//            //滑屏到上方
//            SwipUtils.swipeToDown((AppiumDriver<WebElement>) wd,500,2);
//            sleep(100);
//
//            //点击登录
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAImage[4]")).click();
//             //输入用户信息
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).sendKeys("15001141469");
//            sleep(100);
//            System.out.println("输入用户信息成功");
//
//            //点下一步
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")).click();
//            sleep(80);
//            System.out.println("下一步成功");
//
//            //输入密码
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("123456");
//            sleep(80);
//            System.out.println("输入密码成功");
//
//            //点登录
//           wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
//            sleep(80);
//
//            //下边栏 点击首页
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[1]")).click();
//            sleep(80);
////
//            //点买金
//            SwipUtils.swipeToDown((AppiumDriver<WebElement>) wd,500,1);
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAButton[1]")).click();
//            sleep(100);
//
//            //输入买金克重
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).sendKeys("0.1");
//            sleep(80);
//
//            //点击完成
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAToolbar[1]/UIAButton[3]")).click();
//            sleep(80);
//            //点击确认下单
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
//            sleep(80);
//            //点击确认支付
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
//            sleep(80);
//
//            //输入交易密码
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]")).sendKeys("000000");
//            sleep(60);
//            //点击确认
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]")).click();
//            sleep(200);
//
//
//            //点击完成
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
//            sleep(100);
//
//
//            //点击回退
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]")).click();
//            sleep(100);
//
//            //点击金价走势
//            wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAStaticText[8]")).click();

            sleep(1000);
            System.out.println("结束");

            wd.quit();
        }






}
