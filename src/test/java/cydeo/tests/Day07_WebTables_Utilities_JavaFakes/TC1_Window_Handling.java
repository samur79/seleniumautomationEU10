package cydeo.tests.Day07_WebTables_Utilities_JavaFakes;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class TC1_Window_Handling extends TestBAse {

    @Test
    public  void testCase01 (){
        //TC #1: Window Handle practice
        //1. Create new test and make set ups
        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");
        //3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        //4. Create a logic to switch to the tab where Etsy.com is open

        Set<String> openWindows= driver.getWindowHandles();
        for (String each : openWindows) {
            driver.switchTo().window(each); // we switch to each window using for each loop
            System.out.println("Current URL: "+driver.getCurrentUrl());
            //We get the url of each open window.
            if (driver.getCurrentUrl(). contains("etsy")){
                break;
            }

        }

String actualTitle= driver.getTitle();
        String expectedInTitle="Etsy";
        Assert.assertTrue(actualTitle.contains(expectedInTitle));



        //BrowserUtils.switchWindowVerify(driver,"etsy","Etsy");
    }
    //TC #1: Window Handle practice
    //1. Create new test and make set ups
    //2. Go to : https://www.amazon.com
    //3. Copy paste the lines from below into your class
    //4. Create a logic to switch to the tab where Etsy.com is open
    //5. Assert: Title contains “Etsy”
    //Lines to be pasted:
    //((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    //((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
    //((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
    //These lines will simply open new tabs using something called JavascriptExecutor
    //and get those pages. We will learn JavascriptExecutor later as well.
}
