package pageObject;

import org.openqa.selenium.WebDriver;

public class BaseClass {

    public static WebDriver driver;
    BaseClass(WebDriver driver){
        this.driver =driver;
    }
}
