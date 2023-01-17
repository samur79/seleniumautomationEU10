package cydeo.tests.day_1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //you need to set up following things

        //1- setting up the web driver manager
        // we create our browser driver which interprets my code for HTML
        WebDriverManager.chromedriver().setup();
        //2- Create instance of WebDriver
        WebDriver driver=new ChromeDriver();
        //3- Test if driver is working as expected
driver.get("https://www.facebook.com");

    }
}
