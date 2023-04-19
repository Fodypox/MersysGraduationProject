package StepDefinitions;

import Pages.Bank_Account_POM;
import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bank_Account_Steps {

    DialogContent dc = new DialogContent();
    Bank_Account_POM ba = new Bank_Account_POM();

    @Given("Open Bank Account ander Parameters Setup")
    public void openBankAccountAnderParametersSetup() {
        ba.clickMethod(ba.getSetup());
        ba.clickMethod(ba.getParameters());
        ba.clickMethod(ba.getBancAccount());
    }   // Precondition step.

    @When("I add new Bank Account")
    public void iAddNewBankAccount() {
        // Create new account.
        ba.clickMethod(ba.getPlusButton());
        ba.sendKeysMethod(ba.getNameInPlats(), "edua");
        ba.sendKeysMethod(ba.getIbanInPlats(), "PA78");
        ba.sendKeysMethod(ba.getIntegrationCodeInPlats(), "010103");
        ba.clickMethod(ba.getCurrencyInPlats());
        ba.clickMethod(ba.getSelectCurrencyEUR());
        ba.clickMethod(ba.getSaveButton());
    }    // Add new bank accounts step.


    @Then("I should to see the added account success message")
    public void iShouldToSeeTheAddedAccountSuccessMessage() {
        // Verify success message.
        dc.verifyContainsText(dc.getSuccessMessage(), "successfully");
    }    //  Verification step number one.


    @When("I add any exist Bank Account")
    public void iAddAnyExistBankAccount() {
        iAddNewBankAccount(); // Create new account.
        ba.wait(3);
        // Try to create new account with the same parameters.
        ba.clickMethod(ba.getPlusButton());
        ba.sendKeysMethod(ba.getNameInPlats2(), "edua");
        ba.sendKeysMethod(ba.getIbanInPlat2(), "PA78");
        ba.sendKeysMethod(ba.getIntegrationCodeInPlat2(), "010103");
        ba.clickMethod(ba.getCurrencyInPlats2());
        ba.clickMethod(ba.getSelectCurrencyEUR2());
        ba.clickMethod(ba.getSaveButtonInPlats());
        ba.clickMethod(ba.getCloseDialog());
    }   // Create any exist bank accounts step.//


    @Then("I should be see the warning message")
    public void iShouldBeSeeTheWarningMessage() {
        // Verified success message.  Contains : -- already exist.
        ba.verifyContainsText(ba.getWarningMessage(), "already exists");
    }   // Second verification step.


    @Then("delete account")
    public void deleteAccount() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Search account before delete
        findAccount();
        // Delete account
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ba.getDeleteAfterSearch().click();
        ba.getDeleteInDelete().click();
    }    // Delete bank account step.

    @When("I edit the Bank Account")
    public void iEditTheBankAccount() {
        // find new account in search option
        findAccount();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Edit account
        ba.clickMethod(ba.getEditAfterSearchBtn());
        ba.sendKeysMethod(ba.getNameInPlats2(), "edo");
        ba.sendKeysMethod(ba.getIbanInPlat2(), "PA79");
        ba.sendKeysMethod(ba.getIntegrationCodeInPlat2(), "010105");
        ba.clickMethod(ba.getSaveButtonInPlats());


    }   // Edit bank account step.



    public void findAccount() {
        ba.sendKeysMethod(ba.getNameInSearch(), "edua");
        ba.clickMethod(ba.getCurrencyInSearch());
        ba.clickMethod(ba.getEurInSearchCurrency());
        ba.clickMethod(ba.getSearchButtonAnderBankAccount());
    }    // Find bank account step.

    @Then("I should be see success edited account success message")
    public void iShouldBeSeeSuccessEditedAccountSuccessMessage() {
        ba.verifyContainsText(ba.getSuccessEditMessage(), "successfully updated");
    }    // 3rd verification step.


    @Then("delete updated account")
    public void deleteUpdatedAccount() {
        ba.sendKeysMethod(ba.getNameInSearch(), "edo");
        ba.clickMethod(ba.getSearchButtonAnderBankAccount());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ba.getDeleteAfterSearch().click();
        ba.getDeleteInDelete().click();
    }    // Updated bank account delete step.


    @Then("I should to see the deleted account success message")
    public void iShouldToSeeTheDeletedAccountSuccessMessage() {
        ba.waitUntilVisible(ba.getInfoDisplay());
        iShouldToSeeNotFoundSuccessMessage();
    }     // Verification step #4.

    @When("I try to search deleted bank account")
    public void iTryToSearchDeletedBankAccount() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        findAccount();
    }

    @Then("I should to see not found success message")
    public void iShouldToSeeNotFoundSuccessMessage() {
        String expectMessage = "There is no data to display";
        String actualMessage = ba.getInfoDisplay().getText();
        Assert.assertEquals(actualMessage, expectMessage);
    }

}
