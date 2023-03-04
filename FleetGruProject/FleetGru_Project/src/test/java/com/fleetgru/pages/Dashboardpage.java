package com.fleetgru.pages;

import com.github.dockerjava.core.exec.WaitContainerCmdExec;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboardpage extends BasePage{

@FindBy (xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboard;

@FindBy(xpath = "//li[@class='dropdown dropdown-level-1']")
    public WebElement fleetButton;

@FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicles;

}
