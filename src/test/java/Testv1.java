/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testv1 {
    WebDriver driver;

    WebElement searchBox, searchBtn, luckBtn;


    @BeforeClass
    public void initialize() {
        driver = WebDriverManager.chromedriver().create();
    }

    @Test(priority = 1)
    public void testPageOpen() {
        driver.get("https://www.google.co/");
    }


    @Test(priority = 2)
    public void testElement() {
        // Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
        searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        searchBtn = driver.findElement(By.name("btnK"));
        searchBtn.submit();

    }


    @Test(dependsOnMethods = {"testPageOpen"})
    public void luckBtnisDisplayed() {
        luckBtn = driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.RNmpXc"));
        Assert.assertTrue(luckBtn.isDisplayed());
        // luckBtn.submit();
    }


    @AfterClass
    public void tareDown() {
        driver.quit();
    }


}
