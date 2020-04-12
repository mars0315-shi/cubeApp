package com.cube.app;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class AppTest extends TestBase{

    public AppTest(){
        super();
    }

    public void wechatLogin(){
        //2.登录微信：点击登陆+输入账号+点击登录
        androidDriver.findElementById("com.tencent.mm:id/f34").click();
        su.sleepRegularTime();
        androidDriver.findElementById("com.tencent.mm:id/bem").sendKeys("13341777732");
        su.sleepRegularTime();
        androidDriver.findElementById("com.tencent.mm:id/dw1").click();
        su.sleepRegularTime();
        androidDriver.findElementById("com.tencent.mm:id/dj6").click();
        su.sleepRegularTime();
        androidDriver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
        su.sleepRegularTime();
        androidDriver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
//        su.sleepRegularTime();
//        androidDriver.findElementById("com.tencent.mm:id/dw1").click();
        su.sleepRegularTime();
        androidDriver.findElementByXPath("//android.widget.TextView[@text='密码']//following-sibling::android.widget.EditText").sendKeys("Wuai1314");
//        androidDriver.findElementById("com.tencent.mm:id/bem").sendKeys("Wuai1314");
        su.sleepRegularTime();
        androidDriver.findElementById("com.tencent.mm:id/dw1").click();
        su.sleepSetTime(10000);
        androidDriver.findElementById("com.tencent.mm:id/dit").click();
        su.sleepSetTime(10000);
    }

    public void openUrlWithWechatBrowser(){
        su.sleepRegularTime();
        androidDriver.findElementByXPath("//android.widget.View[@Text='微信团队']").click();
        su.sleepRegularTime();
        androidDriver.findElementById("com.tencent.mm:id/ake").click();
        su.sleepRegularTime();
        androidDriver.findElementById("com.tencent.mm:id/ajs").sendKeys("http://www.decathlon.com");
        su.sleepRegularTime();
        androidDriver.findElementById("com.tencent.mm:id/amb").click();

    }

    public static void main(String[] args) {
        AppTest appTest=new AppTest();
        appTest.wechatLogin();
        //7.点击对象
        //8.输入网址
        //9.点击网址
        //10.点击登陆
        //11.输入账号密码
        //12.输入物品搜索
        //13.加入购物车
        //14.点击付款
        //15.拉起微信支付
        //16.取消订单
    }

}
