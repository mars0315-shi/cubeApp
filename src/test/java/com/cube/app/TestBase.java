package com.cube.app;

import com.cube.Utils.SleepUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class TestBase {
    DesiredCapabilities desiredCapabilities;
    URL url;
    SleepUtils su=new SleepUtils();
    AndroidDriver<WebElement> androidDriver;

     public TestBase(){
         //1.初始化配置
         this.desiredCapabilities=new DesiredCapabilities();
         //配置DesiredCapabilities对象的deviceName，platformName，packageName，appActivity
         this.desiredCapabilities.setCapability("deviceName","127.0.0.1:7555");
         this.desiredCapabilities.setCapability("platformName","Android");
         this.desiredCapabilities.setCapability("appPackage","com.tencent.mm");
         this.desiredCapabilities.setCapability("appActivity",".ui.LauncherUI");
         //Debug
//        desiredCapabilities.setCapability("appPackage","com.lemon.lemonban");
//        desiredCapabilities.setCapability("appActivity",".activity.WelcomeActivity");
         //配置Android驱动，连接appium
         try {
             this.url = new URL("http://127.0.0.1:4723/wd/hub");
         } catch (MalformedURLException e) {
             e.printStackTrace();
         }
         this.androidDriver=new AndroidDriver(url,desiredCapabilities);

         //引入等待
         su.sleepSetTime(10000);
     }
}
