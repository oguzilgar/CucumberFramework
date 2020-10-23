package com.step_definitions;

import com.pages.LoginPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class Login_stepDefs {


    @Given("the user login page with {string} and {string}")
    public void the_user_login_page_with_and(String strUserName, String strPassword) {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        LoginPage loginPage = new LoginPage();
        String user = ConfigurationReader.get("user_01");
        String password = ConfigurationReader.get("password_01");
        loginPage.login(strUserName,strPassword);

    }

    @Given("the user should be on the homepage")
    public void the_user_should_be_on_the_homepage() {
        LoginPage loginPage = new LoginPage();
        Assert.assertEquals(loginPage.isUserOnTheHomePage(),true);
    }





















}
