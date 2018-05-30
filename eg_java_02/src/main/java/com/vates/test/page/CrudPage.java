package com.vates.test.page;

import com.vates.test.common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Represent the CrudPage page of the application.
 *
 * @author Vates.
 */
public class CrudPage extends BasePage {

    @FindBy(how = How.TAG_NAME, using = "button")
    private static List<WebElement> temporal;

    @FindBy(how = How.XPATH, using = ".//button[contains(.,'%s')]")
    private static WebElement launchDemoModal;

    @FindBy(how = How.ID, using = "Url")
    private static WebElement url;

    @FindBy(how = How.ID, using = "Alphanumeric")
    private static WebElement alphanumeric;

    @FindBy(how = How.ID, using = "Numeric")
    private static WebElement numeric;

    @FindBy(how = How.ID, using = "Email")
    private static WebElement email;

    @FindBy(how = How.ID, using = "Password")
    private static WebElement password;

    @FindBy(how = How.ID, using = "Select")
    private static WebElement select;

    @FindBy(how = How.ID, using = "Comment")
    private static WebElement comment;

    /**
     * To Define Function.
     *
     * @param value to define.
     */
    protected final void clickLaunchDemoModal(final String value) {
        (launchDemoModal.getText().replace("asdasd"))
        launchDemoModal.click();
        temporal.get(0).getAttribute("text");
    }

    /**
     * To Define Function.
     *
     * @param value to define.
     */
    protected final void writeUrl(final String value) {
        url.sendKeys(value);
    }

    /**
     * To Define Function.
     *
     * @param value to define.
     */
    protected final void writeAlphanumeric(final String value) {
        alphanumeric.sendKeys(value);
    }

    /**
     * To Define Function.
     *
     * @param value to define.
     */
    protected final void writeNumeric(final String value) {
        numeric.sendKeys(value);
    }

    /**
     * To Define Function.
     *
     * @param value to define.
     */
    protected final void writeEmail(final String value) {
        email.sendKeys(value);
    }

    /**
     * To Define Function.
     *
     * @param value to define.
     */
    protected final void writePassword(final String value) {
        password.sendKeys(value);
    }

    /**
     * To Define Function.
     *
     * @param value to define.
     */
    protected final void writeSelect(final String value) {
        new Select(select).selectByVisibleText(value);
    }

    /**
     * To Define Function.
     *
     * @param value to define.
     */
    protected final void writeComment(final String value) {
        comment.sendKeys(value);
    }
}
