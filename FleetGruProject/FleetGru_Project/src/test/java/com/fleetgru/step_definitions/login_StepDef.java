package com.fleetgru.step_definitions;

import com.fleetgru.pages.Dashboardpage;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.QuickLaunchpadPage;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_StepDef {

    LoginPage loginPage = new LoginPage();
    Dashboardpage dashboardpage = new Dashboardpage();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the truck driver user enters username {string}")
    public void the_truck_driver_user_enters_username(String username) {
        loginPage.usernameBox.sendKeys(username);
    }

    @When("the truck driver user enters password {string}")
    public void the_truck_driver_user_enters_password(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @When("the truck driver user clicks enter or login button")
    public void the_truck_driver_user_clicks_enter_or_login_button() {
        loginPage.loginButton.click();
    }

    @Then("the truck driver user can see Quick Launchpad page")
    public void the_truck_driver_user_can_see_quick_launchpad_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(loginPage.loadingBar));

        String actualPage = quickLaunchpadPage.quickLaunchpad.getText();
        String expectedPage = "Quick Launchpad";
        Assert.assertEquals(expectedPage, actualPage);
    }


    @When("the sales manager or store manager user enters username {string}")
    public void the_sales_manager_or_store_manager_user_enters_username(String username) {
        loginPage.usernameBox.sendKeys(username);
    }

    @When("the sales manager or store manager user enters password {string}")
    public void the_sales_manager_or_store_manager_user_enters_password(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @When("the sales manager or store manager user clicks enter or login button")
    public void the_sales_manager_or_store_manager_user_clicks_enter_or_login_button() {
        loginPage.loginButton.click();
    }

    @Then("the sales manager or store manager user can see Dashboard page")
    public void the_sales_manager_or_store_manager_user_can_see_dashboard_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(loginPage.loadingBar));

        String actualPagePart = dashboardpage.dashboard.getText();
        String expectedPagePart = "Dashboard";
        Assert.assertEquals(actualPagePart, expectedPagePart);
    }

    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String string, String string2) {
        loginPage.usernameBox.sendKeys(string);
        loginPage.passwordBox.sendKeys(string2);
    }

    @When("the user clicks enter or login button")
    public void the_user_clicks_enter_or_login_button() {
        loginPage.loginButton.click();
    }

    @Then("the user should see warning message")
    public void the_user_should_see_warning_message() {
        String actualMessage = loginPage.invalidCredentialsMessage.getText();
        String expectedMessage = "Invalid user name or password.";
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @When("the user enters password")
    public void the_user_enters_password() {
        Faker faker = new Faker();
        loginPage.loginButton.sendKeys(faker.bothify("##?###?#"));
    }

    @Then("the user should see the password in bullet signs")
    public void the_user_should_see_the_password_in_bullet_signs() {
        String actualPasswordBoxType = loginPage.passwordBox.getAttribute("type");
        String expectedPasswordBoxType = "password";
        Assert.assertEquals(actualPasswordBoxType, expectedPasswordBoxType);
    }

    @When("the user clicks forgot password button")
    public void the_user_clicks_forgot_password_button() {
        loginPage.forgotPasswordLink.click();
    }

    @Then("the user should land on forgot password page")
    public void the_user_should_land_on_forgot_password_page() {
        String actualForgotPasswordPageTitle = Driver.getDriver().getTitle();
        String expectedForgotPasswordPageTitle = "Forgot Password";
        Assert.assertEquals(actualForgotPasswordPageTitle, expectedForgotPasswordPageTitle);
    }

    @When("the user is able to see remember me on this computer link")
    public void the_user_is_able_to_see_remember_me_on_this_computer_link() {
        String actualRememberMeLinkText = loginPage.rememberMeMessage.getText();
        String expectedRememberMeLinkText = "Remember me on this computer";
        Assert.assertEquals(actualRememberMeLinkText, expectedRememberMeLinkText);
    }

    @Then("the user should be able to click check box")
    public void the_user_should_be_able_to_click_check_box() {
        loginPage.rememberMeCheckBox.click();

    }

    @When("the user enters valid credentials and hits enter key instead of clicking login button")
    public void the_user_enters_valid_credentials_and_hits_enter_key_instead_of_clicking_login_button() {
        loginPage.usernameBox.sendKeys("user1");
        loginPage.passwordBox.sendKeys("UserUser123" + Keys.ENTER);
    }

    @Then("the user should be able to navigate correct page")
    public void the_user_should_be_able_to_navigate_correct_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(loginPage.loadingBar));

        String actualPage = quickLaunchpadPage.quickLaunchpad.getText();
        String expectedPage = "Quick Launchpad";
        Assert.assertEquals(actualPage, expectedPage);
    }

    @When("the user does not fill username or password")
    public void the_user_does_not_fill_username_or_password() {
        loginPage.usernameBox.sendKeys("");
        loginPage.passwordBox.sendKeys("UserUser123");
    }

    @When("the user clicks on login button")
    public void the_user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

    @Then("the user should be able to see warning message on login page")
    public void the_user_should_be_able_to_see_warning_message_on_login_page() {
        String actualWarningMessage = loginPage.usernameBox.getAttribute("validationMessage");
        String expectedWarningMessage = "Lütfen bu alanı doldurun.";
        Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
    }

    @Then("the truck driver user can see username {string} in profile menu on Quick Launchpad page")
    public void the_truck_driver_user_can_see_username_in_profile_menu_on_quick_launchpad_page(String username) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(loginPage.loadingBar));
        String actualName = quickLaunchpadPage.profileMenu.getText();
        Assert.assertEquals(username, actualName);
    }

    @Then("the sales manager or store manager user can see username {string} in profile menu on Dashboard page")
    public void the_sales_manager_or_store_manager_user_can_see_username_in_profile_menu_on_dashboard_page(String username) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(loginPage.loadingBar));
        String actualName = quickLaunchpadPage.profileMenu.getText();
        Assert.assertEquals(username, actualName);
    }


}
