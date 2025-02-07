
package TestRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
	features= {".//Features/Login.feature",".//Features/createAccount.feature"},
	//for step defintions and hooks
	glue= {"Stepdef","Hooks"},
	//user brackets for more than one
	tags= "@Sanity",
	// tags= "@Regression or @Sanity",
	
     dryRun=false,
    monochrome= true,
    plugin= {"pretty","html:test-output.html"}
)
     public class TestCaseRun {
}
