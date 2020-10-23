package com.step_definitions;

import com.pages.DashboardPage;
import com.pages.FilesPage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Files_StepDefs {


    @Then("the files names should be")
    public void the_files_names_should_be(List<String> fileList) {

        FilesPage filesPage = new FilesPage();

        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : filesPage.fileLocator) {
            elemTexts.add(el.getText());
        }

        System.out.println(elemTexts);

        Assert.assertEquals(elemTexts,fileList);











    }

































}
