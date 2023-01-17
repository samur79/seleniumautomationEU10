package cydeo.tests.day02_findElement_Locators_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7_Facebook_Incorrect_Login {
    public static void main(String[] args) throws InterruptedException {


        // TC #2: Facebook incorrect login title verification
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //1.   Open Chrome browser


        driver.get("https://www.facebook.com");
        //2.   Go to https://www.facebook.com


        //3.   Enter incorrect username
        WebElement username= driver.findElement(By.name("email"));
        username.sendKeys("abc@abs.com");

        //4.   Enter incorrect password
        WebElement password= driver.findElement(By.name("pass"));
      password.sendKeys("Er234567sm*");
      Thread.sleep(3000);
        WebElement login=driver.findElement(By.className("_6ltg"));
        login.click();

        //5.   Verify title changed to:
        //Expected: “Log into Facebook”
        String actualTitle= driver.getTitle();
        String expectedTitle= "Log in to Facebook";
        System.out.println(actualTitle);
        System.out.println(expectedTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!");
        }else {
            System.out.println("Title verification is FAILED!!");
        }

    }
}
