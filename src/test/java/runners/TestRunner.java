package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        plugin = {"pretty", "html:src/test/cucumber-reports/cucumber-reports.html"}
        //, name = {"Prueba demoblaze"}
)
public class TestRunner {
}
