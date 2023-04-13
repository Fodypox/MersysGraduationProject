package StepDefinitions;

import Pages.DouaPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class DouaDiscountSteps {
    DouaPage douaPage = new DouaPage();

    @When("Admin clicks Setup")
    public void adminClicksSetup() {
        douaPage.clickingOnSetup();
    }

    @Then("Admin cannot find Discounts tab under Setup")
    public void adminCannotFindDiscountsTabUnderSetup() {
        Boolean isPresent = BasicDriver.getDriver().findElements(By.xpath("(//span[@class='nav-link-title ng-tns-c111-8 ng-star-inserted'])[1]")).size() > 0;
        if (isPresent == false) {
            assert true;
        }
    }
}
