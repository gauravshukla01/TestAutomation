package practice;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestClass implements IRetryAnalyzer {
    int counter=0;
    @Override
    public boolean retry(ITestResult result) {
        if (counter<3){
            counter++;
            return true;

        }
        return false;
    }
}



