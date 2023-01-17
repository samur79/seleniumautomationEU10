package cydeo.tests.day02_findElement_Locators_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6_Facebook_Login {
    public static void main(String[] args) {

        // TC #1: Facebook title verification
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //1.   Open Chrome browser

        driver.get("https://www.facebook.com");
        //2.   Go to https://www.facebook.com

        //3.   Verify title:
       // Expected: “Facebook - Log In or Sign Up”
        String expectedTitle="Facebook – log in or sign up";
        String actualTitle= driver.getTitle();
         if (actualTitle.equals(expectedTitle)){
             System.out.println("Title verification PASSED!");
         }else {
             System.out.println("Title verification FAILED!");
         }
    }
}
