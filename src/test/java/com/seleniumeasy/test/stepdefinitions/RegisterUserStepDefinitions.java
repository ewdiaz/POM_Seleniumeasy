package com.seleniumeasy.test.stepdefinitions;


import com.seleniumeasy.automation.steps.InputFormSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class RegisterUserStepDefinitions {

    @Steps
    InputFormSteps inputFormSteps;


    @Given("^That a web user i want to register in the web page$")
    public void thatAWebUserIWantToRegisterInTheWebPage() {
        inputFormSteps.openBrowser();
    }


    @When("^fill all the requested fields in the web table$")
    public void fillAllTheRequestedFieldsInTheWebTable() throws InterruptedException {
        inputFormSteps.fillForm();
    }

    @Then("^we can see the form with our information$")
    public void weCanSeeTheFormWithOurInformation() {
    }
}
