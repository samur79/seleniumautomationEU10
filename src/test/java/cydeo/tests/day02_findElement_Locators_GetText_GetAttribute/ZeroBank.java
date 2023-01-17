package cydeo.tests.day02_findElement_Locators_GetText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {

        // TC #2: Zero Bank header verification
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //1. Open Chrome browser

        driver.get("http://zero.webappsecurity.com/login.html");
        // 2. Go to http://zero.webappsecurity.com/login.html

       // 3. Verify header text
        String actualHeader =driver.findElement(By.tagName("h3")).getText();
        String expectedHeader="Log in to ZeroBank";
        System.out.println("expectedHeader = " + expectedHeader);
        System.out.println("actualHeader = " + actualHeader);
       // Expected: “Log in to ZeroBank”
        if (actualHeader.equals(expectedHeader)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!!");
        }
        driver.close();

    }
}
