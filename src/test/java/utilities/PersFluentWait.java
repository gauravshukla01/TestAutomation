package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class PersFluentWait {
    public static void main(String[] args) {
        WebDriver driver=null;
        FluentWait fWait = new FluentWait(driver);
        fWait.pollingEvery(30, TimeUnit.SECONDS);
        fWait.withTimeout(15,TimeUnit.SECONDS);
        fWait.ignoring(NoSuchElementException.class);

        // define the specific function to be passed in the wait.untill method

        Function<WebDriver,Boolean> function = new Function<WebDriver,Boolean>(){

            @Override
            public Boolean apply(WebDriver webDriver) {
                boolean flag = false;
                if (webDriver.findElement(By.xpath("")).isEnabled()){
                    flag = true;
                    return flag;
                }
                return flag;
            }
        };

        fWait.until(function);
    }

    public void waitMethod(){
        // write a method to declare wait
        WebDriver driver = null;
        WebDriverWait pWait= new WebDriverWait(driver,30 );
        pWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("find the xpath")));

    }
}
