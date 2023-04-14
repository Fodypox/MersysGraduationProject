package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_Account_POM extends MyMethods {
    public Bank_Account_POM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    } //PageFactory

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bancAccount;

    @FindBy(xpath = "//input[@id='ms-text-field-4']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@id='ms-text-field-5']")
    private WebElement ibanField;

    @FindBy(xpath = "//div[@id='mat-select-value-9']")
    private WebElement currencySelector;

    @FindBy(xpath = "//input[@id='ms-text-field-6']")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement saveButton;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButtonAnderBankAccount;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement plusButton;

    @FindBy(xpath = "//input[@id='ms-text-field-1']")
    private WebElement nameInPlats;

    @FindBy(xpath = "//input[@id='ms-text-field-4']")
    private WebElement nameInPlats2;

    @FindBy(xpath = "//input[@id='ms-text-field-2']")
    private WebElement ibanInPlats;

    @FindBy(xpath = "//input[@id='ms-text-field-5']")
    private WebElement ibanInPlat2;

    @FindBy(xpath = "//input[@id='ms-text-field-3']")
    private WebElement integrationCodeInPlats;

    @FindBy(xpath = "//input[@id='ms-text-field-6']")
    private WebElement integrationCodeInPlat2;

    @FindBy(xpath = "//div[@id='mat-select-value-7']")
    private WebElement currencyInPlats;

    @FindBy(xpath = "//div[@id='mat-select-value-9']")
    private WebElement currencyInPlats2;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement saveButtonInPlats;

    @FindBy(xpath = "//mat-option[@id='mat-option-23']")
    private WebElement selectCurrencyEUR;

    @FindBy(xpath = "//mat-option[@id='mat-option-31']")
    private WebElement selectCurrencyEUR2;

    @FindBy(xpath = "//div[text()='The Bank Account with IBAN \"PA78\" already exists.']")
    private WebElement warningMessage;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement nameInSearch;

    @FindBy(xpath = "//div[@id='mat-select-value-3']")
    private WebElement currencyInSearch;

    @FindBy(xpath = "//mat-option[@id='mat-option-8']")
    private WebElement eurInSearchCurrency;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteInDelete;


    // //ms-delete-button[@class='ng-star-inserted']
    @FindBy(xpath = "//*[@id=\"ms-table-0\"]/div/cdk-virtual-scroll-viewport/div[1]/table/tbody/tr/td[7]/div[1]/ms-delete-button/button/span[1]/fa-icon")
    private WebElement deleteAfterSearch;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")
    WebElement editAfterSearchBtn;

    @FindBy(xpath = "//div[text()='Bank Account successfully updated']")
    private WebElement successEditMessage;

    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    private WebElement infoDisplay;

    public WebElement getInfoDisplay() {
        return infoDisplay;
    }

    public WebElement getSuccessEditMessage() {
        return successEditMessage;
    }

    public WebElement getEditAfterSearchBtn() {
        return editAfterSearchBtn;
    }

    public WebElement getNameInPlats2() {
        return nameInPlats2;
    }

    public WebElement getIbanInPlat2() {
        return ibanInPlat2;
    }

    public WebElement getIntegrationCodeInPlat2() {
        return integrationCodeInPlat2;
    }

    public WebElement getCurrencyInPlats2() {
        return currencyInPlats2;
    }

    public WebElement getSelectCurrencyEUR2() {
        return selectCurrencyEUR2;
    }

    public WebElement getCloseDialog() {
        return closeDialog;
    }

    public WebElement getDeleteInDelete() {
        return deleteInDelete;
    }

    public WebElement getDeleteAfterSearch() {
        return deleteAfterSearch;
    }

    public WebElement getNameInSearch() {
        return nameInSearch;
    }

    public WebElement getCurrencyInSearch() {
        return currencyInSearch;
    }

    public WebElement getEurInSearchCurrency() {
        return eurInSearchCurrency;
    }

    public WebElement getWarningMessage() {
        return warningMessage;
    }

    public WebElement getSelectCurrencyEUR() {
        return selectCurrencyEUR;
    }

    public WebElement getIbanInPlats() {
        return ibanInPlats;
    }

    public WebElement getIntegrationCodeInPlats() {
        return integrationCodeInPlats;
    }

    public WebElement getCurrencyInPlats() {
        return currencyInPlats;
    }

    public WebElement getSaveButtonInPlats() {
        return saveButtonInPlats;
    }

    public WebElement getNameInPlats() {
        return nameInPlats;
    }

    public WebElement getPlusButton() {
        return plusButton;
    }

    public WebElement getSetup() {
        return setup;
    }

    public WebElement getParameters() {
        return parameters;
    }

    public WebElement getBancAccount() {
        return bancAccount;
    }

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getIbanField() {
        return ibanField;
    }

    public WebElement getCurrencySelector() {
        return currencySelector;
    }

    public WebElement getIntegrationCode() {
        return integrationCode;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSearchButtonAnderBankAccount() {
        return searchButtonAnderBankAccount;
    }

}
