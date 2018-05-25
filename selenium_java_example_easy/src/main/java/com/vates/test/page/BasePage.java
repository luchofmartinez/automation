package com.vates.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Represent the Base page of the application.
 *
 * @author Vates.
 */
public class BasePage {

    private WebDriver driver;

    /**
     * To Define.
     */
    protected final void openPage() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/geckodriver");
        setDriver(new FirefoxDriver());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationcourse.herokuapp.com/crud.html");
    }

    /**
     * To Define.
     * @param element To Define.
     */
    final void clickButton(By element) {
        driver.findElement(element).click();
    }

    /**
     * To Define.
     * @param element To Define.
     * @param index To Define.
     * @param text To Define.
     */
    final void sendKeys(By element, int index, String text) {
        driver.findElements(element).get(index).sendKeys(text);
    }

    /**
     * To Define.
     * @param driver To Define.
     */
    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * To Define.
     */
    final WebDriver getDriver() {
        return driver;
    }
}
