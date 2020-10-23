package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends DashboardPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passWord;

    @FindBy(xpath = "//input[@id='submit']")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        passWord.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    public boolean isUserOnTheHomePage(){
        String expectedTitle = "Files - Trycloud";
        String actualTitle = Driver.get().getTitle();
        return expectedTitle.equals(actualTitle);
    }

























}
