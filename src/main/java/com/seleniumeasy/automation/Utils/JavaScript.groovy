package com.seleniumeasy.automation.Utils

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver

class JavaScript {
    public static void clickJS(WebDriver driver, By by){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",driver.findElement(by));

    }
}
