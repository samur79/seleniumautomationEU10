package cydeo.tests.Day06_Alerts_IFrames_Windows.iframe;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframe extends TestBAse {


    @Test
    public void setUpMethod(){
        //TC #4: Iframe practice
        //        1. Create a new class called: T4_Iframes
        //        2. Create new test and make set ups


        //        3. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
        //        4. Assert: “Your content goes here.” Text is displayed.
        WebElement iframe= driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        System.out.println("iframe = " + iframe);
        driver.switchTo().frame(iframe);
        WebElement innerText= driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        System.out.println(innerText.isDisplayed());
        Assert.assertEquals(innerText.getText(),"Your content goes here.");
        //        5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        driver.switchTo().parentFrame();
       WebElement h3= driver.findElement(By.tagName("h3"));
       Assert.assertEquals(h3.getText(),"An iFrame containing the TinyMCE WYSIWYG Editor");


    }
}
