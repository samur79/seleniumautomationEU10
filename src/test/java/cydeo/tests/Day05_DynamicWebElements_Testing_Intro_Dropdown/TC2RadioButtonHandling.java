package cydeo.tests.Day05_DynamicWebElements_Testing_Intro_Dropdown;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC2RadioButtonHandling {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        //3. Click to “Hockey” radio button
        WebElement hockeyButton= driver.findElement(By.xpath("//input[@id='hockey']"));
        //4. Verify “Hockey” radio button is selected after clicking.
        hockeyButton.click();
        if (hockeyButton.isSelected()){
            System.out.println("Button is selected.Verification is PASSED.");
        }else {
            System.out.println("Button is not selected.Verification is FAILED.");
        }
        driver.close();
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
