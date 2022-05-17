package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {

    @Test (retryAnalyzer = practice.TestClass.class)
    public void loginFunctionality(){
        Assert.assertEquals(true,false);
    }
}
