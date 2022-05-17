package test.automation;

import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class flipKartAutomation {


    public WebDriver wd;

    @BeforeTest
    public void instantiateBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaura\\Downloads\\software\\chromedriver_win32\\chromedriver_win32_99\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Test
    public void flipKartAutomation() throws InterruptedException {
        // invoke demo website on toolsqa
        wd.get("https://www.amazon.in/");
        // click the forms section
    // enter text for search
        wd.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("IPHONE 13 mini 2");
        Thread.sleep(10000);
        //select the model from the suggestions that has 256 gb specification
        wd.findElement(By.cssSelector("div[aria-label*='256gb']")).click();
        //click the search button
        Thread.sleep(5000);
        wd.findElement(By.cssSelector("input#nav-search-submit-button")).click();

        // collapse all the open items on the right side menu
     //   List<WebElement> webElements = new ArrayList<WebElement>();
       // webElements = wd.findElements(By.cssSelector("i.a-icon.a-icon-section-collapse"));

        // iterate thru the araylist
       /* for (int i=0;i<webElements.size();i++){
         //   System.out.println(webElements.get(i));
            webElements.get(i).click();
        }

        wd.findElement(By.xpath("//h3[@role='heading']/span[text()='Prime & Delivery']")).click();
        wd.findElement(By.xpath("//span[text()='Get It Today']")).click();
*/
        //find the model that is less than 50,000

        List<WebElement> ele1 = new ArrayList<WebElement>();
        ele1 = wd.findElements(By.cssSelector("span.a-price"));
        System.out.println(ele1.size());
        for (WebElement t : ele1){
           // System.out.println(t.getText());
            String digit= t.getText().replace(",","");
            digit= digit.replace("₹","");
           // System.out.println(digit);
            if (Integer.parseInt(digit) > 100000)
            {t.click();
            break;}
        }
        String mainWindowHandle = wd.getWindowHandle();
        Set<String> windowHandles = wd.getWindowHandles();
        Iterator iterate_value = windowHandles.iterator();
        //System.out.println(wd.getWindowHandles());

        // iterate thru the window handles
        while(iterate_value.hasNext()){
            String childWindow = iterate_value.next().toString();
            if (!mainWindowHandle.equalsIgnoreCase(childWindow)){
                wd.switchTo().window(childWindow);
                // in the child window check the price that was clicked
                System.out.println(wd.findElement(By.cssSelector("span.a-price.a-text-price.a-size-medium.apexPriceToPay")).getText());
                wd.close();
            }

        }
        wd.switchTo().window(mainWindowHandle);

        //get the search text
        System.out.println(wd.findElement(By.cssSelector("input#twotabsearchtextbox")).getAttribute("value"));
        // hover on the hello sign in portion
        Actions act = new Actions(wd);
        act.moveToElement(wd.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1"))).perform();
        // click on creating the wishlist
        wd.findElement(By.xpath("//div[@id='nav-al-wishlist']//a[1]")).click();

        // click on the main menu item
        wd.findElement(By.cssSelector("a#nav-hamburger-menu")).click();
        // click on the customer care number
        WebElement element = wd.findElement(By.xpath("//a[@class='hmenu-item' and text()='Customer Service']"));
        JavascriptExecutor executor = (JavascriptExecutor)wd;
        Thread.sleep(10000);
        executor.executeScript("arguments[0].scrollIntoView();", element);

        wd.findElement(By.xpath("//a[@class='hmenu-item' and text()='Customer Service']")).click();

        //executor.executeScript("arguments[0].click;",element);
    /*    new WebDriverWait(wd, 20).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='hmenu-item' and text()='Customer Service']"))).click();
*/
    //    wd.findElement(By.xpath("//a[@class='hmenu-item' and text()='Customer Service']")).click();
    }
}
