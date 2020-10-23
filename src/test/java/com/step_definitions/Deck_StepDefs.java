package com.step_definitions;

import com.pages.DeckPage;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Deck_StepDefs {

    DeckPage deckPage = new DeckPage();
    Actions actions = new Actions(Driver.get());

    @Then("the user should see the all the correct titles")
    public void the_user_should_see_the_all_the_correct_titles(List<String> expextedTitleList) {

        DeckPage deckPage = new DeckPage();
        List<WebElement> titlesLocators = deckPage.titles;

        List<String> actualTitleList = new ArrayList<>();
        for (WebElement titlesLocator : titlesLocators) {
            
            actualTitleList.add(titlesLocator.getText());
            
        }

        System.out.println("actualTitleList = " + actualTitleList);

        Assert.assertEquals(actualTitleList,expextedTitleList);

    }
    @Then("the user click on {string} button")
    public void the_user_click_on_button(String string) throws InterruptedException {



        deckPage.QAEngineers.click();

        /*
        try {
            deckPage.ToDo.click();
        }catch (Exception e) {
            actions.moveToElement(deckPage.ToDo).click().build().perform();
        }
*/
    }

    @Then("the user should be able to send new task to the To Do list")
    public void the_user_should_be_able_to_send_new_task_to_the_To_Do_list(List<String> list) throws InterruptedException {

         deckPage = new DeckPage();

            JavascriptExecutor jse = (JavascriptExecutor) Driver.get() ;

            //jse.executeScript("arguments[0].setAttribute('value', '" + str + "')",deckPage.ToDotext);

        for (String s : list) {
            Thread.sleep(1000);
            actions.sendKeys(deckPage.ToDotext,s,Keys.ENTER).build().perform();
        }


    }




    @Then("the user moves a story from {string} to {string}")
    public void the_user_moves_a_story_from_to(String string, String string2) throws InterruptedException {

        Thread.sleep(2000);
        //actions.dragAndDrop(deckPage.story_10,deckPage.DoingArea).pause(2000).perform();
         actions.moveToElement(deckPage.story_10).clickAndHold().perform();
         actions.moveToElement(deckPage.DoingArea).pause(2000).release().build().perform();

        Thread.sleep(2000);








    }































}
