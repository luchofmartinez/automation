package com.vates.test.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

/**
 * Represent the Base page of the application.
 *
 * @author Vates.
 */
public class BasePage {

    private WebDriver driver;
    private static final long WAIT_MILLISECONDS = 1000;
    private static final int IMPLICITLY_WAIT_SECONDS = 10;
    private static final String DRIVER_KEY = "webdriver.gecko.driver";
    private static final String DRIVER_VALUE = "./src/main/resources/driver/geckodriver";
    private static final String WEB_PAGE = "http://automationcourse.herokuapp.com/crud.html";

    /**
     * To Define.
     */
    protected final void createDriver() {
        System.setProperty(DRIVER_KEY, DRIVER_VALUE);
        setDriver(new FirefoxDriver());
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
    }

    /**
     * To Define.
     */
    protected final void openPage() {
        driver.get(WEB_PAGE);
    }

    /**
     * To Define.
     *
     * @param element To Define.
     */
    protected final void clickButton(By element) {
        driver.findElement(element).click();
    }

    /**
     * To Define.
     *
     * @param element To Define.
     * @param index   To Define.
     * @param text    To Define.
     */
    protected final void sendKeys(By element, int index, String text) {
        driver.findElements(element).get(index).sendKeys(text);
    }

    /**
     * To Define.
     */
    protected void sleepFor() {
        try {
            sleep(WAIT_MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * To Define.
     *
     * @param driver To Define.
     */
    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * To Define.
     */
    protected final WebDriver getDriver() {
        return driver;
    }
}
