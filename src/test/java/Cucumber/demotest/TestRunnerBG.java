package Cucumber.demotest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\t.selvarajan\\Cucumber\\demotest\\src\\test\\java\\demoBG1.feature",
tags="@RegressionTest")
public class TestRunnerBG {

}
