package test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class fillForm_demo {

    public WebDriver wd;

    @BeforeTest
    public void instantiateBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gaura\\Downloads\\software\\chromedriver_win32\\chromedriver_win32_99\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Test
    public void fillForm() throws InterruptedException {
        // invoke demo website on toolsqa
        wd.get("https://demoqa.com/");
    // click the forms section
        JavascriptExecutor executor =  (JavascriptExecutor)wd;
        Thread.sleep(10000);
        /*new WebDriverWait(wd, 20).until(ExpectedConditions.elementToBeClickable
                (By.xpath("//*[@class='category-cards']//child::div[@class='card-body']//h5[contains(text(),'Forms')]"))).click();*/
        new WebDriverWait(wd, 20).until(ExpectedConditions.elementToBeClickable
                (By.xpath("(//*[@class='card mt-4 top-card'])[2]"))).click();


      WebElement ele1= wd.findElement(By.xpath("//*[@class='element-list collapse show']"));
        //executor.executeScript("arguments[0].click;",ele1);
        // xpath for practice forms button
        WebElement ele = wd.findElement(By.xpath("//*[@class='accordion']//div[@class='element-list collapse show']"));
        ele.click();

        // xpath: firstname : //*[@id='firstName'] , lastname : //*[@id='lastName'] , email : //*[@id='userEmail'],
        // radio button Male: //*[@name='gender' and @value='Male'] , user number : //*[@id='userNumber']
        // click the calendar : //*[@id='dateOfBirthInput']  month selector : //*[@class='react-datepicker__month-select']


        // enter the first and last name:
        wd.findElement(By.xpath("//*[@id='firstName']")).sendKeys("TestName");
        wd.findElement(By.xpath("//*[@id='lastName']")).sendKeys("TestLastName");
        wd.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("email@gmail.com");
        // click the radio button::

        //wd.findElement(By.xpath("//*[@name='gender' and @value='Male']")).click();

        wd.findElement(By.xpath("//*[@id='userNumber']")).sendKeys("7894561230");
        wd.findElement(By.xpath("//*[@id='dateOfBirthInput']")).click();
        Select cntry = new Select(wd.findElement(By.xpath("//*[@class='react-datepicker__month-select']")));
        cntry.selectByValue("3");
        ////*[@class='react-datepicker__month']/div/div[contains(text(),'26')]
        wd.findElement(By.xpath("//*[@class='react-datepicker__month']/div/div[contains(text(),'26')]")).click();
        // select the checkbox:
      //  wd.findElement(By.xpath("//*[@id='hobbies-checkbox-1']")).click();
        // enter the current address
        wd.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("my address is HOME");

        // click on the elements section
        wd.findElement(By.xpath("(//*[@class='icon'])[1]")).click();
        wd.findElement(By.xpath("//*[(@class='text' ) and contains(text(),'Radio Button')]")).click();
        wd.findElement(By.xpath("(//*[@class='custom-control custom-radio custom-control-inline'])[1]")).click();
      /*  //select the radio button
        WebElement ele10 = wd.findElement(By.xpath("//*[@name='gender' and @value='Male'] "));
        //executor.executeScript("arguments[0].click;",ele10);
        ele10.click();
*/
        //executor.executeScript("arguments[0].click;",ele);
    // xpath for clicking the forms section
    }
}
