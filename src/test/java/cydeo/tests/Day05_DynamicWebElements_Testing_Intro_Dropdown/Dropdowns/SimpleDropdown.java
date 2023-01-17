package cydeo.tests.Day05_DynamicWebElements_Testing_Intro_Dropdown.Dropdowns;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleDropdown {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        //1. Open Chrome browser
       driver = WebdriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropDown(){

        //3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropdown= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
         WebElement currentDropdownOption= simpleDropdown.getFirstSelectedOption();
         String actualSimpleDropwownOption= currentDropdownOption.getText();
         String expectedSimpleDropwownOption="Please select an option";

        Assert.assertEquals(actualSimpleDropwownOption,expectedSimpleDropwownOption);

        //Expected: “Please select an option”

        Select stateDropdown= new Select( driver.findElement(By.xpath("//select[@id='state']")));

        //4. Verify “State selection” default selected value is correct
        String expectedSelectDropdownText="Select a State";
        String actualSelectDropdownText= stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedSelectDropdownText,actualSelectDropdownText);
        //Expected: “Select a State”

    }
    @Test
    public void test2(){
        //Expected: “Please select an option”

        Select stateDropdown= new Select( driver.findElement(By.xpath("//select[@id='state']")));

        //4. Verify “State selection” default selected value is correct
        String expectedSelectDropdownText="Select a State";
        String actualSelectDropdownText= stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedSelectDropdownText,actualSelectDropdownText);
        //Expected: “Select a State”

    }


}
