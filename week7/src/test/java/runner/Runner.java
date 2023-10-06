package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.Base;

@CucumberOptions(features = "src/test/java/feature",
glue = "steps",
monochrome = true,
publish = true,
dryRun = false,
snippets = SnippetType.CAMELCASE)

public class Runner extends Base {

}
