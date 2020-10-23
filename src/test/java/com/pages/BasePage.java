package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class  BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }





    public void navigation(String moduleName){

        String moduleLocator = "//ul[@id='appmenu']/li[@data-id='"+ moduleName +"']";
       // String tabLocator = "//div[@id='app-navigation']/ul/li//span[text()='"+ tab +"']";

        try{

            WebElement moduleEleemnt = Driver.get().findElement(By.xpath(moduleLocator));
            Actions actions = new Actions(Driver.get());
            actions.doubleClick(moduleEleemnt).build().perform();
        }catch (Exception e){

            Driver.get().findElement(By.xpath(moduleLocator));

        }
/*
        try{

          //  WebElement tabEleemnt = Driver.get().findElement(By.xpath(tabLocator));
           /// Actions actions = new Actions(Driver.get());
          //  actions.doubleClick(tabEleemnt).build().perform();

        }catch (Exception e){

            BrowserUtils.waitForVisibility(By.xpath(tabLocator),5);
            Driver.get().findElement(By.xpath(tabLocator));

        }

*/







    }


































}