package cydeo.tests.day02_findElement_Locators_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Gmail {
    public static void main(String[] args) throws InterruptedException {


       // TC #3: Back and forth navigation
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       // 2- Go to: https://google.com
        driver.get("https://google.com");
        WebElement agreeButton=driver.findElement(By.id("L2AGLb"));
        agreeButton.click();
Thread.sleep(3000);
        //3- Click to Gmail from top right.
        WebElement gmail= driver.findElement(By.linkText("Gmail"));
       gmail.click();
        //4- Verify title contains:
        //Expected: Gmail
      String title=  driver.getTitle();
      if (title.contains("Gmail")){
          System.out.println("It contains \"Gmail\"");
      }else {
          System.out.println("It does not contain \"Gmail\"");
      }
       // 5- Go back to Google by using the .back();
        driver.navigate().back();

       // 6- Verify title equals:
       // Expected: Google
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED!!");
        }




    }
}
