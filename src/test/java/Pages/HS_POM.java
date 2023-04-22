package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HS_POM extends MyMethods {
    public HS_POM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement educationButton;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setupButton;

    @FindBy(xpath = "(//span[text()='Subject Categories'])[1]")
    private WebElement subjectCategoriesButton;

    @FindBy(xpath = "//ms-add-button[@tooltip='SUBJECT_CATEGORIES.TITLE.ADD']")
    private WebElement addSubjectButton;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement nameForNewSubject;
    @FindBy(xpath = "(//input[@type='text'])[4]")
    private WebElement codeForNewSubject;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[text()='Subject Category successfully created']")
    private WebElement newSubjectSuccessMessage;

    @FindBy(xpath = "//div[text()='The Subject Category with Name \"Subject\" already exists.']")
    private WebElement nameAlreadyExistsMessage;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement searchNameForSubject;

    @FindBy(xpath = "//button[@class='mat-raised-button']")
    private WebElement searchButtonForCategories;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[11]")
    private WebElement editSubjectButton;

    @FindBy(xpath = "//div[text()='Subject Category successfully updated']")
    private WebElement successMessageAfterEdit;

    @FindBy(xpath = "//mat-error[text()=' This field is required!']")
    private WebElement requiredFieldErrorMessage;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[11]")
    private WebElement editButtonAfterSubjectSearch;

    @FindBy(css = "svg[data-icon='trash-can']")
    private WebElement deleteButtonAfterSearch;

    @FindBy(xpath = "//span[contains(text(), 'Delete')]")
    private WebElement confirmDeleteOnPopUp;

    @FindBy(xpath = "//div[text()='Subject Category successfully deleted']")
    private WebElement successfullyDeletedMessage;


    public WebElement getEducationButton() {
        return educationButton;
    }

    public WebElement getSetupButton() {
        return setupButton;
    }

    public WebElement getSubjectCategoriesButton() {
        return subjectCategoriesButton;
    }

    public WebElement getAddSubjectButton() {
        return addSubjectButton;
    }

    public WebElement getNameForNewSubject() {
        return nameForNewSubject;
    }

    public WebElement getCodeForNewSubject() {
        return codeForNewSubject;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getNewSubjectSuccessMessage() {
        return newSubjectSuccessMessage;
    }

    public WebElement getNameAlreadyExistsMessage() {
        return nameAlreadyExistsMessage;
    }

    public WebElement getSearchNameForSubject() {
        return searchNameForSubject;
    }

    public WebElement getSearchButtonForCategories() {
        return searchButtonForCategories;
    }

    public WebElement getEditSubjectButton() {
        return editSubjectButton;
    }

    public WebElement getSuccessMessageAfterEdit() {
        return successMessageAfterEdit;
    }

    public WebElement getRequiredFieldErrorMessage() {
        return requiredFieldErrorMessage;
    }

    public WebElement getEditButtonAfterSubjectSearch() {
        return editButtonAfterSubjectSearch;
    }

    public WebElement getDeleteButtonAfterSearch() {
        return deleteButtonAfterSearch;
    }

    public WebElement getConfirmDeleteOnPopUp() {
        return confirmDeleteOnPopUp;
    }

    public WebElement getSuccessfullyDeletedMessage() {
        return successfullyDeletedMessage;
    }
}
