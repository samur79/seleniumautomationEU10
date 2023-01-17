package cydeo.SelfStudy;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gmail {
    public static void main(String[] args) {
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        WebElement acceptAll= driver.findElement(By.cssSelector("div[class='QS5gu sy4vM']"));
        acceptAll.click();
        WebElement nineDots=driver.findElement(By.xpath("//a[@role='button']"));
        nineDots.click();
    }
}
