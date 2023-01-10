package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // path form content root
        features = "src/main/resources/features",
        // features = "src\\main\\resources\\features",

        // to specify name of step definition
        glue ="stepDefinition",
        tags = "@regressions"

)
public class TestRunners {
}
