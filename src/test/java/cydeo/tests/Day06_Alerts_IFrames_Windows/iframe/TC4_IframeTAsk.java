package cydeo.tests.Day06_Alerts_IFrames_Windows.iframe;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC4_IframeTAsk {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        // 1. Open browser
        driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }
    @Test
    public void iframe_test1(){

       // 4. Assert: “Your content goes here.” Text is displayed.
       // WebElement yourContentIsHere= driver.findElement(By.xpath("//p"));
       // When the weBelement in another html under iframe you get NoSuchElementException.

        //option #1- you use the id attribute
       // driver.switchTo().frame("mce_0_ifr");

        //option #2-passinf index number
       // driver.switchTo().frame(0);

        // option #3 Locate as a web element and pass it to frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        WebElement yourContentIsHere= driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentIsHere.isDisplayed());
        // to proceed to the next step I need to switch back to the main html
        driver.switchTo().parentFrame();

     //   5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        WebElement headertext= driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headertext.isDisplayed());
    }
}
