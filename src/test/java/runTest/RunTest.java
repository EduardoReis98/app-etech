package runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
                features = {"src/test/resources/features/"},
                glue = {"curso.etech.steps", "curso.etech.configuration"},
                plugin = {"pretty", "json:reports/cucumber.json"},
                monochrome = true,
                tags = "@smokeTest")

public class RunTest {
}
