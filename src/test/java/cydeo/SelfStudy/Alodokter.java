package cydeo.SelfStudy;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alodokter extends TestBAse {
    @Test
    public void alodokter() {
       driver.get("https://www.alodokter.com/");
       String str=" return document.querySelector('#content > hero-view').shadowRoot.querySelector('#searchSpecialities')";
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement input= (WebElement) ((JavascriptExecutor) driver).executeScript(str);
        input.sendKeys("Dimple Gobind Nagrani"+ Keys.ENTER);
        String str2=" return document.querySelector('#content > hero-view').shadowRoot.querySelector('#buttonSearch')";
        WebElement searchBtn=(WebElement) ((JavascriptExecutor) driver).executeScript(str2);
        searchBtn.submit();
        /*String str3= "document.querySelector('#content > hero-view').shadowRoot.querySelector('div > div.container-hero > div > div > div > h2)";

        WebElement doctor=(WebElement) ((JavascriptExecutor) driver).executeScript(str3);
        doctor.click();

         */







    }
}