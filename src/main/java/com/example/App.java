package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WindowType;

public class App {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://automationexercise.com/");
        Thread.sleep(5000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://practicetestautomation.com/");
        Thread.sleep(5000);

        driver.quit();
    }
}
