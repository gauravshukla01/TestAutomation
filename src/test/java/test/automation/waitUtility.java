package test.automation;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import managers.FileReaderManager;


public class waitUtility {

    public static void untilJqueryIsDone(WebDriver driver){
        //untilJqueryIsDone(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
        untilJqueryIsDone(driver, 10L);
    }

    public static void untilJqueryIsDone(WebDriver driver, Long timeoutInSeconds){
        until(driver, (d) ->
        {
            Boolean isJqueryCallDone = (Boolean)((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
            if (!isJqueryCallDone) System.out.println("JQuery call is in Progress");
            return isJqueryCallDone;
        }, timeoutInSeconds);
    }

    public static void untilPageLoadComplete(WebDriver driver) {
        untilPageLoadComplete(driver, 10l);
    }

    public static void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds){
        until(driver, (d) ->
        {
            Boolean isPageLoaded = (Boolean)((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            if (!isPageLoaded) System.out.println("Document is loading");
            return isPageLoaded;
        }, timeoutInSeconds);
    }

    public static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition){
        until(driver, waitCondition, 10L);
    }


    private static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds){
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
        webDriverWait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
        try{
            webDriverWait.until(waitCondition);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void fluentWait(){
        WebDriver driver=null;
        FluentWait fWait = new FluentWait(driver);
        fWait.withTimeout(30, TimeUnit.MILLISECONDS);
        fWait.pollingEvery(30, TimeUnit.MILLISECONDS);
        fWait.ignoring(NoSuchMethodException.class);

        fWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        WebDriverWait eWait = new WebDriverWait(driver,30);
        eWait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();

        Function<WebDriver,Boolean> function = new Function<WebDriver,Boolean>(){

            @Override
            public Boolean apply(WebDriver webDriver) {
                WebElement ele = webDriver.findElement(By.xpath("button"));
                String color = ele.getCssValue("color");
                if (color=="Red"){
                    return true;
                }
                return false;
            }
        };

        fWait.until(function);
        eWait.until(function);

    }

}
