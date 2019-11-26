package nemi_package1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"json:src/main/java/CustomEReports/output/cucumber.json"})
public class calc1r {

}
