package StepDefinitions;

import Pages.DialogContent;
import Pages.DimaPom;
import Utilities.BasicDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DimaSchoolSteps {

    DimaPom dp = new DimaPom();
    DialogContent ds = new DialogContent();


    @When("Admin click Setup button")
    public void adminClickSetupButton() {
        dp.clickMethod(dp.getAdminClickSetupButton());
    }

    @When("Admin click School Setup  button")
    public void adminClickSchoolSetupButton() {
        dp.clickMethod(dp.getAdminClickSchoolSetupButton());
    }

    @When("Admin click Locations button")
    public void adminClickLocationsButton() {
        dp.clickMethod(dp.getAdminClickLocationsButton());
    }

    @When("Admin click Add Location.  +")
    public void adminClickAddLocation() {
        dp.clickMethod(dp.getAdminClickAddLocation());
    }


    @When("Admin writes name, short name, Location Type, Capacity")
    public void adminWritesNameShortNameLocationTypeCapacity() {

//        dp.sendKeysMethod(BasicDriver.getDriver().findElement(By.cssSelector("input[id='ms-text-field-0']")),"Adi");
        dp.sendKeysMethod(dp.getWritesName(), "Dima");
        dp.sendKeysMethod(dp.getShortName(), "Adi");
        dp.sendKeysMethod(dp.getCapacity(), "23");


    }

    @When("Admin click Save button")
    public void adminClickSaveButton() {
        dp.clickMethod(dp.getShortName());
        dp.clickMethod(dp.getSaveButton());
    }


    @When("Admin click Edit Location")
    public void adminClickEditLocation() {
        dp.clickMethod(dp.getClickEdit());

    }

    @When("Admin writes other name")
    public void adminWritesOtherName() {
        dp.sendKeysMethod(dp.getWritesNewName(), "Dim");
    }

    @When("Admin click Delete button")
    public void adminClickDeleteButton() {
        dp.clickMethod(dp.getClickDelete());
        dp.clickMethod(dp.getClickDelete2());


    }

    @When("Admin writes  short name, Location Type, Capacity")
    public void adminWritesShortNameLocationTypeCapacity() {

        dp.sendKeysMethod(dp.getShortName2(), "DS");
        dp.sendKeysMethod(dp.getCapacity2(), "23");
    }

    @Then("Admin will see success message: {string}")
    public void adminWillSeeSuccessMessage(String arg0) {
        ds.verifyContainsText(ds.getSuccessMessage(), arg0);

    }

    @Then("Admin will see  message: {string}")
    public void adminWillSeeMessage(String arg0) {
        dp.verifyContainsText(dp.getErrorMessage(), arg0);


    }

    @Then("Admin will see error message: This field cannot be left blank!")
    public void adminWillSeeErrorMessageThisFieldCannotBeLeftBlank() {
      dp.wait(3);
        Assert.assertTrue(dp.getLeftBlank().isDisplayed());
    }

//            boolean addedNewMessage = dp.verifyIsDisplayedMethod(dp.getThisFieldCannotBeLeftBlank());
//        if (addedNewMessage) {
//            System.out.println("This field cannot be left blank!");
//        } else {
//            System.out.println("This field cannot be left blank!");
//        }
}
