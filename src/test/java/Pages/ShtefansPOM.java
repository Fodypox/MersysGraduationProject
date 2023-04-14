package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShtefansPOM extends MyMethods {
    public ShtefansPOM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c111-17 ng-star-inserted']")
    private WebElement humanResourcesMenuBtn;

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c111-18 ng-star-inserted']")
    private WebElement setupUnderHRBtn;

    @FindBy(xpath = "//span[normalize-space()='Attestations']")
    private WebElement attestationsUnderHRBtn;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement searchBoxAttestations;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement searchBtnAttestations;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-badge mat-icon-button mat-button-base mat-badge-accent mat-badge-below mat-badge-after" +
            " mat-badge-small mat-badge-hidden ng-star-inserted']//fa-icon[@class='ng-fa-icon']//*[name()='svg']")
    private WebElement addNewAttestationButton;

    @FindBy(xpath = "//input[@id='ms-text-field-1']")
    private WebElement nameBoxAtAddNewAttestation;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement saveBtnAtAddNewAttestation;

    @FindBy(xpath = "//div[contains(text(),'Attestation successfully created')]")
    private WebElement successfullyCreatedMessage;

    @FindBy(xpath = "//div[contains(text(),'Attestation successfully updated')]")
    private WebElement successfullyUpdatedMessage;

    @FindBy(xpath = "//div[contains(text(),'Attestation successfully deleted')]")
    private WebElement successfullyDeletedMessage;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement errorDuplicatedNameMessage;

    @FindBy(xpath = "//span[normalize-space()='Delete']")
    private WebElement confirmDeleteButton;

    public WebElement getConfirmDeleteButton() {
        return confirmDeleteButton;
    }

    public WebElement getErrorDuplicatedNameMessage() {
        return errorDuplicatedNameMessage;
    }

    public WebElement getSuccessfullyDeletedMessage() {
        return successfullyDeletedMessage;
    }

    public WebElement getSuccessfullyUpdatedMessage() {
        return successfullyUpdatedMessage;
    }


    public WebElement getSuccessfullyCreatedMessage() {
        return successfullyCreatedMessage;
    }

    public WebElement getHumanResourcesMenuBtn() {
        return humanResourcesMenuBtn;
    }

    public WebElement getSetupUnderHRBtn() {
        return setupUnderHRBtn;
    }

    public WebElement getAttestationsUnderHRBtn() {
        return attestationsUnderHRBtn;
    }

    public WebElement getSearchBoxAttestations() {
        return searchBoxAttestations;
    }

    public WebElement getSearchBtnAttestations() {
        return searchBtnAttestations;
    }

    public WebElement getAddNewAttestationButton() {
        return addNewAttestationButton;
    }

    public WebElement getNameBoxAtAddNewAttestation() {
        return nameBoxAtAddNewAttestation;
    }

    public WebElement getSaveBtnAtAddNewAttestation() {
        return saveBtnAtAddNewAttestation;
    }
}