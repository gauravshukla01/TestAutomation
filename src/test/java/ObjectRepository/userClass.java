package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class userClass {
static WebDriver driver;
    public static void main(String[] args) {
        WebElement TextBox = OrderPage.centerContent.getTextBox(driver);
    }
}
