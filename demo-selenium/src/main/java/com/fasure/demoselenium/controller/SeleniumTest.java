package com.fasure.demoselenium.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author: cangmu
 * @create: 2018-08-10
 **/
public class SeleniumTest {

    private static final String PATH = "/Users/cangmu/Downloads/chromedriver 2";

    public static void main(String[] args) throws InterruptedException {
        // 此处PATH替换为你的chromedriver所在路径
        System.setProperty("webdriver.chrome.driver", PATH);
        WebDriver webDriver = new ChromeDriver();
        // 浏览器最大化
        webDriver.manage().window().maximize();
        // 停5S
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("http://www.baidu.com/");
        Thread.sleep(2000L);
        webDriver.close();
    }
}
