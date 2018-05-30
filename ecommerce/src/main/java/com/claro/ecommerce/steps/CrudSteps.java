package com.claro.ecommerce.steps;

import com.claro.ecommerce.pages.CrudPage;
import org.jbehave.core.annotations.*;

public class CrudSteps extends CrudPage {

    @Given("I open the web page")
    public void stepIOpenTheWebPage(){
        abrirPagina();
    }

    @When("I click on \"Launch demo modal\" button")
    public void stepIClickOnModalButton(){
        clickOnModalButton();
    }

    @When("I write \"https://www.google.com\" in Url input field")
    public void whenIWritehttpswwwgooglecomInUrlInputField() {
        writeUrl();
    }

    @When("I write \"a1b2 in Alphanumeric input field")
    public void whenIWritea1b2InAlphanumericInputField() {
        writeAlphanumeric();
    }

    @When("I write \"1234567890\" in Numeric input field")
    public void whenIWrite1234567890InNumericInputField() {
        writeNumeric();
    }

    @When("I write \"mail@domain.com\" in Email input field")
    public void whenIWritemaildomaincomInEmailInputField() {
        writeEmail();
    }

    @When("I write \"secret\" in Password input field")
    public void whenIWritesecretInPasswordInputField() {
        writePassword();
    }

    @When("I select text \"Option 03\" from select field")
    public void whenISelectTextOption03FromSelectField() {
        selectOption();
    }

    @When("I write \"comment of student\" in Comment input field")
    public void whenIWritecommentOfStudentInCommentInputField() {
        writeComment();
    }

    @When("I click on \"Option 1\" button option")
    public void whenIClickOnOption1ButtonOption() {
         clickOnOptionButton(1);
    }

    @When("I click on \"Option 2\" button option")
    public void whenIClickOnOption2ButtonOption() {
        clickOnOptionButton(2);
    }

    @When("I click on \"Option 3\" button option")
    public void whenIClickOnOption3ButtonOption() {
        clickOnOptionButton(3);
    }

    @When("I click on \"Option 4\" button option")
    public void whenIClickOnOption4ButtonOption() {
        clickOnOptionButton(4);
    }

    @Then("All is ok")
    public void thenAllIsOk() {
        AllIsOk();
    }

}
