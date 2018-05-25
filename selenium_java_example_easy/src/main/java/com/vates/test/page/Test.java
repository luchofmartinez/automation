package com.vates.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Represent the Test page of the application.
 *
 * @author Vates.
 */
public class Test extends BasePage {

    private final By INPUT = new By.ByCssSelector("input");
    private final By TEXTAREA = new By.ByCssSelector("textarea");

    /**
     * To Define.
     * @param buttonName To Define.
     */
    protected final void clickOnLaunchDemoModalButton(final String buttonName) {
        String BUTTON = ".//button[contains(.,'%s')]";
        clickButton(new By.ByXPath(String.format(BUTTON, buttonName)));
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writeUrlInputField(String value) {
        sendKeys(INPUT, 2, value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writeAlphanumericInputField(String value) {
        sendKeys(INPUT, 3, value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writeNumericInputField(String value) {
        sendKeys(INPUT, 4, value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writeEmailInputField(String value) {
        sendKeys(INPUT, 5, value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writePasswordInputField(String value) {
        sendKeys(INPUT, 6, value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void selectOption(String value) {
        WebElement select = getDriver().findElement(By.tagName("select"));
        List<WebElement> allOptions = select.findElements(By.tagName("option"));
        allOptions.get(2).click();
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writeCommentTextAreaField(String value) {
        sendKeys(TEXTAREA, 0, value);
    }


    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void clickButton(String value) {
        String BUTTON = ".//button[contains(.,\'%s\')]";
        clickButton(new By.ByXPath(String.format(BUTTON, value)));
    }

    /**
     * To Define.
     */
    protected final void allIsOk() {
        System.out.println("allIsOk");
        try {
            sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getDriver().quit();
    }

}
