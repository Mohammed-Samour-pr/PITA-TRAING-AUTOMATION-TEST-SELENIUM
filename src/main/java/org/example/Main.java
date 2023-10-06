package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {

    public static WebDriver driver;

    public static void main(String[] args) {
        try {
            driver = WebDriverManager.chromedriver().create();
            driver.get("https://cpanel.palsafe.org/");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}