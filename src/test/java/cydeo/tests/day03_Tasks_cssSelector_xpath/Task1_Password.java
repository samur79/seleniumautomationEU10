package cydeo.tests.day03_Tasks_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Password {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://login1.nextbasecrm.com/");
         driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect");
        driver.findElement(By.className("login-btn")).click();
      String actualText=driver.findElement(By.className("errortext")).getText();
      String expectedText= "Incorrect login or password";
        if (expectedText.equals(actualText)) {
            System.out.println("Error message is verified");
        }
        else {
            System.out.println("Error message is not verified");
        }
        driver.close();

    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
 */