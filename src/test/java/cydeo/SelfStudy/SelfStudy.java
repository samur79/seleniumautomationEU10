package cydeo.SelfStudy;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SelfStudy {
    public static void main(String[] args) {

        WebDriver driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://yandex.com/");
        //#2- Locate  Image
        WebElement images= driver.findElement(By.xpath("//a[@id='tab-images']"));
        //#3- click images
        images.click();
        //#4 Check the title with expected one ""
        String actualTitle=driver.getTitle();
        String expectedTitle="Yandex Images: search for images online or search by image";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed.");
        }else {
            System.out.println("Title verification failed.");
        }
        //#5- Find the accept button and click on it
        WebElement accept= driver.findElement(By.xpath("//td[@class='sc-iCoHVE knnrxv']/button"));
        accept.click();
        //#6- Go to input element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement input= driver.findElement(By.xpath("//input[@class='input__control mini-suggest__input']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        input.click();
        //7- Write "Turkiye" in the box and click
         input.sendKeys("Turkiye");
        WebElement search= driver.findElement(By.xpath("//div[@class='websearch-button__text mini-suggest__button-text']"));
        search.click();
        //8- if you see another pop up find it and click accept all button
     WebElement acceptAll=   driver.findElement(By.xpath("//button[@class='sc-jrsJCI sc-iqAbSa emsrNO dsQayh']"));
     acceptAll.click();

     //#8- go to the first image and click on it

     WebElement firstImage= driver.findElement(By.xpath("//img[@class='serp-item__thumb justifier__thumb']"));
    firstImage.click();
    // #9- Go back to images
    driver.navigate().back();
    //#10 Check the title again
        String title2= driver.getTitle();
        if (title2.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Verification Failed");
        }
        System.out.println("title2        = " + title2);
        System.out.println("expectedTitle = " + expectedTitle);
//#11- Do not forget to close the window
driver.close();





    }
}
