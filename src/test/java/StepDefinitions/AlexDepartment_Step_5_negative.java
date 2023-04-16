package StepDefinitions;

import Pages.AlexPOM;
import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlexDepartment_Step_5_negative {

    DialogContent dc = new DialogContent();   // ???? what dc ???
    AlexPOM dep = new AlexPOM();

    @When("try to search deleted School Department account")
    public void try_to_search_deleted_school_department_account() {

    }

    @Then("should to see not found success message")
    public void should_to_see_not_found_success_message() {

    }
}
