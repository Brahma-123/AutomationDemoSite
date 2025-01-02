package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "StepDefinationAutomationTesting",
        features = "src/test/resources/FeatureFiles/switchToFrames.feature",
        plugin = {"pretty","html:target/Reports/Frames.html"}
)
public class FramesRunner {
}
