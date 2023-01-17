package cydeo.tests.Day06_Alerts_IFrames_Windows;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windows_Tabs {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        // 1. Open browser
        driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to:  https://practice.cydeo.com/windows
        driver.get(" https://practice.cydeo.com/windows");
    }
    @Test
    public void  window_test(){
      //Storing the main page's window handle as string is
        // good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Title before click: " + actualTitle);

        //5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));

        clickHereLink.click();

        //6. Switch to new Window.
        Set<String> allWindowHandles = driver.getWindowHandles();
        // window handle 1 - main window
        // window handle 2 - 2nd window
        System.out.println(allWindowHandles);

        for(String each: allWindowHandles){

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());

        }

        //7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitleAfterClick);

        System.out.println("Title after click: " + actualTitle);

        //If we want to go back to main page, we can use already stored main handle
        //driver.switchTo().window(mainHandle);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
