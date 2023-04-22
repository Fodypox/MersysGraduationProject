package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Features/AslanbekPositionCategories.feature",
        "src/test/java/Features/Bank_Account.feature",
        "src/test/java/Features/Nur.feature",
        "src/test/java/Features/YusufEmployeePosition.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunnerForRegressionTest extends AbstractTestNGCucumberTests {

}
