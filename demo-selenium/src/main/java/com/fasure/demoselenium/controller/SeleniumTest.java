package com.fasure.demoselenium.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author: cangmu
 * @create: 2018-08-10
 **/
public class SeleniumTest {

    private static final String PATH = "/Users/cangmu/Downloads/chromedriver 2";

    private static final String URL = "https://mbd.baidu.com/newspage/data/landingshare?pageType=1&isBdboxFrom=1&context=%7B%22nid%22%3A%22news_8704100466065314339%22%2C%22sourceFrom%22%3A%22bjh%22%7D";

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        for (int i = 0; i < 1; i++) {
            Long sleepTime = (long)(random.nextInt(5) * 1000 + 2000);
            Integer waitTime = random.nextInt(4) + 2;

            // PATH为chromedriver所在路径
            System.setProperty("webdriver.chrome.driver", PATH);
            WebDriver driver = new ChromeDriver();

            // 浏览器最大化
            driver.manage().window().maximize();
            // 移动至页面最底部
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1200)");
            // 停留时间
            driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
            driver.get(URL);

            // 获取需要点击的按钮
            WebElement button=driver.findElement(By.className("packupArrow"));
            // 鼠标
            Actions actions=new Actions(driver);
            actions.click(button).perform();
            Thread.sleep(sleepTime);
            driver.close();
        }
    }
}
