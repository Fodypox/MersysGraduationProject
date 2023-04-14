package StepDefinitions;

import Pages.DialogContent;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SercanDocTypesSteps extends MyMethods {
    DialogContent dc = new DialogContent();

    @Given("Admin click on Setup")
    public void adminClickOnSetup() {
        dc.clickMethod(dc.getSetupBtn());
    }

    @When("Admin click on Parameters")
    public void adminClickOnParameters() {
        dc.clickMethod(dc.getParameterBtn());
    }

    @And("Admin click on Document Types")
    public void adminClickOnDocumentTypes() {
        dc.clickMethod(dc.getDocumentTypesBtn());
    }

    @Then("Admin should navigate to Document Types Page")
    public void adminShouldNavigateToDocumentTypesPage() {
        verifyIsDisplayedMethod(dc.getDocumentTypesHeader());
    }

    @When("Admin click on Add Document Icon")
    public void adminClickOnAddDocumentIcon() {
        dc.clickMethod(dc.getAddDocument());
    }

    @And("Admin fill Name field with {string}")
    public void adminFillNameField(String documentName) {
        dc.sendKeysMethod(dc.getDocumentName(), documentName);
    }

    @And("Admin click on Stage dropdown menu")
    public void adminClickOnStageDropdownMenu() {
        dc.clickMethod(dc.getDocumentStageDropDown());
    }

    @And("Admin select all checkboxes")
    public void adminSelectAllCheckboxes() {
        for (WebElement checkBox : dc.getDocumentStages()) {
            clickMethod(checkBox);
        }
    }

    @And("Admin deselect all checkboxes")
    public void adminDeselectAllCheckboxes() {
        for (WebElement checkBox : dc.getDocumentStages()) {
            clickMethod(checkBox);
        }
    }

    @When("Admin click on a random document type checkbox and navigate back to the form")
    public void adminClickOnARandomDocumentTypeCheckboxAndNavigateBackToTheForm() {

        Random random = new Random();
        List<WebElement> checkboxes = dc.getDocumentStages();
        int size = checkboxes.size();

        // Check if any checkboxes are already selected
        boolean anySelected = false;
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                anySelected = true;
                break;
            }
        }
        // If no checkboxes are selected, select a random one
        if (!anySelected) {
            WebElement randomCheckbox = checkboxes.get(random.nextInt(size));
            clickMethod(randomCheckbox);
        }

        Actions actions = new Actions(BasicDriver.getDriver());
        actions.sendKeys(Keys.ESCAPE).perform();
    }


    @And("Admin fill description field with {string}")
    public void adminAddADescription(String description) {
        dc.sendKeysMethod(dc.getDocumentDescriptionField(), description);
    }

    @When("Admin deactivates all toggles and activates a random toggle")
    public void adminDeactivatesAllTogglesAndActivatesARandomToggle() {
        List<WebElement> documentToggles = new ArrayList<>();
        documentToggles.add(dc.getRequiredToggle()); // "Required" toggle
        documentToggles.add(dc.getActiveToggle()); // "Active" toggle
        documentToggles.add(dc.getCameraToggle()); // "Camera" toggle

        for (int i = 0; i < documentToggles.size(); i++) {
            WebElement toggle = documentToggles.get(i);
            // Checking if the toggle switch is checked
            if (toggle.getAttribute("aria-checked").equals("true")) {
                // Clicking on the corresponding toggle switch in getAllToggles to uncheck it,
                // because Selenium will not click on the locators with "isSelected" attribute, throws exception
                clickMethod(dc.getAllToggles().get(i));
            }
        }


        int randomIndex = new Random().nextInt(dc.getAllToggles().size());
        WebElement randomToggle = dc.getAllToggles().get(randomIndex);
        clickMethod(randomToggle);
    }

    @And("Admin click on Save button")
    public void adminClickOnSaveButton() {
        clickMethod(dc.getDocumentSaveBtn());
    }

    @Then("Admin should see success message")
    public void adminShouldSeeSuccessMessage() {
        verifyIsDisplayedMethod(dc.getSuccessMessage());
    }


    @And("Admin click on Search button")
    public void adminClickOnSearchButton() {
        dc.clickMethod(dc.getDocumentSearchButton());
    }

    @And("Admin click on Edit icon")
    public void adminClickOnEditIcon() {
        isPresent(dc.getEditIcon());
        waitUntilVisible(dc.getEditIcon());
        wait(1);
        dc.clickMethod(dc.getEditIcon());
    }

    @When("Admin type {string} on the search field")
    public void adminTypeOnTheTextBox(String documentName) {
        dc.sendKeysMethod(dc.getDocumentSearchField(), documentName);
    }

    @When("Admin edit document name field with {string}")
    public void adminEditDocumentNameFieldWith(String updatedDocumentName) {
        dc.sendKeysMethod(dc.getDocumentName(), updatedDocumentName);
    }


    @And("Admin edit Description field with {string}")
    public void adminEditDescriptionFieldWith(String updatedDocumentName) {
        dc.sendKeysMethod(dc.getDocumentDescriptionField(), updatedDocumentName);
    }

    @And("Admin click on Stage dropdown menu again")
    public void adminClickOnStageDropdownMenuAgain() {
        dc.clickMethod(dc.getDocumentStageEditDropdown());
    }

    @When("Admin click on Delete icon")
    public void adminClickOnDeleteIcon() {
        isPresent(dc.getDeleteIcon());
        waitUntilVisible(dc.getDeleteIcon());
        wait(1);
        dc.clickMethod(dc.getDeleteIcon());
    }

    @And("Admin click on Delete button")
    public void adminClickOnDeleteButton() {
        dc.clickMethod(dc.getDeleteButton());
    }

    @Then("Admin should not be able to see the deleted document type")
    public void adminShouldNotBeAbleToAccessToTheDeletedDocumentType() {
        Assert.assertTrue(dc.getNoResultsMessage().isDisplayed());
    }

    @And("Admin navigate back to the form")
    public void adminNavigateBackToTheForm() {
        Actions actions = new Actions(BasicDriver.getDriver());
        actions.sendKeys(Keys.ESCAPE).perform();
    }

    @Then("Admin should see error message")
    public void adminShouldSeeErrorMessage() {
        Assert.assertTrue(dc.getDocumentAddErrorMessage().isDisplayed());
    }
}