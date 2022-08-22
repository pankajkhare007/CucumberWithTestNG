package demo.stepDefinitions;

import asserts.Assertions;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.qameta.allure.Step;

public class DemoStep {

    private Scenario scenario;
    @Before
    public void before(Scenario scenario) {

        this.scenario =scenario;
       String str= scenario.getName();

    }
    @Step("Step Enter username")
    @Given("^Enter username$")
    public void enter_username() throws Throwable {
        System.out.println("Enter username");

    }

    @And("^Enter Password$")
    public void enter_Password() throws Throwable {
        System.out.println("Enter password");

    }

    @And("^Verify validation message$")
    public void verifyValidationMessage() throws Throwable {
        Assertions.expectedTextsAreEqual("successful message","contact not added successfully","contact added successfully");

    }

}