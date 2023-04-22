package StepDefinitions;

import Pages.HS_POM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SubjectCategories_StepDefinitions {

    HS_POM hp = new HS_POM();

    @Given("Go to Subject Categories under Education Setup")
    public void goToSubjectCategoriesUnderEducationSetup() {
        hp.clickMethod(hp.getEducationButton());
        hp.clickMethod(hp.getSetupButton());
        hp.clickMethod(hp.getSubjectCategoriesButton());
    }

    @When("I Click on Add Subject Category button")
    public void iClickOnAddSubjectCategoryButton() {
        hp.clickMethod(hp.getAddSubjectButton());
    }

    @And("I Enter the name for the new Subject Category as {string}")
    public void iEnterTheNameForTheNewSubjectCategoryAs(String subjectName) {
        hp.sendKeysMethod(hp.getNameForNewSubject(), subjectName);
    }

    @And("I Enter the code for the new Subject Category as {string}")
    public void iEnterTheCodeForTheNewSubjectCategoryAs(String subjectCode) {
        hp.sendKeysMethod(hp.getCodeForNewSubject(), subjectCode);
    }

    @And("I Click on Save button for new Subject Category")
    public void iClickOnSaveButtonForNewSubjectCategory() {
        hp.clickMethod(hp.getSaveButton());
    }

    @Then("Subject Category should be successfully created and displayed on top of the list")
    public void subjectCategoryShouldBeSuccessfullyCreatedAndDisplayedOnTopOfTheList() {
        hp.verifyContainsText(hp.getNewSubjectSuccessMessage(), "successfully");
    }

    @Then("User should get error message The Subject Category with given name already exists")
    public void userShouldGetErrorMessageTheSubjectCategoryWithGivenNameAlreadyExists() {
        hp.verifyContainsText(hp.getNameAlreadyExistsMessage(), "exists");
    }

    @When("I Type a Subject Category in Name field as {string} and click on Search button")
    public void iTypeASubjectCategoryInNameFieldAsAndClickOnSearchButton(String subjectName) {
        hp.sendKeysMethod(hp.getSearchNameForSubject(), subjectName);
        hp.clickMethod(hp.getSearchButtonForCategories());
    }

    @And("I Click on Edit button On the displayed Subject Category")
    public void iClickOnEditButtonOnTheDisplayedSubjectCategory() {
        hp.clickMethod(hp.getEditSubjectButton());
    }

    @And("I Enter a new name for the Subject category as {string}")
    public void iEnterANewNameForTheSubjectCategoryAs(String newSubjectName) {
        hp.sendKeysMethod(hp.getNameForNewSubject(), newSubjectName);
    }

    @And("I Click on Save for button for Subject Category")
    public void iClickOnSaveForButtonForSubjectCategory() {
        hp.clickMethod(hp.getSaveButton());
    }

    @Then("Subject Category should be successfully updated")
    public void subjectCategoryShouldBeSuccessfullyUpdated() {
        hp.verifyContainsText(hp.getSuccessMessageAfterEdit(), "successfully");
    }


    @And("I Click on the Edit button On the displayed Subject Category")
    public void iClickOnTheEditButtonOnTheDisplayedSubjectCategory() {
        hp.clickMethod(hp.getEditButtonAfterSubjectSearch());
    }

    @And("I delete the Subject Code")
    public void iDeleteTheSubjectCode() {
        hp.getCodeForNewSubject().clear();
        hp.getCodeForNewSubject().sendKeys(Keys.TAB);
    }

    @Then("User should get this error message:This field is required!")
    public void userShouldGetThisErrorMessageThisFieldIsRequired() {
        hp.verifyContainsText(hp.getRequiredFieldErrorMessage(), "required");
    }

    @And("I Click on Delete button On the displayed Subject Category")
    public void iClickOnDeleteButtonOnTheDisplayedSubjectCategory() {
        hp.clickMethod(hp.getDeleteButtonAfterSearch());
    }

    @And("I Click on Delete button on Popup window")
    public void iClickOnDeleteButtonOnPopupWindow() {
        hp.clickMethod(hp.getConfirmDeleteOnPopUp());
    }

    @Then("Subject Category should be successfully deleted.")
    public void subjectCategoryShouldBeSuccessfullyDeleted() {
        hp.verifyContainsText(hp.getSuccessfullyDeletedMessage(), "successfully");
    }
}
