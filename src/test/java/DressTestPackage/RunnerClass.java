package DressTestPackage;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "StepClass.class",
        features = "src\\test\\resources\\TestCases"
)
public class RunnerClass {

}
