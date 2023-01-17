package cydeo.tests.Day05_DynamicWebElements_Testing_Intro_Dropdown;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class StaleELementReferenceExceptionHandling extends Throwable {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: StaleElementReferenceException handling
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1. Open Chrome browser
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        //2. Go to https://practice.cydeo.com/add_remove_elements/

        Thread.sleep(3000);

        WebElement addElement=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();
        //3. Click to “Add Element” button
        WebElement deleteButton= driver.findElement(By.xpath("//button[@class='added-manually']"));


        //4. Verify “Delete” button is displayed after clicking.
        System.out.println("deleteButton.isDisplayed()= "+deleteButton.isDisplayed());
        //5. Click to “Delete” button.
        deleteButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.
       try  {
           System.out.println(deleteButton.isDisplayed());
          
       }catch (RuntimeException e){ // I was not able write "StaleELementReferenceException e"
           System.out.println("--> StaleELementReferenceExceptionHandling exception is thrown");
           System.out.println("w--> This means element is completely deleted from the page");
           System.out.println("deleButton.isDisplayed()=false");
       }
       driver.close();

        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
