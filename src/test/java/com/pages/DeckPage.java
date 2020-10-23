package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeckPage extends BasePage {


    @FindBy(xpath ="//tbody/tr" )
    public List<WebElement> titles;

    @FindBy(xpath = "//div[@id='boardlist']//tbody/tr[7]//td[2]")
    public  WebElement QAEngineers;

    @FindBy(xpath ="//div[@id='innerBoard']/div[@data-columnindex='0']/div/div/i" )
    public WebElement ToDo;

    @FindBy(xpath ="//form[@name='addCardForm123']" )
    public WebElement ToDotext;

    @FindBy(xpath = "//div[@id='innerBoard']/div/ul/li[5]/div[2]")
    public WebElement story_10;


    @FindBy(xpath = "//div[@id='column1']")
    public WebElement DoingArea;






























}
