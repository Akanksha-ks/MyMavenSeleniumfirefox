package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WindowType;

public class App {

    public static void main(String[] args) throws InterruptedException {

        // Tell Selenium where geckodriver is located
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");

        WebDriver driver = new FirefoxDriver(options);

        driver.manage().window().maximize();

        // Open first website
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);

        // Open second website
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://automationexercise.com/");
        Thread.sleep(5000);

        // Open third website
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://practicetestautomation.com/");
        Thread.sleep(5000);

        Thread.sleep(10000);

        driver.quit();
    }
}
