import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Anna on 2017-10-08.
 */

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"progress", "html:out"},
            snippets = SnippetType.CAMELCASE,
            features="src/test/resources"
    )

    public class TestRunner {
    }


