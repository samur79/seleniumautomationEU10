package cydeo.SelfStudy;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class YahooMailTest extends TestBAse {

    @Test
    public void setupTest(){
        driver.get("https://yahoo.com");
        WebElement agreeBtn= driver.findElement(By.xpath("//button[@class='btn primary']"));
        agreeBtn.click();
        WebElement mailBtn= driver.findElement(By.xpath("//a[@class='_yb_yriy4']"));
        mailBtn.click();

    }
}
