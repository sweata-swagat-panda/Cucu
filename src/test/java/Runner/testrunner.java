package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,features="Feature\\TagDemo.Feature",plugin = {"pretty","html:target/Cucumber_programs.html"},tags = {"@SmokeTest"})

public class testrunner {

	
	
}
