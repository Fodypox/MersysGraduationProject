package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DimaPom extends MyMethods {
    public DimaPom() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement adminClickSetupButton;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement adminClickSchoolSetupButton;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement adminClickLocationsButton;

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement adminClickAddLocation;

    @FindBy(css = "input[id='ms-text-field-0']")
    private WebElement writesName;

    @FindBy(css = "input[id='ms-text-field-1']")
    private WebElement shortName;

    @FindBy(css = "input[id='ms-integer-field-0']")
    private WebElement Capacity;


//    @FindBy(xpath = "//div[contains(text(),'successfully')]")
//    private WebElement successМessage;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-pen-to-square']")
    private WebElement clickEdit;

    @FindBy(css = "input[id='ms-text-field-0']")
    private WebElement WritesNewName;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-trash-can']")
    private WebElement clickDelete ;

    @FindBy(xpath = "//*[@class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-accent']")
    private WebElement ClickDelete2 ;


    @FindBy(css = "input[id='ms-text-field-1']")
    private WebElement shortName2 ;

    @FindBy(css = "input[id='ms-integer-field-0']")
    private WebElement Capacity2;

    @FindBy(css = "//*[@id='mat-error-7']")
    private WebElement ThisFieldCannotBeLeftBlank;

    public WebElement getThisFieldCannotBeLeftBlank() {
        return ThisFieldCannotBeLeftBlank;
    }

    public WebElement getCapacity2() {
        return Capacity2;
    }

    public WebElement getShortName2() {
        return shortName2;


    }

    public WebElement getClickDelete2() {
        return ClickDelete2;
    }

    public WebElement getClickDelete() {
        return clickDelete;
    }

    public WebElement getWritesNewName() {
        return WritesNewName;
    }

    public WebElement getClickEdit() {
        return clickEdit;
    }

    public WebElement getSaveButton() {
        return SaveButton;
    }

//    public WebElement getSuccessМessage() {
//        return successМessage;
//    }

    public WebElement getCapacity() {
        return Capacity;
    }

    public WebElement getShortName() {
        return shortName;
    }

    public WebElement getWritesName() {
        return writesName;
    }

    public WebElement getAdminClickAddLocation() {
        return adminClickAddLocation;
    }

    public WebElement getAdminClickLocationsButton() {
        return adminClickLocationsButton;
    }

    public WebElement getAdminClickSchoolSetupButton() {
        return adminClickSchoolSetupButton;
    }

    public WebElement getAdminClickSetupButton() {
        return adminClickSetupButton;
    }
}

