package com.webOrder.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/webOrder/step_definitions",
        features = "src/test/resources/features",
        dryRun = true,
        strict = false,
        tags = "@login_Task",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber3.json"
        }

)
public class CucumberRunner {


}
