package com.vates.test.steps;

import com.vates.test.page.CrudPage;
import org.jbehave.core.annotations.*;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public final class CrudSteps extends CrudPage {

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
        PageFactory.initElements(getDriver(), CrudPage.class);
        //ComplexPageObject page = new ComplexPageObject("expected title", driver);
    }

    @When("I click on button Launch demo modal")
    public final void stepClickOnButtonLaunch() {
        clickLaunchDemoModal();
    }

    @When("I write \"$value\" in Url input field")
    public final void stepWriteUrl(@Named("value") String value) {
        writeUrl(value);
    }

    @When("I write \"$value\" in Alphanumeric input field")
    public final void stepWriteAlphanumeric(@Named("value") String value) {
        writeAlphanumeric(value);
    }

    @When("I write \"$value\" in Numeric input field")
    public final void stepWriteNumeric(@Named("value") String value) {
        writeNumeric(value);
    }

    @When("I write \"$value\" in Email input field")
    public final void stepWriteEmail(@Named("value") String value) {
        writeEmail(value);
    }

    @When("I write \"$value\" in Password input field")
    public final void stepWritePassword(@Named("value") String value) {
        writePassword(value);
    }

    @When("I select text \"$value\" from select field")
    public final void stepSelectOption(String value) {
        writeSelect(value);
    }

    @When("I write \"$value\" in Comment input field")
    public final void stepWriteComment(@Named("value") String value) {
        writeComment(value);
    }

    @When("I click on button Option 1")
    public final void stepClickOption1() {
        clickOption1();
    }

    @When("I click on button Option 2")
    public final void stepClickOption2() {
        clickOption2();
    }

    @When("I click on button Option 3")
    public final void stepClickOption3() {
        clickOption3();
    }

    @When("I click on button Option 4")
    public final void stepClickOption4() {
        clickOption4();
    }

    @Then("All is ok")
    public final void stepAllIsOk() {
        assertThat('1', equalTo('1'));
    }

    @Then("Example how create a table: $table")
    public void accountsShouldBalance(@Named("table") ExamplesTable table) {
        List<Map<String, String>> rows = table.getRows();
        for (Map<String, String> row : rows) {
            System.out.println(row);
        }
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
