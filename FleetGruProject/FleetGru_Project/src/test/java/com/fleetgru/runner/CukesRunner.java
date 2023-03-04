package com.fleetgru.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty",
                    "json:target/Destination/cucumber.json",
                    "html:target/cucumber-report.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber",
            },

            features = "src/test/resources/features",
            glue = "com/fleetgru/step_definitions",
            dryRun = false,
            tags = "@FLEETG-1707",
            publish =false
    )
    public class CukesRunner {
    }


