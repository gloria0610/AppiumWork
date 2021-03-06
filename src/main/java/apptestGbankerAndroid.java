/**
 * Created by gloria on 17/1/22.
 */


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
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
            sleep(800);
            SwipUtils.swipeToDown((AppiumDriver<WebElement>) wd,500,2);
            sleep(800);
            System.out.println("滑屏成功5");

//
            //下边栏 点击全部 发现 和我的
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.TabWidget[1]/android.widget.FrameLayout[2]")).click();
            sleep(1000);
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.TabWidget[1]/android.widget.FrameLayout[3]")).click();
            sleep(1000);
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.TabWidget[1]/android.widget.FrameLayout[4]")).click();
            System.out.println("下部按钮遍历成功");

            //滑屏到上方
            SwipUtils.swipeToDown((AppiumDriver<WebElement>) wd,500,2);
            sleep(1000);

            //点击登录
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]")).click();
             //输入用户信息
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).sendKeys("15001141469");
            sleep(1000);
            System.out.println("输入用户信息成功");

            //点下一步
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
            sleep(800);
            System.out.println("下一步成功");

            //输入密码
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]")).sendKeys("123456");
            sleep(800);
            System.out.println("输入密码成功");

            //点登录
           wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
            sleep(800);

            //下边栏 点击首页
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.TabWidget[1]/android.widget.FrameLayout[1]")).click();
            sleep(800);
//
            //点买金
            SwipUtils.swipeToDown((AppiumDriver<WebElement>) wd,500,1);
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[2]")).click();
            sleep(1000);

            //输入买金克重
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).sendKeys("0.1");
            sleep(800);

            //点击完成
            ((AppiumDriver<WebElement>) wd).hideKeyboard();

            sleep(800);
            //点击确认下单
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();
            sleep(800);
            //点击确认支付
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[3]")).click();
            sleep(800);

            //输入交易密码
            wd.findElement(By.xpath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).sendKeys("000000");
            sleep(600);
            //点击确认
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
            sleep(2000);


            //点击完成
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.TextView[1]")).click();
            sleep(1000);


            //点击回退
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
            sleep(1000);

            //点击金价走势
            wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]")).click();

            sleep(1000);
            System.out.println("结束");

            wd.quit();
        }






}
