package com.vates.test.page;

import com.vates.test.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Represent the CrudPage page of the application.
 *
 * @author Vates.
 */
public class CrudPage extends BasePage {

    private static final int URL_INPUT_INDEX = 2;
    private static final int EMAIL_INPUT_INDEX = 5;
    private static final int NUMERIC_INPUT_INDEX = 4;
    private static final int PASSWORD_INPUT_INDEX = 6;
    private static final int COMMENT_TEXTAREA_INDEX = 0;
    private static final int ALPHANUMERIC_INPUT_INDEX = 3;
    private static final By INPUT = new By.ByCssSelector("input");
    private static final By SELECT = new By.ByCssSelector("select");
    private static final By TEXTAREA = new By.ByCssSelector("textarea");
    private static final String BUTTON = ".//button[contains(.,'%s')]";

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void clickButton(String value) {
        clickButton(new By.ByXPath(String.format(BUTTON, value)));
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writeUrlInputField(String value) {
        sendKeys(INPUT, URL_INPUT_INDEX, value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writeAlphanumericInputField(String value) {
        sendKeys(INPUT, ALPHANUMERIC_INPUT_INDEX, value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writeNumericInputField(String value) {
        sendKeys(INPUT, NUMERIC_INPUT_INDEX, value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writeEmailInputField(String value) {
        sendKeys(INPUT, EMAIL_INPUT_INDEX, value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writePasswordInputField(String value) {
        sendKeys(INPUT, PASSWORD_INPUT_INDEX, value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void selectOption(String value) {
        WebElement select = getDriver().findElement(SELECT);
        new Select(select).selectByVisibleText(value);
    }

    /**
     * To Define.
     *
     * @param value To Define.
     */
    protected final void writeCommentTextAreaField(String value) {
        sendKeys(TEXTAREA, COMMENT_TEXTAREA_INDEX, value);
    }

}
