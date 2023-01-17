package cydeo.tests.Day05_DynamicWebElements_Testing_Intro_Dropdown;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TCUtilityMethod {
    public static void main(String[] args) {
//1. Open Chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name='sport' radio buttons
        List<WebElement> sportRadioButtons =driver.findElements(By.name("sport"));


     /*   //4. Verify “Hockey” radio button is selected after clicking.
        for (WebElement each : sportRadioButtons) {
            String eachId= each.getAttribute("id");
            System.out.println("eachId="+eachId);

            if (eachId.equals("hockey")){
                each.click();
                System.out.println("Hockey is selected : "+each.isSelected());
                break;
            }
        }

      */
        clickAndVerifyRadioButton(driver,"sport","hockey");
        clickAndVerifyRadioButton(driver,"sport","football");
        clickAndVerifyRadioButton(driver,"color","yellow");

        driver.close();

    }
    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        //Loop through the List of WebElement and select matching result "hockey"
        for (WebElement each : radioButtons) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)){

                each.click();
                System.out.println( eachId + " is selected : " + each.isSelected());
                break;
            }
        }

    }

}



/*
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)
Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true
 */