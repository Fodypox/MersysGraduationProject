package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AslanbekPOM extends MyMethods {
    public AslanbekPOM() {
        PageFactory.initElements(BasicDriver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HRBtn;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupBtnUnderHR;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement positionCategoriesBtnUnderHR;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement nameUnderAdd;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement addBtn;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement errorMessage;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    private WebElement nameSearch;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchBtn;

    @FindBy(css = ".svg-inline--fa.fa-pen-to-square")
    private WebElement editBtn;

    @FindBy(css = "ms-delete-button")
    private WebElement deleteBtn;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement confirmDeleteBtn;

    @FindBy(xpath = "//div[contains(text(),'There is no data to display')]")
    private WebElement messageForNonExistingData;

    public WebElement getHRBtn() {
        return HRBtn;
    }

    public WebElement getSetupBtnUnderHR() {
        return setupBtnUnderHR;
    }

    public WebElement getPositionCategoriesBtnUnderHR() {
        return positionCategoriesBtnUnderHR;
    }

    public WebElement getNameUnderAdd() {
        return nameUnderAdd;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getAddBtn() {
        return addBtn;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getNameSearch() {
        return nameSearch;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getEditBtn() {
        return editBtn;
    }

    public WebElement getDeleteBtn() {
        return deleteBtn;
    }

    public WebElement getConfirmDeleteBtn() {
        return confirmDeleteBtn;
    }

    public WebElement getMessageForNonExistingData() {
        return messageForNonExistingData;
    }
}
