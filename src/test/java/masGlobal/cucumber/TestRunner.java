package masGlobal.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:report","json:target/cucumber-reports/CucumberTestReport.json"},
                 features="src/test/resources/features/",
                 glue="masGlobal")
public class TestRunner {
}
