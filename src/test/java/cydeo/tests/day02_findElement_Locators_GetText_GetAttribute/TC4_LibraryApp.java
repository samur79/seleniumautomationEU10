package cydeo.tests.day02_findElement_Locators_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_LibraryApp {
    public static void main(String[] args) {

        //TC #4: Library verifications
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        WebDriver driver=new ChromeDriver();

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");


        //3. Enter username: “incorrect@email.com”
        WebElement usernameInput= driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@gmail.com");
        //4. Enter password: “incorrect password”
        WebElement passwordInput= driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("inputPassword");
        //5. Verify: visually “Sorry, Wrong Email or Password” displayed
WebElement singInButton= driver.findElement(By.tagName("button"));
singInButton.click();

        //PS: Locate username input box using “className” locator Locate password input box using “id”
        // locator
        //Locate Sign in button using “tagName” locator


    }
}
