package Cucumber.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/java/Cucumber/Feature"},
    glue = {"Cucumber.StepDefinition", "Cucumber.Hooks"},
    plugin = {
    		   "pretty",                   // Console output (colorful)
    		   "html:target/html-report",  // Interactive HTML
    		   "json:target/cucumber.json",// Machine readable
    		   "junit:target/junit.xml",   // CI/CD integration
    		   "rerun:target/rerun.txt",   // Failed scenarios only
    		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    		},
    tags = "@background or @regression or @smoke or @hooks or @hooks1 or @hooks2 or @hooks3 or @hooks4 or @DataTableAsMap or @DataTableAsList",
    publish = true
)
public class TestRunner {
}
