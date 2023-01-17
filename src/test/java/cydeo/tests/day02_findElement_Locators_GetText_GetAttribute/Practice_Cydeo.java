package cydeo.tests.day02_findElement_Locators_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Cydeo {
    public static void main(String[] args) {



       // TC #4: Practice Cydeo – Class locator practice
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //  2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

       // 3- Click to “Home” link
        WebElement home= driver.findElement(By.className("nav-link"));
        home.click();

       // 4- Verify title is as expected: Expected: Practice
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else {
            System.err.println("FAILED!!");
        }

       // PS: Locate “Home” link using “className” locator

    }
}
