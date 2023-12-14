import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
// if tags=@invalid, feature file test1 and test2 will not get executed
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        monochrome = true,
        tags = "@valid",
        dryRun = false)

public class TestRunner extends AbstractTestNGCucumberTests {

}