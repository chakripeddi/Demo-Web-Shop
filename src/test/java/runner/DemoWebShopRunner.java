package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {
				
				//chakrapani
				"C:\\Users\\peddi.chakrapani\\Eclipse-new\\DemoWebShop\\src\\test\\resources\\Community_poll.feature",
			
		},
		glue = {"stepDefintion"},
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				  "html:target/TestreportToday.html",
				  "rerun:target/failed.txt"}, 
		monochrome = true )
public class DemoWebShopRunner extends AbstractTestNGCucumberTests {

}
