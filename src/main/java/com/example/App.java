package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class App {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        FirefoxOptions options = new FirefoxOptions();

        // ✅ IMPORTANT for Jenkins
        options.addArguments("--headless");
        options.setBinary("/usr/bin/firefox");

        WebDriver driver = new FirefoxDriver(options);

        // Open first website
        driver.get("https://www.saucedemo.com/");
        System.out.println("Opened: " + driver.getTitle());
        Thread.sleep(3000);

        // Open second website (same tab)
        driver.get("https://automationexercise.com/");
        System.out.println("Opened: " + driver.getTitle());
        Thread.sleep(3000);

        // Open third website (same tab)
        driver.get("https://practicetestautomation.com/");
        System.out.println("Opened: " + driver.getTitle());
        Thread.sleep(3000);

        driver.quit();
    }
}
