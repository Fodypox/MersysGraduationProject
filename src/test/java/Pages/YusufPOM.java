package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YusufPOM extends MyMethods {
    public YusufPOM () {
        PageFactory.initElements(BasicDriver.getDriver(),this);}

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResourcesButton;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupButton;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement positionsButton;

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement addPositionButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement addName;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    private WebElement addShortName;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement errorMessage;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    private WebElement nameSearch;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy(css = ".svg-inline--fa.fa-pen-to-square")
    private WebElement editButton;

    @FindBy(css = "ms-delete-button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement confirmDeleteButton;

    @FindBy(xpath = "//div[contains(text(),'There is no data to display')]")
    private WebElement messageForNonExistingData;

    public WebElement getHumanResourcesButton() {
        return HumanResourcesButton;
    }

    public WebElement getSetupButton() {
        return setupButton;
    }

    public WebElement getPositionsButton() {
        return positionsButton;
    }

    public WebElement getAddPositionButton() {
        return addPositionButton;
    }

    public WebElement getAddName() {
        return addName;
    }

    public WebElement getAddShortName() {
        return addShortName;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getNameSearch() {
        return nameSearch;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getConfirmDeleteButton() {
        return confirmDeleteButton;
    }

    public WebElement getMessageForNonExistingData() {
        return messageForNonExistingData;
    }

}
