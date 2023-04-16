package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlexPOM extends MyMethods {

    public AlexPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setup;

    //<span _ngcontent-sxg-c111="" class="nav-link-title ng-tns-c111-9 ng-star-inserted">
    // School Setup</span>
    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;


    //<span _ngcontent-sxg-c109="" class="nav-link-title ng-star-inserted">
    // Departments</span>
    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement department;

    public WebElement getSetup() {
        return setup;
    }

    public WebElement getSchoolSetup() {
        return schoolSetup;
    }

    public WebElement getDepartment() {
        return department;
    }

//<svg role="img" aria-hidden="true" focusable="false" data-prefix="fal" data-icon="plus"
    // class="svg-inline--fa fa-plus" xmlns="http://www.w3.org/2000/svg"
    // viewBox="0 0 448 512"><path fill="currentColor" d="M240 64c0-8.8-7.2-16-16-16s-16 7.2-16
    // 16V240H32c-8.8 0-16 7.2-16 16s7.2 16 16 16H208V448c0 8.8 7.2 16 16 16s16-7.2 16-16V272H416c8.8 0 16-7.2 16-16s-7.2-16-16-16H240V64z">
    // </path></svg>
    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addSchoolDepartment;  //buttom to create new department

    public WebElement getAddSchoolDepartment() {
        return addSchoolDepartment;
    }


    //<input _ngcontent-nds-c204="" matinput="" autofocus="" class="mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-dirty ng-invalid ng-touched"
      // type="text" id="ms-text-field-0" required="" aria-required="true" data-placeholder="Name">
    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement nameInput;

    //<input _ngcontent-nds-c204="" matinput="" autofocus="" class="mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored"
      // type="text" id="ms-text-field-1" required="" aria-required="true" data-placeholder="Code">
    @FindBy(xpath = "//input[@id='ms-text-field-1']")
    private WebElement codeInput;

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getCodeInput() {
        return codeInput;
    }

    //<span _ngcontent-nds-c103="" style="visibility: visible;">Save</span>
    @FindBy(xpath = "//span[text()='Save']")
    private WebElement buttonSave;

    public WebElement getButtonSave() {
        return buttonSave;
    }

    @FindBy(xpath = "//div[text()='School Department successfully updated']")
    private WebElement successMessage;

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    @FindBy(xpath = "//div[text()='The School Department with Alex \"12345\" already exists.']")
    private WebElement warningMessage;

    public WebElement getWarningMessage() {
        return warningMessage;
    }


    //<svg role="img" aria-hidden="true" focusable="false" data-prefix="fal" data-icon="square-xmark" class="svg-inline--fa fa-square-xmark" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path fill="currentColor" d="M64 64C46.3 64 32 78.3 32 96V416c0 17.7 14.3 32 32 32H384c17.7 0 32-14.3 32-32V96c0-17.7-14.3-32-32-32H64zM0 96C0 60.7 28.7 32 64 32H384c35.3 0 64 28.7 64 64V416c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V96zm148.7 84.7c6.2-6.2 16.4-6.2 22.6 0L224 233.4l52.7-52.7c6.2-6.2 16.4-6.2 22.6 0s6.2 16.4 0 22.6L246.6 256l52.7 52.7c6.2 6.2 6.2 16.4 0 22.6s-16.4 6.2-22.6 0L224 278.6l-52.7 52.7c-6.2 6.2-16.4 6.2-22.6 0s-6.2-16.4 0-22.6L201.4
    // 256l-52.7-52.7c-6.2-6.2-6.2-16.4 0-22.6z"></path></svg>
    @FindBy(xpath = "//button[@aria-label='Close dialog']")  //// the same just copy and past from othrs!
    private WebElement closeDialog;

    public WebElement getCloseDialog() {
        return closeDialog;
    }

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")
    private WebElement editButtom;

    public WebElement getEditButtom() {
        return editButtom;
    }


}

