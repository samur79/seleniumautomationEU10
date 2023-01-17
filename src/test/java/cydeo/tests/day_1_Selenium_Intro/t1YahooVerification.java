package cydeo.tests.day_1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t1YahooVerification {
    public static void main(String[] args) {
       // #1-set your Browser Driver
        WebDriverManager.chromedriver().setup();
        // #1-create an instance of browser
        WebDriver driver= new ChromeDriver();
//#4- maximize the size of the window
        driver.manage().window().maximize();
//#5- go to "https://uk.yahoo.com/"
        driver.get("https://uk.yahoo.com/");
        // get the tittle
        String getTitle= driver.getTitle();
        String expectedTitle="Yahoo UK | News, email and search";
        System.out.println("getTitle = " + getTitle);
        //get current url
        String currentURL="https://uk.yahoo.com";
        String getURL= driver.getCurrentUrl();
        System.out.println("getURL = " + getURL);
        if (currentURL.equals(getURL)&& getTitle.equals(expectedTitle)){
            System.out.println("Test is successful");
                    }else {
            System.out.println("Test failed");
        }


    }
}
