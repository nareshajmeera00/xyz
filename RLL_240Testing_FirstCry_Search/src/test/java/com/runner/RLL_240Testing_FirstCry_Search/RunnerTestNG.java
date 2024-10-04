package com.runner.RLL_240Testing_FirstCry_Search;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resource\\com\\feature\\Search\\Search.feature",
glue = "com.stepdefinition.RLL240Testing_FirstCry_Search",
plugin = {"pretty", "html:target/cucumber-reports.html"},
tags = "@Search",
monochrome = true)

public class RunnerTestNG extends AbstractTestNGCucumberTests{

}
