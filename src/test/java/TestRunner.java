import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/resoures/features",
        glue = "stepDefinitions",
        monochrome = true,
        tags = "@valid",
        dryRun = false)

public class TestRunner extends AbstractTestNGCucumberTests {
}
