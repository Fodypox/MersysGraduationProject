package StepDefinitions;

import Pages.YusufPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YusufEmployeePositionsSteps {

    YusufPOM ya = new YusufPOM();

    @Given("Go to Positions under Human Resources Setup")
    public void goToPositionsUnderHumanResourcesSetup() {
        ya.clickMethod(ya.getHumanResourcesButton());
        ya.clickMethod(ya.getSetupButton());
        ya.clickMethod(ya.getPositionsButton());
    }

    @When("I Click on Add Position button")
    public void iClickOnAddPositionButton() {
        ya.clickMethod(ya.getAddPositionButton());

    }

    @And("I Enter the name as {string} and short name as {string} for the new position field")
    public void iEnterTheNameAsAndShortNameAsForTheNewPositionField(String arg0, String arg1) {
        ya.sendKeysMethod(ya.getAddName(), arg0);
        ya.sendKeysMethod(ya.getAddShortName(), arg1);
    }

    @And("I click on Save button")
    public void iClickOnSaveButton() {
        ya.clickMethod(ya.getSaveBtn());
    }

    @Then("Employee Position should be successfully created and displayed")
    public void employeePositionShouldBeSuccessfullyCreatedAndDisplayed() {
        ya.verifyContainsText(ya.getSuccessMessage(), "successfully");

    }

    @Then("User should get error message The Position with Name already exists.")
    public void userShouldGetErrorMessageThePositionWithNameAlreadyExists() {
        ya.verifyContainsText(ya.getErrorMessage(), "already exists");
    }

    @When("I Type a Employee name in Name field as {string} and click on Search button")
    public void iTypeAEmployeeNameInNameFieldAsAndClickOnSearchButton(String arg0) {
        ya.sendKeysMethod(ya.getNameSearch(), arg0);
        ya.clickMethod(ya.getSearchButton());
    }

    @And("I Click on Edit button On the displayed Employee Position")
    public void iClickOnEditButtonOnTheDisplayedEmployeePosition() {
        ya.wait(2);
        ya.clickMethod(ya.getEditButton());
    }

    @And("I Enter the name for the new Employee Position as {string}")
    public void iEnterTheNameForTheNewEmployeePositionAs(String arg0) {
        ya.sendKeysMethod(ya.getAddName(), arg0);
    }

    @Then("Employee Position should be successfully updated")
    public void employeePositionShouldBeSuccessfullyUpdated() {
        ya.verifyContainsText(ya.getSuccessMessage(), "successfully");
    }

    @And("I click on Delete button On the displayed Employee Position")
    public void iClickOnDeleteButtonOnTheDisplayedEmployeePosition() {
        ya.wait(2);
        ya.clickMethod(ya.getDeleteButton());
    }


    @Then("Employee Position should be successfully deleted.")
    public void employeePositionShouldBeSuccessfullyDeleted() {
        ya.verifyContainsText(ya.getSuccessMessage(), "successfully");
    }

    @Then("WarningMessage {string} should be displayed")
    public void warningMessageShouldBeDisplayed(String warningMessage) {
        ya.wait(2);
        ya.verifyContainsText(ya.getMessageForNonExistingData(), warningMessage);
    }
}
