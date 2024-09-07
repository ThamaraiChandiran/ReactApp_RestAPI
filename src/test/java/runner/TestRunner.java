package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefenition",
        plugin = {"pretty", "html:target/cucumber-reports-html.html",
                "json:target/report.json"
        }
)

public class TestRunner {
}
