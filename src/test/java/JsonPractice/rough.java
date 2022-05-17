package JsonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class rough {
    static WebDriver driver = null;
    public static void main(String[] args) {

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.alertIsPresent());


    }
    static void fluenWaitMethod(){
        // implement a fluent wait method
        FluentWait fWait = new FluentWait(driver);
        fWait.pollingEvery(30,TimeUnit.SECONDS);
        fWait.withTimeout(60,TimeUnit.SECONDS);
        fWait.ignoring(ElementNotVisibleException.class);

        // define the customized function to be passed in the until method of the fluent wait
        Function<WebDriver,Boolean> function = new Function<WebDriver,Boolean>(){
            boolean flag = false;
            @Override
            public Boolean apply(WebDriver driver) {
                if (driver.findElement(By.xpath("")).isEnabled()){
                    flag = true;
                    return flag;
                }


                return flag;
            }
        };

    }
}
