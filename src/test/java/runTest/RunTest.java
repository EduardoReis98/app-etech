package runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
                features = {"src/test/resources/features/"},
                glue = {"curso.etech.steps", "curso.etech.configuration"},
                plugin = {"pretty"}, monochrome = true,
                tags = "@testeLoginCorreto")

public class RunTest {
}
