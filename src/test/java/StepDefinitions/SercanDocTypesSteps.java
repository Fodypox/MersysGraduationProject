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

    @And("Admin fill Name field")
    public void adminFillNameField() {
dc.sendKeysMethod(dc.getDocumentName(), "SercanDocumentAddTest");
    }

    @And("Admin click on Stage dropdown menu")
    public void adminClickOnStageDropdownMenu() {
        dc.clickMethod(dc.getDocumentStage());
    }

    @And("Admin select all checkboxes")
    public void adminSelectAllCheckboxes() {
        for (WebElement checkBox :
                dc.getDocumentStages()) {
            clickMethod(checkBox);
        }
    }

    @And("Admin deselect all checkboxes")
    public void adminDeselectAllCheckboxes() {
        for (WebElement checkBox :
                dc.getDocumentStages()) {
            clickMethod(checkBox);
        }
    }

    @When("Admin click on a random document type checkbox and navigate back to the form")
    public void adminClickOnARandomDocumentTypeCheckboxAndNavigateBackToTheForm() {
        Random random = new Random();
        WebElement randomCheckBox = dc.getDocumentStages().get(random.nextInt(dc.getDocumentStages().size()));
        clickMethod(randomCheckBox);
        Actions actions = new Actions(BasicDriver.getDriver());
        actions.sendKeys(Keys.ESCAPE).perform();
        actions.sendKeys(Keys.NULL).perform();
    }

    @And("Admin add a description")
    public void adminAddADescription() {
        dc.sendKeysMethod(dc.getDocumentDescription(),"This is a description");
    }

    @When("Admin deactivates all toggles and activates a random toggle")
    public void adminDeactivatesAllTogglesAndActivatesARandomToggle() {
        List<WebElement> documentToggles = new ArrayList<WebElement>();
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
}
