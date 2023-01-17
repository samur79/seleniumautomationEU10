package cydeo.tests.day02_findElement_Locators_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();// Browser driver is set up and instance of browser is created.
        //#1-1. Open Chrome browser
        driver.get("https://practice.cydeo.com/"); // if you do not put"/" it gives error
        System.out.println(driver.getCurrentUrl());
        String expected="cydeo";
        System.out.println("expected = " + expected);

        String actual= driver.getCurrentUrl();
        System.out.println(actual);
        String title= driver.getTitle();
        String actualTittle="Practice";
        System.out.println(actualTittle);
        if (actual.contains(expected)){
            System.out.println("URL check is verified");
        }else {
            System.out.println("URL check is not verified");
        }
        if (title.equals(actualTittle)){
            System.out.println("Title check  is VERIFIED");
        }else{
            System.out.println("Title check is FAILED");
        }
        driver.close();

    }
}
/*



TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice

 */