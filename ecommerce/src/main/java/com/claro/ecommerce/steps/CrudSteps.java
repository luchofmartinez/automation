package com.claro.ecommerce.steps;

import com.claro.ecommerce.pages.CrudPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;

public class CrudSteps extends CrudPage {

    @Given("I open the web page")
    public void stepIOpenTheWebPage() {
        abrirPagina();
    }

    @When("I click on $nameButton button")
    public void stepIClickOnModalButton(@Named("nameButton") String nameBtn) {
        clickOnModalButton(nameBtn);
    }

    @When("I write $url in Url input field")
    public void stepIWriteInUrlInputField(@Named("url") String url) {
        writeUrl(url);
    }

    @When("I write $text in Alphanumeric input field")
    public void stepIWriteInAlphanumericInputField(@Named("text") String text) {
        writeAlphanumeric(text);
    }

    @When("I write $numbers in Numeric input field")
    public void stepIWriteInNumericInputField(@Named("Numbers") String numbers) {
        writeNumeric(numbers);
    }

    @When("I write $email in Email input field")
    public void stepIWriteInEmailInputField(@Named("email") String email) {
        writeEmail(email);
    }

    @When("I write $password in Password input field")
    public void stepIWriteInPasswordInputField(@Named("password") String password) {
        writePassword(password);
    }

    @When("I select text $option from select field")
    public void stepISelectTextOption03FromSelectField(@Named("option") String option) {
        selectOption(option);
    }

    @When("I write $comment in Comment input field")
    public void stepIWriteInCommentInputField(@Named("comment") String comment) {
        writeComment(comment);
    }

    @When("I click on $optionButton button option")
    public void stepIClickOnOption1ButtonOption(@Named("optionButton") String optionButton) {
        clickOnOptionButton(optionButton);
    }

    @Then("All is ok")
    public void thenAllIsOk() {
        AllIsOk();
    }

}
