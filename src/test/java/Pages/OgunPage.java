package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class OgunPage extends MyMethods {
    public OgunPage(){
        PageFactory.initElements(BasicDriver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupButton;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Nationalities'])[1]")
    private WebElement nationalitiesButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement addNewNationalityNameBox;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[text()='Nationality successfully created']")
    private WebElement nationalitySuccessfullyCreatedMessage;

    @FindBy(xpath = "//div[contains(text(),'exists')]")
    private WebElement alreadyExistMessage;

    @FindBy(css = "input[data-placeholder='Name']")
    private WebElement nationalitySearchBox;

    @FindBy(xpath = "(//span[text()='Search'])[1]")
    private WebElement SearchButton;

    @FindBy(xpath = "//div[text()='Nationality successfully updated']")
    private WebElement nationalityUpdatedMessage;

    @FindBy(xpath = "//div[text()='Nationality successfully deleted']")
    private WebElement nationalityDeletedMessage;

    @FindBy(xpath = "//div[contains(text(),'no data')]")
    private WebElement noDataDisplayMessage;

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement addNationalityButton;

    @FindBy(css = "svg[data-icon='pen-to-square']")
    private WebElement editButton;

    @FindBy(css = "svg[data-icon='trash-can']")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteConfirmationButton;


    public WebElement getSetupButton() {return setupButton;
    }

    public WebElement getParametersButton() {return parametersButton;
    }

    public WebElement getNationalitiesButton() {return nationalitiesButton;
    }

    public WebElement getAddNewNationalityNameBox() {return addNewNationalityNameBox;
    }

    public WebElement getSaveButton() {return saveButton;
    }

    public WebElement getNationalitySuccessfullyCreatedMessage() {return nationalitySuccessfullyCreatedMessage;
    }

    public WebElement getAlreadyExistMessage() {return alreadyExistMessage;
    }

    public WebElement getNationalitySearchBox() {return nationalitySearchBox;
    }

    public WebElement getSearchButton() {return SearchButton;
    }

    public WebElement getNationalityUpdatedMessage() {return nationalityUpdatedMessage;
    }

    public WebElement getNationalityDeletedMessage() {return nationalityDeletedMessage;
    }

    public WebElement getNoDataDisplayMessage() {return noDataDisplayMessage;
    }

    public WebElement getAddNationalityButton() {return addNationalityButton;
    }

    public WebElement getEditButton() {return editButton;
    }

    public WebElement getDeleteButton() {return deleteButton;
    }

    public WebElement getDeleteConfirmationButton() {return deleteConfirmationButton;
    }

}
