package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeatureFiles/InteractionsFeature.feature",
        glue = "StepDefinationAutomationTesting",
        plugin = {"pretty", "html:target/Reports/interaction.html"},
        tags = "@SmokeTest"
)
public class InteractionsRunner {
}
