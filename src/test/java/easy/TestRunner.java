package easy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", 
glue= {"easy","easy1"},plugin= {"html:target"}, 
tags= {"@Forms,@Table,@Sliders"}, dryRun=false, monochrome=true )

public class TestRunner {
	
}
