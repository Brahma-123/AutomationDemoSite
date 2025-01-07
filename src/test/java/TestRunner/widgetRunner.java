package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "StepDefinationAutomationTesting",
        features = "src/test/resources/FeatureFiles/WidgetFeature.feature",
        plugin = {"pretty","html:target/Reports/Widgets.html"}
)
public class widgetRunner {

}
