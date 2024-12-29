package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeatureFiles/signup.feature",
        glue = "StepDefinationAutomationTesting",
        plugin = {"pretty", "html:target/Reports/index.html"}
)
public class index {
}
