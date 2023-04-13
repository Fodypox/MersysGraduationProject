package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class DouaPage extends MyMethods {
    public DouaPage() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='nav-link-title ng-tns-c111-7 ng-star-inserted'])[1]")
    WebElement setupMenu;
    @FindBy(xpath = "(//span[@class='nav-link-title ng-tns-c111-8 ng-star-inserted'])[1]")
    WebElement parametersMenu;
    @FindBy(xpath = "//span[normalize-space()='Grade Levels']")
    WebElement gradesLevelMenu;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-badge mat-icon-button mat-button-base mat-badge-accent mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']//span[@class='mat-button-wrapper']")
    WebElement addingGradesButton;
    @FindBy(xpath = "(//input[@id='ms-text-field-0'])[1]")
    WebElement nameField;
    @FindBy(xpath = "(//input[@id='ms-text-field-1'])[1]")
    WebElement shortNameField;
    @FindBy(xpath = "(//input[@id='ms-text-field-2'])[1]")
    WebElement orderField;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")
    WebElement saveButton;
    @FindBy(xpath = "(//div[@class='mat-form-field-infix ng-tns-c12-50'])[1]")
    WebElement filters;
    @FindBy(xpath = "//span[normalize-space()='500']")
    WebElement filtersByFiveHundred;
    @FindBy(xpath = "//td[normalize-space()='jack']")
    WebElement findingJack;
    @FindBy(xpath = "//td[normalize-space()='jack']")
    WebElement editIcon;
    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[34]")
    WebElement deleteIcon;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement deleteConfirm;

    private void modifyImplicitWaits() {
        BasicDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    private void turnOffImplicitWaits() {
        BasicDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    }

    private void turnOnImplicitWaits() {
        BasicDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void goingToSetupParametersGrade() {
        clickMethod(setupMenu);
        clickMethod(parametersMenu);
        clickMethod(gradesLevelMenu);
    }

    public void clickingOnSetup() {
        clickMethod(setupMenu);
    }

    public void clickingOnAddGradeLevel() {
        clickMethod(addingGradesButton);
    }

    public void inputtingGradeInformation() {
        nameField.click();
        nameField.sendKeys("jack");
        shortNameField.click();
        shortNameField.sendKeys("jk");
        orderField.click();
        orderField.sendKeys("1");
    }

    public void clickingOnSaveButton() {
        clickMethod(saveButton);
    }

    public void applyingFilters() {
        clickMethod(filters);
        clickMethod(filtersByFiveHundred);
    }

    public void viewTheGrade() {
        isPresent(findingJack);
    }

    public boolean findingGradeAfterDelete() {
        modifyImplicitWaits();
        isDisplayed(findingJack);
        turnOnImplicitWaits();
        return false;
    }

    public void editGrade() {
        editIcon.click();
    }

    public void updatingGradeName() {
        nameField.sendKeys("1");
    }

    public void clickingOnDeleteIcon() {
        deleteIcon.click();
    }

    public void clickingOnDeleteConfirmation() {
        deleteConfirm.click();
    }
}
