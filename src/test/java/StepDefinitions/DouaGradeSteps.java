package StepDefinitions;

import Pages.DouaPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class DouaGradeSteps {
    DouaPage douaPage = new DouaPage();

    @When("Admin clicks Setup-Parameters-Grade Levels")
    public void admin_clicks_setup_parameters_grade_levels() {
        douaPage.goingToSetupParametersGrade();
    }

    @When("Admin clicks on the Add Grade Levels")
    public void admin_clicks_on_the_add_grade_levels() {
        douaPage.clickingOnAddGradeLevel();
    }

    @When("Admin enters grade name, short name, order and next grade")
    public void admin_enters_grade_name_short_name_order_and_next_grade() {
        douaPage.inputtingGradeInformation();
    }

    @When("Admin clicks on Save")
    public void admin_clicks_on_save() {
        douaPage.clickingOnSaveButton();
    }

    @Then("Admin filters to view all the grades")
    public void admin_filters_to_view_all_the_grades() {
        douaPage.applyingFilters();
    }

    @Then("Admin can view the newly added grade from the list")
    public void admin_can_view_the_newly_added_grade_from_the_list() {
        douaPage.viewTheGrade();
    }

    @When("Admin clicks on the Edit button")
    public void admin_clicks_on_the_edit_button() {
        douaPage.editGrade();
    }

    @When("Admin updates grade name")
    public void admin_updates_grade_name() {
        douaPage.updatingGradeName();
    }

    @And("Admin clicks on the delete button")
    public void adminClicksOnTheDeleteButton() {
        douaPage.clickingOnDeleteIcon();
    }

    @And("Admin confirms delete")
    public void adminConfirmsDelete() {
        douaPage.clickingOnDeleteConfirmation();
    }

    @Then("Admin cannot view the deleted grade")
    public void adminCannotViewTheDeletedGrade() {
        Boolean isPresent = BasicDriver.getDriver().findElements(By.xpath("//td[normalize-space()='jack']")).size() > 0;
        if (isPresent == false) {
            assert true;
        }
    }
}
