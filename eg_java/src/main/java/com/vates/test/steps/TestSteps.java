package com.vates.test.steps;

import com.vates.test.page.TestPage;
import org.jbehave.core.annotations.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public final class TestSteps extends TestPage {

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

    @BeforeStory(uponGivenStory = true)
    public void beforeGivenStoryUponGivenStory() {
        System.out.println("Before Given Story ...");
    }

    @Given("I open the web page")
    public final void stepOpenPage() {
        openPage();
    }

    @When("I click on \"$name\" button")
    public final void stepClickLaunchDemoModalButton(@Named("name") String name) {
        clickLaunchDemoModalButton(name);
    }

    @When("I write \"$value\" in Url input field")
    public final void stepWriteUrlInputField(@Named("value") String value) {
        writeUrlInputField(value);
    }

    @When("I write \"$value\" in Alphanumeric input field")
    public final void stepWriteAlphanumericInputField(@Named("value") String value) {
        writeAlphanumericInputField(value);
    }

    @When("I write \"$value\" in Numeric input field")
    public final void stepWriteNumericInputField(@Named("value") String value) {
        writeNumericInputField(value);
    }

    @When("I write \"$value\" in Email input field")
    public final void stepWriteEmailInputField(@Named("value") String value) {
        writeEmailInputField(value);
    }

    @When("I write \"$value\" in Password input field")
    public final void stepWritePasswordInputField(@Named("value") String value) {
        writePasswordInputField(value);
    }

    @When("I select text \"$value\" from select field")
    public final void stepSelectOption(String value) {
        selectOption(value);
    }

    @When("I write \"$value\" in Comment input field")
    public final void stepWriteCommentTextAreaField(@Named("value") String value) {
        writeCommentTextAreaField(value);
    }

    @When("I click on \"$value\" button option")
    public final void stepClickButton(@Named("value") String value) {
        clickButton(value);
    }

    @Then("All is ok")
    public final void stepAllIsOk() {
        assertThat('1', equalTo('1'));
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
