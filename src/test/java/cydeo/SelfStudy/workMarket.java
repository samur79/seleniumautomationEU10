package cydeo.SelfStudy;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class workMarket {
    public static void main(String[] args) {

        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.get("https://www.workmarket.com/");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

       WebElement accept= driver.findElement(By.cssSelector("a[class='call']"));
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
       accept.click();

    }
}
