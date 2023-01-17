package cydeo.tests.day02_findElement_Locators_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        Thread.sleep(3000);


        //3. Search for “wooden spoon”
        WebElement searchItem= driver.findElement(By.name("search_query"));
        Thread.sleep(3000);
        searchItem.sendKeys("wooden spoon"+ Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”
        String actualTitle= driver.getTitle();
        String expectedTitle="“Wooden spoon | Etsy";
        System.out.println(actualTitle);
        System.out.println(expectedTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title check PASSED!");
        }else {
            System.out.println("Title check FAILED!");
        }
    }
}
