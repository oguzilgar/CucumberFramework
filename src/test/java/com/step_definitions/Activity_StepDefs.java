package com.step_definitions;

import com.pages.ActiviyPage;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Activity_StepDefs {



    @Given("the user navigates to {string} module")
    public void the_user_navigates_to_module(String module) throws InterruptedException {

        ActiviyPage activiyPage = new ActiviyPage();
        activiyPage.navigation(module);
        Thread.sleep(2000);

    }

    @Then("the user should be in the activity module")
    public void the_user_should_be_in_the_activity_module() {

        Driver.get().getTitle();
        System.out.println(" Driver.get().getTitle() = " +  Driver.get().getTitle());


    }







































}
