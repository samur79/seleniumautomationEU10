package cydeo.SelfStudy;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DataProviders extends TestBAse {
    @Test (dataProvider = "search")
    public  void test1(String keyword, String expecetedTitle){
        driver.get("http://google.com");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        WebElement inputBox= driver.findElement(By.xpath("//input[@name='q']"));
        inputBox.sendKeys(keyword+ Keys.ENTER);
        String actualTitle= driver.getTitle();
        String expectedTiTle= expecetedTitle;
        assertEquals(actualTitle,expectedTiTle);



    }
    @DataProvider( name= "search")
    public Object[][]testData(){
        return new Object[][]{
                {"selenium","selenium - Google Search"},
                {"java", "java - Google Search"},
                {"ersin samur","ersin samur - Google Search"},
                {"Corall","Corall - Google Search"},
                {"Turkiye","Turkiye - Google Search"}
        };
    }
}
