package org.example.citybikes.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"org.example.citybikes.test.stepdefinitions"},
        features = {"src/test/resources/features"},
        tags = {"@location-not-null"},
        plugin = {"pretty"}
)

public class CucumberRunner {

}