package com.fleetgru.step_definitions;

import com.fleetgru.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In this class we will be able to pass pre-post conditions to each scenario and each step
 */
public class Hooks {
    // import from io.cucumber.java, not from junit
    @Before
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    //@Before (value = "@login",order = 1)
    public void setupScenarioForLogins(){
        System.out.println("====This will only apply to scenarios with @login tag");
    }

    // @Before (value = "@db",order = -1)
    public void setupForDatabaseScenarios(){
        System.out.println("====This will only apply to scenarios with @db tag");
    }

    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() ==> if scenario fails this method will return TRUE boolean value

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/Take screenshot if failed");
    }


    public void setupStep(){
        System.out.println("=====> Applying setup using @BeforeStep");
    }


    public void afterStep(){
        System.out.println("=====> Applying teardown using @AfterStep");
    }


}
