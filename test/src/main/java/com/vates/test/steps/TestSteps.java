package com.vates.test.steps;

import com.vates.test.page.Test;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public final class TestSteps extends Test {

    @Given("I open the web page")
    public final void stepOpenPage() {
        openPage();
    }

    @When("I click on \"$name\" button")
    public final void stepClickOnLaunchDemoModalButton(String name) {
        clickOnLaunchDemoModalButton(name);
    }

    @When("I write \"$value\" in Url input field")
    public final void stepWriteUrlInputField(String value) {
        writeUrlInputField(value);
    }

    @When("I write \"$value\" in Alphanumeric input field")
    public final void stepWriteAlphanumericInputField(String value) {
        writeAlphanumericInputField(value);
    }

    @When("I write \"$value\" in Numeric input field")
    public final void stepWriteNumericInputField(String value) {
        writeNumericInputField(value);
    }

    @When("I write \"$value\" in Email input field")
    public final void stepWriteEmailInputField(String value) {
        writeEmailInputField(value);
    }

    @When("I write \"$value\" in Password input field")
    public final void stepWritePasswordInputField(String value) {
        writePasswordInputField(value);
    }

    @When("I select text \"$value\" from select field")
    public final void stepSelectOption(String value) {
        selectOption(value);
    }

    @When("I write \"$value\" in Comment input field")
    public final void stepWriteCommentTextAreaField(String value) {
        writeCommentTextAreaField(value);
    }

    @When("I click on \"$value\" button option")
    public final void stepClickButton(String value) {
        clickButton(value);
    }

    @Then("All is ok")
    public final void stepAllIsOk() {
        allIsOk();
    }
}
