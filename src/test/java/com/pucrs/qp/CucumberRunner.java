package com.pucrs.qp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
		plugin = {
				"pretty",
				"summary",
		},
		features = {"src/test/resources"},
		glue = {"com.pucrs.qp"})
public class CucumberRunner {
}