package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickLaunchpadPage extends BasePage {


    @FindBy(xpath = "//h1[@class=\"oro-subtitle\"]")
    public WebElement quickLaunchpad;

    @FindBy(xpath = "//a[@href=\"javascript: void(0);\"]")
    public WebElement profileMenu;

    @FindBy(xpath = "//i[@class=\"fa-caret-down\"]")
    public WebElement profileMenuDropdown;

    @FindBy(xpath = "//a[@class='no-hash']")
    public WebElement logoutButton;



    

    

    
}
