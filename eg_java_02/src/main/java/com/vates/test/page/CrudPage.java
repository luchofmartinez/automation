package com.vates.test.page;

import com.vates.test.common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Represent the CrudPage page of the application.
 *
 * @author Vates.
 */
public class CrudPage extends BasePage {

    /**
     * To Define.
     */
    public CrudPage() {
        //PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = ".//button[contains(.,'Launch demo modal')]")
    private static WebElement launchDemoModal;

    @FindBy(xpath = ".//button[contains(.,'Option 1')]")
    private static WebElement option1;

    @FindBy(xpath = ".//button[contains(.,'Option 2')]")
    private static WebElement option2;

    @FindBy(xpath = ".//button[contains(.,'Option 3')]")
    private static WebElement option3;

    @FindBy(xpath = ".//button[contains(.,'Option 4')]")
    private static WebElement option4;

    @FindBy(id = "Url")
    private static WebElement url;

    @FindBy(id = "Alphanumeric")
    private static WebElement alphanumeric;

    @FindBy(id = "Numeric")
    private static WebElement numeric;

    @FindBy(id = "Email")
    private static WebElement email;

    @FindBy(id = "Password")
    private static WebElement password;

    @FindBy(id = "Select")
    private static WebElement select;

    @FindBy(id = "Comment")
    private static WebElement comment;

    /**
     * To Define Function.
     */
    protected final void clickLaunchDemoModal() {
        launchDemoModal.click();
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

    /**
     * To Define Function.
     */
    protected final void clickOption1() {
        option1.click();
    }

    /**
     * To Define Function.
     */
    protected final void clickOption2() {
        option2.click();
    }

    /**
     * To Define Function.
     */
    protected final void clickOption3() {
        option3.click();
    }

    /**
     * To Define Function.
     */
    protected final void clickOption4() {
        option4.click();
    }
}
