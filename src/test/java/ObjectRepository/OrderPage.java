package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {

    public static class centerContent{

        // define the weblement returning methods
        public static WebElement getTextBox(WebDriver driver){
            // write code for element identification
            return driver.findElement(By.xpath(""));

        }
        public static WebElement clickSubmitBtn(WebDriver driver){
            return driver.findElement(By.xpath(""));
        }

    }

}
