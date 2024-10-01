package com.runner.RLL_240Testing_FirstCry_Search;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
 
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource/com/feature/Search",
        glue = "com.stepdefinition.RLL240Testing_FirstCry_Search", // Adjust to your package
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class Runner_Search {

}
