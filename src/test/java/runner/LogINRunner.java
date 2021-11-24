package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features/LogIn.feature"}, glue = {"steps"}, dryRun = false,
plugin = {"pretty", "junit:target/JUnitReports/report.xml", "json:target/JSONReports/report.json",
        "html:target/HtmlReports"}
)

public class LogINRunner {
}
