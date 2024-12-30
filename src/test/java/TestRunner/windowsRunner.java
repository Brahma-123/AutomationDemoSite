package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeatureFiles/switchToWindows.feature",
        glue = "StepDefinationAutomationTesting",
        plugin = {"pretty", "html:target/Reports/windows.html"}

)
public class windowsRunner {
}
