package StepDefinitions;

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
    public void adminClickAddLocation()
    {dp.clickMethod(dp.getAdminClickAddLocation());
    }




    @When("Admin writes name, short name, Location Type, Capacity")
    public void adminWritesNameShortNameLocationTypeCapacity() {

//        dp.sendKeysMethod(BasicDriver.getDriver().findElement(By.cssSelector("input[id='ms-text-field-0']")),"Adi");
        dp.sendKeysMethod(dp.getWritesName(),"Dima");
        dp.sendKeysMethod(dp.getShortName(), "Adi");
        dp.sendKeysMethod(dp.getCapacity(), "23");



    }

    @When("Admin click Save button")
    public void adminClickSaveButton() {
        dp.clickMethod(dp.getShortName());
        dp.clickMethod(dp.getSaveButton());
    }

    @Then("Admin will see success message: {string}")
    public void adminWillSeeSuccessMessage(String arg0) {
////        Assert.assertEquals(dp.getSuccessМessage().getText(),arg0);
//
//        String expect =arg0;
//        System.out.println(expect);
//        WebElement ectual = dp.getSuccessМessage();
//        System.out.println(ectual.getText());
////        dp.verifyContainsText(ectual,expect);

    }


    @When("Admin click Edit Location")
    public void adminClickEditLocation() {
        dp.clickMethod(dp.getClickEdit());

    }

    @When("Admin writes other name")
    public void adminWritesOtherName() {
        dp.sendKeysMethod(dp.getWritesNewName(),"Dim");
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

//            boolean addedNewMessage = dp.verifyIsDisplayedMethod(dp.getThisFieldCannotBeLeftBlank());
//        if (addedNewMessage) {
//            System.out.println("This field cannot be left blank!");
//        } else {
//            System.out.println("This field cannot be left blank!");
//        }
}
