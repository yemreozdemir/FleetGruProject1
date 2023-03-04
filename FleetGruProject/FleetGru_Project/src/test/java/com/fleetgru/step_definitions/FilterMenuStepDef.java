package com.fleetgru.step_definitions;



import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.ManageFiltersPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class FilterMenuStepDef {
    LoginPage loginPage =new LoginPage();
    ManageFiltersPage manageFiltersPage = new ManageFiltersPage();


    @When("the user navigates to Fleet Vehicles module")
    public void the_user_navigates_to_fleet_vehicles_module() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        manageFiltersPage.navigateToFleetVehicleModule();



    }

    @When("the user clicks filter icon")
    public void the_user_clicks_filter_icon() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        ManageFiltersPage.clickAfterElementisClickable(manageFiltersPage.filterIcon);
    }

    @Then("the manage filters button becomes visible")
    public void the_manage_filters_button_becomes_visible() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        Assert.assertTrue(manageFiltersPage.manageFiltersButton.isDisplayed());
    }

    @When("the user clicks the manage filters button")
    public void the_user_clicks_the_manage_filters_button() {

        manageFiltersPage.waitUntilLoaderScreenDisappear();
        ManageFiltersPage.clickAfterElementisClickable(manageFiltersPage.manageFiltersButton);
//        if (manageFiltersPage.manageFiltersButton.isDisplayed()) {
//            manageFiltersPage.manageFiltersButton.click();
//            BrowserUtils.sleep(5);
//        } else {
//            ManageFiltersPage.waitForClickablility(manageFiltersPage.filterIcon, 10);
//            BrowserUtils.sleep(5);
//            manageFiltersPage.manageFiltersButton.click();
//            BrowserUtils.sleep(5);
//        }

    }

    @Then("filter names become clickable")
    public void filter_names_become_clickable() {

        Select select = new Select(manageFiltersPage.filtersDropdown);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','visibility:visible;');",select);
        select.selectByVisibleText("Tags");
        select.selectByIndex(0);
        select.selectByValue("Driver");
        Assert.assertTrue(select.isMultiple());
    }

    @When("the user clicks one of the filter")
    public void theUserClicksOneOfTheFilter() {

        Select select = new Select(manageFiltersPage.filtersDropdown);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','visibility:visible;');",select);
        select.selectByVisibleText("Tags");


    }

    @Then("the filter turns clicked")
    public void theFilterTurnsClicked() {

        Select select = new Select(manageFiltersPage.filtersDropdown);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','visibility:visible;');",select);
        System.out.println("select.getFirstSelectedOption().getText() = " + select.getFirstSelectedOption().getText());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Tags");
    }

    @When("the user waits because it's driver")
    public void the_user_waits_because_it_s_driver() {
        BrowserUtils.sleep(5);
    }

    @When("the user scroll to filter icon and clicks")
    public void the_user_scroll_to_filter_icon_and_clicks() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        ManageFiltersPage.clickAfterElementisClickable(manageFiltersPage.filterIcon);
    }


    @When("the user types {string} into input box")
    public void theUserTypesIntoInputBox(String arg0) {

        manageFiltersPage.filterInputBox.sendKeys(arg0, Keys.ENTER);
        manageFiltersPage.typedFilter = arg0;


    }




    @Then("typed filter name becomes clickable")
    public void typed_filter_name_becomes_clickable() {
        Select select = new Select(manageFiltersPage.filtersDropdown);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','visibility:visible;');",select);
        select.selectByVisibleText(manageFiltersPage.typedFilter);
        BrowserUtils.sleep(2);
        manageFiltersPage.clickedFilter = select.getAllSelectedOptions().get(0).getText();
        Assert.assertEquals(manageFiltersPage.typedFilter, manageFiltersPage.clickedFilter);

    }


    @When("the user clicks the reset icon")
    public void theUserClicksTheResetIcon() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", manageFiltersPage.resetIcon);

    }

    @Then("all filters removed")
    public void allFiltersRemoved() {

        Select select = new Select(manageFiltersPage.filtersDropdown);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','visibility:visible;');",select);
        Assert.assertFalse(select.getOptions().get(0).isSelected());


    }

}




