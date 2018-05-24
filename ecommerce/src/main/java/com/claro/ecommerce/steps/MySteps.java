package com.claro.ecommerce.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MySteps {

    @Given("I am a pending step")
    public void GoToWayToPay(){

    }

    @Given("I am still pending step")
    @Pending
    public void givenIAmStillPendingStep() {
        // PENDING
    }

    @When("a good soul will implement me")
    @Pending
    public void whenAGoodSoulWillImplementMe() {
        // PENDING
    }

    @Then("I shall be happy")
    @Pending
    public void thenIShallBeHappy() {
        // PENDING
    }
}
