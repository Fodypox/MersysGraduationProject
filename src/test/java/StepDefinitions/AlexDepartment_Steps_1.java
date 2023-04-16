package StepDefinitions;

import Pages.AlexPOM;
import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AlexDepartment_Steps_1 {

    DialogContent dc = new DialogContent();
    AlexPOM dep = new AlexPOM();

    //1st Scenario
    @Given("Open Department Categories under Setup School Setup")
    public void go_to_departments_categories_under_setup_school_setup() {
        dep.clickMethod(dep.getSetup());
        dep.clickMethod(dep.getSchoolSetup());
        dep.clickMethod(dep.getDepartment());
    }   // Precondition step.


    @When("add new School Department Account")
    public void add_new_school_department_account() {
        dep.clickMethod(dep.getAddSchoolDepartment()); //pluss buttom
//        dep.clickMethod(dep.getNameInput());
        dep.sendKeysMethod(dep.getNameInput(), "Alex");
//        dep.clickMethod(dep.getCodeInput());
        dep.sendKeysMethod(dep.getCodeInput(), "12345");
        dep.clickMethod(dep.getButtonSave());

    }

    @Then("should to see the added account success message")
    public void should_to_see_the_added_account_success_message() {
        // Verify success message.
        dep.verifyContainsText(dep.getSuccessMessage(), "successfully");
        // verification #1

    }

    // 2nd Scenario

    @When("add any exist School Department")
    public void add_any_exist_school_department() {
        add_new_school_department_account(); // Create new account.
        dep.wait(3);
        dep.clickMethod(dep.getAddSchoolDepartment()); //pluss buttom
        dep.sendKeysMethod(dep.getAddSchoolDepartment(), "Alex5");
        dep.sendKeysMethod(dep.getCodeInput(), "123456");
        dep.clickMethod(dep.getButtonSave());
        dep.wait(5);
        dep.clickMethod(dep.getCloseDialog());  //closed after warning message already

    }

    @Then("should be see the warning message")
    public void should_be_see_the_warning_message() {
        dep.verifyContainsText(dep.getWarningMessage(), "already department");
        // Verified success message.  Contains : -- already exist.
        // Second verification step.

    }

    // 3rd Scenario
    @When("edit the School Department Account")
    public void edit_the_school_department_account() {
        // find new account in search option  not compatible here!
        //findAccount();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Edit account
        dep.clickMethod(dep.getEditButtom()); //edit buttom
        dep.sendKeysMethod(dep.getNameInput(), "Alex");
        dep.sendKeysMethod(dep.getCodeInput(), "12345");
        dep.clickMethod(dep.getButtonSave());
        // Edit bank account step.
    }

//    public void findAccount() {  // there is no option to find account for me !!
//        dep.sendKeysMethod(dep.getNameInSearch(), "Alex5");
//        dep.clickMethod(dep.getCurrencyInSearch());
//        dep.clickMethod(dep.getEurInSearchCurrency());
//        dep.clickMethod(dep.getSearchButtonAnderBankAccount());
//    }    // Find bank account step.

    @Then("should be see success edited account success message")
    public void should_be_see_success_edited_account_success_message() {
        dep.verifyContainsText(dep.getSuccessMessage(), "successfully updated");
        // 3rd verification step.

    }

    //4th Scenario
    @Then("should to see the deleted account success message")
    public void should_to_see_the_deleted_account_success_message() {


    }

    //5th Scenario
    @When("try to search deleted School Department account")
    public void try_to_search_deleted_school_department_account() {

    }

    @Then("should to see not found success message")
    public void should_to_see_not_found_success_message() {


    }

}
