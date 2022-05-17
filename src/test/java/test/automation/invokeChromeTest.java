package test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class invokeChromeTest {


    @Test
    public void invokeChrome() throws MalformedURLException, InterruptedException {
        //DesiredCapabilities cap = new DesiredCapabilities();
       // URL url = new URL("http://localhost:4444/wd/hub");
        //cap.setBrowserName(BrowserType.CHROME);

        String remote_url_chrome = "http://localhost:4445/wd/hub";
        //ChromeOptions options = new ChromeOptions();
        ChromeOptions options = new ChromeOptions();

        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),cap);

      //  WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gaura\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd =new ChromeDriver();
        //driver.get("http://google.com");
        wd.manage().window().maximize();
        wd.get("http://google.com");
        Thread.sleep(5000);
        //driver.findElement(By.name("q")).sendKeys("learn automation");
        wd.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        wd.findElement(By.xpath("//*[@id='SIvCob']//*[contains(text(),'English')]")).click();
        //wd.findElement(By.xpath("//*[@class='FPdoLc lJ9FBc']//*[@class='RNmpXc']")).click();
        wd.findElement(By.name("q")).sendKeys("learn automation");
        Thread.sleep(5000);
        wd.findElement(By.xpath("//*[@class='lJ9FBc']//*[@class='gNO89b']")).click();
        System.out.println("will invoke chrome browser PERFECT TIMING ");
        Thread.sleep(50000);
        //wd.quit();
        //driver.quit();
    }

}
