package com.sparta.rr.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {

    public WebDriver webDriver;
    WebElement webElement;

    public PageBase  (WebDriver driver){
        this.webDriver = driver;
    }

    public void click(By element) {
        webDriver.findElement(element).click();
    }

    public void writeThis(By element, String text){
        webDriver.findElement(element).sendKeys(text);
    }

    public void writeThisElement(By element, String text){
        webDriver.findElement(element).sendKeys(text);
    }
    public String readThis(By element){
       return webDriver.findElement(element).getText();

    }

    private boolean isThisDisplaying(By element){
        return webDriver.findElement(element).isDisplayed();
    }

    public boolean isEmpty(String id, String attribute){
        webElement = webDriver.findElement(By.id(id));
       return webElement.getAttribute(attribute).isEmpty();
    }
}