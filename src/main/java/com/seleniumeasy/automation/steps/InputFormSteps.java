package com.seleniumeasy.automation.steps;

//import com.seleniumeasy.automation.Utils.JavaScript;
//import com.seleniumeasy.automation.Utils.JavaScript;
import com.seleniumeasy.automation.Utils.Times;
import com.seleniumeasy.automation.models.DataInjection;
import com.seleniumeasy.automation.pageobjects.InputFormPage;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

//import static com.seleniumeasy.automation.Utils.JavaScript.*;

public class InputFormSteps {
    InputFormPage inputFormPage = new InputFormPage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser()  {
        inputFormPage.open();

    }

    @Step
    public void fillForm() throws InterruptedException{
        inputFormPage.getDriver().manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        Times.waitFor(2000);
        inputFormPage.sendName(dataInjection.getName());
        inputFormPage.sendLastName(dataInjection.getLastname());
        inputFormPage.sendEmail(dataInjection.getEmail());
        inputFormPage.sendPhone(dataInjection.getPhone());
        inputFormPage.sendAddress(dataInjection.getAddress());
        inputFormPage.sendCity(dataInjection.getCity());
        inputFormPage.sendZipcode(dataInjection.getZipcode());
        inputFormPage.sendDomain(dataInjection.getWebdomain());
        inputFormPage.sendComment(dataInjection.getComent());
        Times.waitFor(2000);
        inputFormPage.clickSendButton();
    }
}
