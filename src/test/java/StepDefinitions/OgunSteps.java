package StepDefinitions;

import Pages.OgunPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class OgunSteps {

    OgunPage elements = new OgunPage();

    /*@And("I click on the set up")
    public void iClickOnTheSetUp() {
        elements.clickMethod(elements.getSetupButton());
    }*/

    /*@And("I click on the parameters")
    public void iClickOnTheParameters() {
        elements.clickMethod(elements.getParametersButton());
    }*/

    @And("I click on Nationalities")
    public void iClickOnNationalities() {
        elements.clickMethod(elements.getNationalitiesButton());
    }

    @And("I click on the add nationality button")
    public void iClickOnTheAddNationalityButton() {
        elements.clickMethod(elements.getAddNationalityButton());
    }

    @And("I write new nationality name")
    public void iWriteNewNationalityName() {
        elements.sendKeysMethod(elements.getAddNewNationalityNameBox(),"Turkish67");


    }

    @And("I click save button")
    public void iClickSaveButton() {
        elements.clickMethod(elements.getSaveButton());
    }

    @Then("User should be see success message about adding new nationality")
    public void userShouldBeSeeSuccessMessageAboutAddingNewNationality() {
        elements.wait.until(ExpectedConditions.invisibilityOf(elements.getNationalitySuccessfullyCreatedMessage()));
        elements.verifyContainsText(elements.getNationalitySuccessfullyCreatedMessage(), "success");
        //Assert.assertTrue(elements.getNationalitySuccessfullyCreatedMessage().isDisplayed());
    }

    @And("I added the same Nationality name")
    public void iAddedTheSameNationalityName() {
        //elements.wait.until(ExpectedConditions.invisibilityOf(elements.getAddNewNationalityNameBox()));
        elements.sendKeysMethod(elements.getAddNewNationalityNameBox(),"Turkish67");
        elements.clickMethod(elements.getSaveButton());



    }

    @Then("User will see unsuccessful message about name already exist")
    public void userWillSeeUnsuccessfulMessageAboutNameAlreadyExist() {
        elements.wait.until(ExpectedConditions.invisibilityOf(elements.getAlreadyExistMessage()));
        elements.verifyContainsText(elements.getAlreadyExistMessage()," already exists");
        //Assert.assertTrue(elements.getAlreadyExistMessage().isDisplayed());
    }

    @And("I write Nationality name on the name text box to search")
    public void iWriteNationalityNameOnTheNameTextBoxToSearch() {
        elements.sendKeysMethod(elements.getNationalitySearchBox(),"Turkish67");
    }

    @And("I click search button")
    public void iClickSearchButton() {
        elements.clickMethod(elements.getSearchButton());
    }

    @And("I click edit button")
    public void iClickEditButton() {
        elements.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("svg[data-icon='pen-to-square']"), 10));
        elements.clickMethod(elements.getEditButton());

    }

    @And("I change name")
    public void iChangeName() {
        elements.wait(3);
        elements.getAddNewNationalityNameBox().clear();
        elements.sendKeysMethod(elements.getAddNewNationalityNameBox(),"Turkish34");
    }

    @Then("User  will see success message about updating")
    public void userWillSeeSuccessMessageAboutUpdating() {
        elements.wait.until(ExpectedConditions.invisibilityOf(elements.getNationalityUpdatedMessage()));
        elements.verifyContainsText(elements.getNationalityUpdatedMessage(),"updated");
        //Assert.assertTrue(elements.getNationalityUpdatedMessage().isDisplayed());
    }

    @And("I click delete button")
    public void iClickDeleteButton() {
        elements.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("svg[data-icon='trash-can']"), 10));
        elements.clickMethod(elements.getDeleteButton());
    }

    @And("I will see delete confirmation dialog box and click delete button")
    public void iWilSeeDeleteConfirmationDialogBoxAndClickDeleteButton() {
        elements.clickMethod(elements.getDeleteConfirmationButton());


    }

    @Then("User will see success message about delete")
    public void userWillSeeSuccessMessageAboutDelete() {
        elements.wait.until(ExpectedConditions.invisibilityOf(elements.getNationalityDeletedMessage()));
        elements.verifyContainsText(elements.getAlreadyExistMessage(),"deleted");
        //Assert.assertTrue(elements.getDeleteConfirmationButton().isDisplayed());
    }

    @Then("User will see unsuccessful message no data display")
    public void userWillSeeUnsuccessfulMessageNoDataDisplay() {
        elements.wait.until(ExpectedConditions.invisibilityOf(elements.getNoDataDisplayMessage()));
        elements.verifyContainsText(elements.getNoDataDisplayMessage(),"no data");
        //Assert.assertTrue(elements.getNoDataDisplayMessage().isDisplayed());
    }
}
