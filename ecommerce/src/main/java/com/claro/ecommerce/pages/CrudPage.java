package com.claro.ecommerce.pages;

import com.claro.ecommerce.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * This class contains the methods defined for actions on the page
 */
public class CrudPage extends BasePage {

    /**
     * To define
     *
     * @param nameBtn to define.
     */
    protected final void clickOnModalButton(final String nameBtn) {
        WebElement button = getDriver().findElement(By.xpath(".//button[contains(.,'" + nameBtn + "')]"));
        button.click();
    }

    /**
     * To define
     *
     * @param url to define.
     */
    protected final void writeUrl(final String url) {
        WebElement fieldUrl = getDriver().findElement(By.id("Url"));
        fieldUrl.sendKeys(url);
    }

    /**
     * To define
     *
     * @param text to define.
     */
    protected final void writeAlphanumeric(final String text) {
        WebElement fieldAlphanumeric = getDriver().findElement(By.id("Alphanumeric"));
        fieldAlphanumeric.sendKeys(text);
    }

    /**
     * To define
     *
     * @param numbers to define.
     */
    protected final void writeNumeric(final String numbers) {
        WebElement fieldNumeric = getDriver().findElement(By.id("Numeric"));
        fieldNumeric.sendKeys(numbers);
    }

    /**
     * To define
     *
     * @param email to define.
     */
    protected final void writeEmail(final String email) {
        WebElement fieldUrl = getDriver().findElement(By.id("Email"));
        fieldUrl.sendKeys(email);
    }

    /**
     * To define
     *
     * @param password to define.
     */
    protected final void writePassword(final String password) {
        WebElement fieldPassword = getDriver().findElement(By.id("Password"));
        fieldPassword.sendKeys(password);
    }

    /**
     * To define
     *
     * @param optionText to define.
     */
    protected final void selectOption(final String optionText) {
        WebElement fieldOption = getDriver().findElement(By.id("Select"));
        Select comboboc = new Select(fieldOption);
        comboboc.selectByVisibleText(optionText);
    }

    /**
     * To define to define.
     *
     * @param comment to define.
     */
    protected final void writeComment(final String comment) {
        WebElement fieldUrl = getDriver().findElement(By.id("Comment"));
        fieldUrl.sendKeys(comment);

        WebElement tabClick = getDriver().findElement(By.id("profile-tab"));
        tabClick.click();
    }

    /**
     * To define
     *
     * @param optionButton to define.
     */
    protected final void clickOnOptionButton(final String optionButton) {
        WebElement fieldOption = getDriver().findElement(By.xpath("//html//div[@class='modal-footer']//button[contains(.,'Option 1')]"));
        fieldOption.click();
    }

    /**
     * To define
     */
    protected final void AllIsOk() {

    }
}
