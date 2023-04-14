package StepDefinitions;

import Pages.AslanbekPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AslanbekPositionCategories {
    AslanbekPOM ap = new AslanbekPOM();
    @Given("Go to Position Categories under Human Resources Setup")
    public void goToPositionCategoriesUnderHumanResourcesSetup() {
        ap.clickMethod(ap.getHRBtn());
        ap.clickMethod(ap.getSetupBtnUnderHR());
        ap.clickMethod(ap.getPositionCategoriesBtnUnderHR());
    }

    @When("I Click on Add Position Category button")
    public void iClickOnAddPositionCategoryButton() {
        ap.clickMethod(ap.getAddBtn());
    }



    @And("I Click on Save button")
    public void iClickOnSaveButton() {
        ap.clickMethod(ap.getSaveBtn());
    }

    @Then("Position Category should be successfully created and displayed")
    public void positionCategoryShouldBeSuccessfullyCreatedAndDisplayed() {
        ap.verifyContainsText(ap.getSuccessMessage(),"successfully");
    }

    @And("I Enter the name for the new position category as {string}")
    public void iEnterTheNameForTheNewPositionCategoryAs(String positionName) {
        ap.sendKeysMethod(ap.getNameUnderAdd(),positionName);
    }

    @Then("User should get error message The Position Category with given name already exists")
    public void userShouldGetErrorMessageThePositionCategoryWithGivenNameAlreadyExists() {
        ap.verifyContainsText(ap.getErrorMessage(),"already exists");
    }

    @When("I Type a Position Category in Name field as {string} and click on Search button")
    public void iTypeAPositionCategoryInNameFieldAsAndClickOnSearchButton(String positionName) {
        ap.sendKeysMethod(ap.getNameSearch(),positionName);
        ap.clickMethod(ap.getSearchBtn());
    }

    @And("I Click on Edit button On the displayed Position Category")
    public void iClickOnEditButtonOnTheDisplayedPositionCategory() {
        ap.wait(2);
        ap.clickMethod(ap.getEditBtn());
    }

    @Then("Position Category should be successfully updated")
    public void positionCategoryShouldBeSuccessfullyUpdated() {
        ap.verifyContainsText(ap.getSuccessMessage(),"successfully");
    }

    @And("I Click on Delete button On the displayed Position Category")
    public void iClickOnDeleteButtonOnTheDisplayedPositionCategory() {
        ap.wait(2);
        ap.clickMethod(ap.getDeleteBtn());
    }

    @And("I Click on Delete button on pop up window")
    public void iClickOnDeleteButtonOnPopUpWindow() {

        ap.wait(2);
        ap.clickMethod(ap.getConfirmDeleteBtn());
    }

    @Then("Position Category should be successfully deleted.")
    public void positionCategoryShouldBeSuccessfullyDeleted() {
        ap.verifyContainsText(ap.getSuccessMessage(),"successfully");
    }

    @Then("Warning Message {string} should be displayed")
    public void warningMessageShouldBeDisplayed(String warningMessage) {
        ap.verifyContainsText(ap.getMessageForNonExistingData(),warningMessage);
    }
}
