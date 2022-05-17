package test.automation;



//import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.*;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class AjaxSelenium {


    public WebDriver wd;

    @BeforeTest
    public void instantiateBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaura\\Downloads\\software\\chromedriver_win32\\chromedriver_win32_99\\chromedriver.exe");

        //Create a map to store  preferences
            Map<String, Object> prefs = new HashMap<String, Object>();

        //add key and value to map as follow to switch off browser notification
        //Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 2);

        //Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

// set ExperimentalOption - prefs
        //options.setExperimentalOption("prefs", prefs);
       // options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
        wd = new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test (enabled=false)
    public void testAjax(){
        // method for handling the ajax calls and then next step will be to handle a webtable
        wd.get("https://www.google.com/");
        wd.findElement(By.cssSelector("input[name=q]")).sendKeys("kashmr files india movie");
        List<WebElement> searchContext = new ArrayList<WebElement>();
        searchContext = wd.findElements(By.cssSelector("ul.erkvQe[role=listbox]>div>ul>li"));

        for (WebElement ele : searchContext){
            System.out.println(ele.getText());
        }
        searchContext.get(5).click();

    }

    public void fluentWait(WebDriver driver , WebElement ele){
        FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
        fluentWait.withTimeout(5000, TimeUnit.MILLISECONDS);
        fluentWait.pollingEvery(2000,TimeUnit.MILLISECONDS);

        Function<WebDriver,Boolean> function = new Function<WebDriver,Boolean>(){
            @Override
            public Boolean apply(WebDriver driver) {
                // code to handle the element.. may be a click

                return null;
            }
        };
        fluentWait.until(function);
        //Wait fluentWait = fluentWait;
        //fluentWait.un
    }

    @Test (enabled = false)
    public void getColor(){
        wd.get("https://shop.demoqa.com/my-account/");
        // xpath for the login button is //button[@type='submit' and @name='login']
        String color = wd.findElement(By.xpath("//button[@type='submit' and @name='login']")).getCssValue("color");
        System.out.println("color is "+color);
        System.out.println(Color.fromString(color).asHex());


    }

    @Test (enabled = false)
    public void progressBarTest() throws InterruptedException {
        wd.get("https://demoqa.com/progress-bar");
        JavascriptExecutor executor = (JavascriptExecutor)wd;
        wd.findElement(By.cssSelector("a#close-fixedban")).click();
      //  wd.findElement(By.cssSelector("button#startStopButton")).click();
        Thread.sleep(5000);
        System.out.println( wd.findElement(By.xpath("//div[@role='progressbar']")).getAttribute("aria-valuenow").toString());
        WebElement element = wd.findElement(By.xpath("//li[contains(@id,'-3')]/span[text()='Slider']"));
        Actions acts = new Actions(wd);
        acts.moveToElement(element,50,0).perform();
        element.click();
        // logic to wait till the progress bar is completed:
       /* Wait nWait = new WebDriverWait(wd,15);
        nWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='progressbar' and @aria-valuenow='100']")));*/
        //wd.findElement(By.xpath("//button[@id='resetButton']")).click();


       // executor.executeScript("arguments[0].scrollIntoView();",element );
        //wd.findElement(By.xpath("//li[contains(@id,'-3')]/span[text()='Slider']")).click();
       // wd.findElement(By.xpath("//div[@class='avatar mx-auto white']/following-sibling::div//*[contains(text(),'gets')]/parent::div")).click();
    }


    @Test (enabled = true)
    public void sliderTest() throws InterruptedException {
        wd.get("https://demoqa.com/progress-bar");
        JavascriptExecutor executor = (JavascriptExecutor)wd;
        wd.findElement(By.cssSelector("a#close-fixedban")).click();
        WebElement element = wd.findElement(By.xpath("//li[contains(@id,'-3')]/span[text()='Slider']"));
        //  wd.findElement(By.cssSelector("button#startStopButton")).click();
        executor.executeScript("arguments[0].scrollIntoView();",element );
        element.click();
        Thread.sleep(1000);
         WebElement sliderEle = wd.findElement(By.
                 xpath("//input[@class='range-slider range-slider--primary']"));


        Thread.sleep(5000);
        Actions acts = new Actions(wd);
        acts.dragAndDropBy(sliderEle,320,0).perform();
        //sliderEle.click();
        Thread.sleep(5000);
        acts.dragAndDropBy(sliderEle,-150,0).perform();
        //sliderEle.click();
        // logic to wait till the progress bar is completed:


               // wd.findElement(By.xpath("//div[@class='avatar mx-auto white']/following-sibling::div//*[contains(text(),'gets')]/parent::div")).click();
    }


    @Test (enabled = false)
    public void keysTest() throws InterruptedException {
        wd.get("https://demoqa.com/text-box");
        JavascriptExecutor executor = (JavascriptExecutor)wd;
        wd.findElement(By.cssSelector("a#close-fixedban")).click();
        WebElement textBox = wd.findElement(By.cssSelector("#currentAddress"));
        Actions act = new Actions(wd);
        act.keyDown(Keys.SHIFT).perform();
        textBox.sendKeys("my address is in pune");
        act.keyUp(Keys.SHIFT).perform();
        // select the content
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();
        // copy the content
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();
        // permanent address
        WebElement permAdd = wd.findElement(By.cssSelector("#permanentAddress"));

        // paste the content
        act.keyDown(permAdd,Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(permAdd, Keys.CONTROL);
        act.perform();
       }


    @Test(enabled = false)
    public void sslTest(){
        wd.get("https://expired.badssl.com/");
        System.out.println("The page title is : " +wd.getTitle());
        //wd.quit();
    }


    @Test(enabled = false)
    public void linksTest(){
        wd.get("https://demoqa.com/links");
        // find the total number of links on this page
        String url;
        List<WebElement> allAtags = wd.findElements(By.tagName("a"));
        System.out.println("Total number of a tag elements = "+allAtags.size());
        // traverse thru all the links on the page
        Iterator<WebElement> itr = allAtags.iterator();
        while(itr.hasNext()){
            url = itr.next().getText();
            System.out.println("URL = "+url);
        }
    }

    @Test (enabled = false)
    public void testkite() throws InterruptedException {
        wd.get("https://kite.zerodha.com/holdings");
        wd.findElement(By.cssSelector("input#userid")).sendKeys("YQ3037");
        wd.findElement(By.cssSelector("input#password")).sendKeys("gaurav@127");
        wd.findElement(By.cssSelector("button.button-orange.wide")).click();
        wd.findElement(By.cssSelector("input#pin")).sendKeys("698383");
        wd.findElement(By.cssSelector("button.button-orange.wide")).click();
        Thread.sleep(10000);
        //code to shut the pop up from the website
        //wd.switchTo().alert().dismiss();

        String firstWindowHandle= wd.getWindowHandle();
        // click the analytics button
        wd.findElement(By.cssSelector("a.item>span")).click();
        System.out.println(wd.getWindowHandles());

        Set<String> handles = wd.getWindowHandles();
        Iterator<String> itr =  handles.iterator();

        while(itr.hasNext()){
            String childWindow= itr.next().toString();
            if (!firstWindowHandle.equalsIgnoreCase(childWindow)){
                wd.switchTo().window(childWindow);
            }
        }

        // carry on with the analytics page
        JavascriptExecutor jse = (JavascriptExecutor) wd;

       // jse.executeScript("arguments[0].scrollIntoView();", wd.findElement(By.xpath("//div[@class='six columns nomargin-mobile']")));
        //click the gold filter button
        Thread.sleep(5000);
        wd.findElement(By.xpath("//ul[@class='ti-tags']/li//*[contains(text(),'Gold')]/ancestor::div[@class='ti-content']/following-sibling::div")).click();
        //click the search button
        Thread.sleep(5000);
        wd.findElement(By.cssSelector("button.btn-blue")).click();


    }

}// end of class



