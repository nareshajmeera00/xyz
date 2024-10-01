package com.runner.RLL_240Testing_FirstCry_AddToCart;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resource/com/feature/AddToCart/AddToCart.feature",
glue = "com.stepdefinition.RLL_240Testing_FirstCry_AddToCart",
plugin = {"pretty", "html:target/cucumber-reports.html"},
tags = "@Search or @AddToCart",
monochrome = true)

public class RunnerTestNG extends AbstractTestNGCucumberTests{

}
