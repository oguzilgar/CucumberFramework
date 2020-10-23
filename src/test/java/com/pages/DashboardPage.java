package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

@FindBy(xpath = "//input[@id='searchbox']")
public WebElement search;

@FindBy(xpath = "//header[@id='header']//div[@class='notifications']")
public WebElement notifications;

@FindBy(xpath = "//header[@id='header']//div[@id='contactsmenu']")
public WebElement contactsmenu;

@FindBy(xpath = "//header[@id='header']//div[@id='settings']")
public WebElement settings;


@FindBy(xpath = "//tr[@data-id='28360']//span[text()='Firstday']")
public WebElement Firstday;








































}
