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
    public void whenIWriteInUrlInputField(@Named("url") String url) {
        writeUrl(url);
    }

    @When("I write $text in Alphanumeric input field")
    public void whenIWriteInAlphanumericInputField(@Named("text") String text) {
        writeAlphanumeric(text);
    }

    @When("I write $numbers in Numeric input field")
    public void whenIWriteInNumericInputField(@Named("Numbers") String numbers) {
        writeNumeric(numbers);
    }

    @When("I write $email in Email input field")
    public void whenIWriteInEmailInputField(@Named("email") String email) {
        writeEmail(email);
    }

    @When("I write $password in Password input field")
    public void whenIWriteInPasswordInputField(@Named("password") String password) {
        writePassword(password);
    }

    @When("I select text $option from select field")
    public void whenISelectTextOption03FromSelectField(@Named("option") String option) {
        selectOption(option);
    }

    @When("I write $comment in Comment input field")
    public void whenIWriteInCommentInputField(@Named("comment") String comment) {
        writeComment(comment);
    }

    @When("I click on $optionButton button option")
    public void whenIClickOnOption1ButtonOption(@Named("optionButton") String optionButton) {
        System.out.println("Nombre del boton: " + optionButton);
        clickOnOptionButton(optionButton);
    }
/*
    @When("I click on \"Option 2\" button option")
    public void whenIClickOnOption2ButtonOption() {
        clickOnOptionButton("option 2");
    }

    @When("I click on \"Option 3\" button option")
    public void whenIClickOnOption3ButtonOption() {
        clickOnOptionButton("option 3");
    }

    @When("I click on \"Option 4\" button option")
    public void whenIClickOnOption4ButtonOption() {
        clickOnOptionButton("option 4");
    }
*/
    @Then("All is ok")
    public void thenAllIsOk() {
        AllIsOk();
    }

}
