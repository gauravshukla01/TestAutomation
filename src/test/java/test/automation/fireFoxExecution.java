package test.automation;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class fireFoxExecution {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Execution with desired capabilities");
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(cap);
        driver.get("https://demoqa.com");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Execution completed");

    }

}
