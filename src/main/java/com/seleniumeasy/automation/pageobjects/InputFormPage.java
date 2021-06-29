package com.seleniumeasy.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.seleniumeasy.com/test/input-form-demo.html")
public class InputFormPage extends PageObject {
    public By Name = By.name("first_name");
    public By LastName = By.name("last_name");
    public By Email = By.name("email");
    public By Phone = By.name("phone");
    public By Address = By.name("address");
    public By City = By.name("city");
     public By Zipcode = By.name("zip");
    public By Domain = By.name("website");
    public By Comment = By.name("comment");
    public By SendButton = By.className("btn btn-default");

    public void sendName(String string){
        getDriver().findElement(Name).sendKeys(string);
    }
    public void sendLastName(String string){
        getDriver().findElement(LastName).sendKeys(string);
    }
    public void sendEmail(String string){
        getDriver().findElement(Email).sendKeys(string);
    }
    public void sendPhone(String string){
        getDriver().findElement(Phone).sendKeys(string);
    }
    public void sendAddress(String string){
        getDriver().findElement(Address).sendKeys(string);
    }
    public void sendCity(String string){
        getDriver().findElement(City).sendKeys(string);
    }
    public void sendZipcode(String string){
        getDriver().findElement(Zipcode).sendKeys(string);
    }
    public void sendDomain(String string){
        getDriver().findElement(Domain).sendKeys(string);
    }
    public void sendComment(String string){
        getDriver().findElement(Comment).sendKeys(string);
    }
    public void clickSendButton(){getDriver().findElement(SendButton).click();
    }
}
