package StepDefinitions;

import Pages.ShtefansPOM;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShtefansSteps extends MyMethods {

    ShtefansPOM sp = new ShtefansPOM();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    @Given("Admin should go to Human Resources -> Setup -> Attestations")
    public void adminShouldGoToHumanResourcesSetupAttestations() {
        sp.clickMethod(sp.getHumanResourcesMenuBtn());
        sp.clickMethod(sp.getSetupUnderHRBtn());
        sp.clickMethod(sp.getAttestationsUnderHRBtn());
    }

    @When("Admin clicks Add Attestation button")
    public void adminClicksAddAttestationButton() {
        sp.clickMethod(sp.getAddNewAttestationButton());
    }

    @And("Admin gives a new name")
    public void adminGivesANewName() {
        sp.sendKeysMethod(sp.getNameBoxAtAddNewAttestation(), "ShtefansTestingAttestation");

    }

    @And("Admin clicks Save button")
    public void adminClicksSaveButton() {
        sp.clickMethod(sp.getSaveBtnAtAddNewAttestation());
    }

    @Then("Verify Attestation Added Successfully message should be displayed")
    public void verifyMessageShouldBeDisplayed() {
        boolean addedNewMessage = sp.verifyIsDisplayedMethod(sp.getSuccessfullyCreatedMessage());
        if (addedNewMessage) {
            System.out.println("ADD NEW ATTESTATION: Verification PASSED");
        } else {
            System.out.println("ADD NEW ATTESTATION: Verification FAILED");
        }

    }

    @When("Admin is searching for the specific Attestation")
    public void adminIsSearchingForTheSpecificAttestation() {
        sp.sendKeysMethod(sp.getSearchBoxAttestations(), "ShtefansTestingAttestation");
        sp.clickMethod(sp.getSearchBtnAttestations());
    }

    @And("Admin clicks Edit button")
    public void adminClicksEditButton() {
        wait(1);
        Actions action = new Actions(BasicDriver.getDriver());
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.ENTER).perform();
    }

    @And("Admin edits the name")
    public void adminEditsTheName() {
        sp.sendKeysMethod(sp.getNameBoxAtAddNewAttestation(), "ShtefansEDITED");
        sp.clickMethod(sp.getSaveBtnAtAddNewAttestation());
    }

    @Then("Verify Attestation successfully updated green message should be displayed")
    public void verifyGreenMessageShouldBeDisplayed() {
        sp.verifyIsDisplayedMethod(sp.getSuccessfullyUpdatedMessage());
    }

    @When("Admin is looking for the edited Attestation")
    public void adminIsLookingForTheEditedAttestation() {
        sp.sendKeysMethod(sp.getSearchBoxAttestations(), "ShtefansEDITED");
        sp.clickMethod(sp.getSearchBtnAttestations());
    }

    @And("Admin clicks Delete button")
    public void adminClicksDeleteButton() {
        wait(1);
        Actions action = new Actions(BasicDriver.getDriver());
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.TAB).perform();
        action.keyDown(Keys.ENTER).perform();
    }


    @And("Admin clicks confirm Delete button")
    public void adminClicksConfirmDeleteButton() {
        sp.clickMethod(sp.getConfirmDeleteButton());

    }

    @Then("Verify Attestation Deleted Successfully red-message should be displayed")
    public void verifyRedMessageShouldBeDisplayed() {
        sp.verifyIsDisplayedMethod(sp.getSuccessfullyDeletedMessage());
    }

    @And("Admin gives the name which already exists")
    public void adminGivesTheNameWhichAlreadyExists() {

        sp.clickMethod(sp.getAddNewAttestationButton());
        sp.sendKeysMethod(sp.getNameBoxAtAddNewAttestation(), "ShtefansNegativeTestCaseCheck");
        sp.clickMethod(sp.getSaveBtnAtAddNewAttestation());
        wait(2);
        BasicDriver.getDriver().navigate().refresh();
        wait(2);
        sp.clickMethod(sp.getAddNewAttestationButton());
        sp.sendKeysMethod(sp.getNameBoxAtAddNewAttestation(), "ShtefansNegativeTestCaseCheck");
        sp.clickMethod(sp.getSaveBtnAtAddNewAttestation());

    }

    @Then("Verify The Attestation with [name] is already added Error message should be displayed")
    public void verifyErrorMessageShouldBeDisplayed() {

        sp.verifyIsDisplayedMethod(sp.getErrorDuplicatedNameMessage());
    }

}
