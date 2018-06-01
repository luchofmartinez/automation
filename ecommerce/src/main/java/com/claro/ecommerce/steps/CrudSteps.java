package com.claro.ecommerce.steps;

import com.claro.ecommerce.pages.CrudPage;
import org.jbehave.core.annotations.*;

public class CrudSteps extends CrudPage {

    @BeforeStories
    public void beforeStories() {
        System.out.println("BeforeStories ...");
    }

    @BeforeStory
    public void beforeStory() {
        System.out.println("BeforeStory ...");
    }

    @BeforeScenario
    public void beforeScenario() {
        createDriver();
        System.out.println("BeforeScenario ...");
    }

    @Given("I open the web page")
    public void stepIOpenTheWebPage() {
        openPage();
    }

    @When("I click on \"$nameButton\" button")
    public void stepIClickOnModalButton(@Named("nameButton") String nameBtn) {
        clickOnModalButton(nameBtn);
        sleepFor();
    }

    @When("I write \"$url\" in Url input field")
    public void stepIWriteInUrlInputField(@Named("url") String url) {
        writeUrl(url);
        sleepFor();
    }

    @When("I write \"$text\" in Alphanumeric input field")
    public void stepIWriteInAlphanumericInputField(@Named("text") String text) {
        writeAlphanumeric(text);
        sleepFor();
    }

    @When("I write \"$numbers\" in Numeric input field")
    public void stepIWriteInNumericInputField(@Named("Numbers") String numbers) {
        writeNumeric(numbers);
        sleepFor();
    }

    @When("I write \"$email\" in Email input field")
    public void stepIWriteInEmailInputField(@Named("email") String email) {
        writeEmail(email);
        sleepFor();
    }

    @When("I write \"$password\" in Password input field")
    public void stepIWriteInPasswordInputField(@Named("password") String password) {
        writePassword(password);
        sleepFor();
    }

    @When("I select text \"$option\" from select field")
    public void stepISelectTextOption03FromSelectField(@Named("option") String option) {
        selectOption(option);
        sleepFor();
    }

    @When("I write \"$comment\" in Comment input field")
    public void stepIWriteInCommentInputField(@Named("comment") String comment) {
        writeComment(comment);
        sleepFor();
    }

    @When("I click on \"$optionButton\" button option")
    public void stepIClickOnOption1ButtonOption(@Named("optionButton") String optionButton) {
        clickOnOptionButton(optionButton);
        sleepFor();
    }

    @Then("All is ok")
    public void thenAllIsOk() {
        sleepFor();
        AllIsOk();
    }

    @AfterScenario
    public void afterScenario() {
        sleepFor();
        getDriver().quit();
        System.out.println("AfterScenario ...");
    }

    @AfterStory
    public void afterStory() {
        System.out.println("AfterStory ...");
    }

    @AfterStories
    public void afterStories() {
        System.out.println("AfterStories ...");
    }

}
