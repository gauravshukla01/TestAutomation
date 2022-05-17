package test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class invokeToolsSQA {


    @Test
    public void invokeToolsSQA() throws MalformedURLException, InterruptedException {
        //DesiredCapabilities cap = new DesiredCapabilities();
        // URL url = new URL("http://localhost:4444/wd/hub");
        //cap.setBrowserName(BrowserType.CHROME);

        String remote_url_chrome = "http://localhost:4445/wd/hub";
        //ChromeOptions options = new ChromeOptions();
        ChromeOptions options = new ChromeOptions();

        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),cap);

        //  WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\gaura\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gaura\\Downloads\\software\\chromedriver_win32\\chromedriver_win32_99\\chromedriver.exe");
        WebDriver wd =new ChromeDriver();

        wd.manage().window().maximize();
        wd.get("https://demoqa.com/");
        Thread.sleep(10000);
        new WebDriverWait(wd, 20).until(ExpectedConditions.elementToBeClickable
         (By.xpath("(//*[@class='card mt-4 top-card'])[1]"))).click();
        //wd.findElement(By.xpath("(//*[@class='avatar mx-auto white'])[1]")).click();
        //wd.findElement(By.xpath("//*[@id='proceed-link']")).click();
        wd.findElement(By.xpath("//*[@id='item-0'][1]")).click();
        Thread.sleep(5000);
       // wd.findElement(By.xpath("//*[@class='card-body']//*[contains(text(),'Elements')]")).click();
       wd.findElement(By.xpath("//*[@id='userName']")).sendKeys("myname is ---");

        //wd.quit();
        //driver.quit();
    }

}
