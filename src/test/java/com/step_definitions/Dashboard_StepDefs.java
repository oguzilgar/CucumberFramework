package com.step_definitions;

import com.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Dashboard_StepDefs {
    DashboardPage dashboardPage;

    @Given("the user search {string} in the search button")
    public void the_user_search_in_the_search_button(String strSearch) throws InterruptedException {

        dashboardPage = new DashboardPage();
        dashboardPage.search.sendKeys(strSearch);

    }

    @Then("the user should see the correct name of the file as {string}")
    public void the_user_should_see_the_correct_name_of_the_file_as(String strname) {

        String nameOfFile = dashboardPage.Firstday.getText();

        System.out.println("nameOfFile = " + nameOfFile);
        




    }



































}
