package cydeo.tests.day02_findElement_Locators_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_Google {
    public static void main(String[] args) throws InterruptedException {

        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        //3- Write “apple” in search box
        // 4- Click google search button
        WebElement googleSearchBox= driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

       // 5- Verify
        //title:
String expectedTitle="apple";
String actualTitle= driver.getTitle();



        //Expected: Title should start with “apple” word
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!");
        }
    }
}
/*
TC#3: Google search
1- Open a Chrome browser
2- Go to: https://google.com 3- Write “apple” in search box 4- Click google search button 5- Verify
title:
Expected: Title should start with “apple” word

 */