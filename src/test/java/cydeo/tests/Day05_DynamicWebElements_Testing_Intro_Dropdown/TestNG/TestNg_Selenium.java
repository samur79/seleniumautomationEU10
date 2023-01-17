package cydeo.tests.Day05_DynamicWebElements_Testing_Intro_Dropdown.TestNG;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNg_Selenium {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        //Do browser driver setup
         driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // maximize the page

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // implicit wait
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void selenium_Tests(){

        // Open browser


        driver.get("https://www.google.com");
        // get https://www.google.com
        String expectedTitle="Google";
        String actualTitle= driver.getTitle();


        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match here");
        //Assetrt title is google
    }
}
