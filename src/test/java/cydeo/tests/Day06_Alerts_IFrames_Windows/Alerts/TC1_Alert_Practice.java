package cydeo.tests.Day06_Alerts_IFrames_Windows.Alerts;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TC1_Alert_Practice {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
       // 1. Open browser
        driver= WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void alert_test1(){
       // 3. Click to “Click for JS Alert” button
        WebElement JSButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        JSButton.click();
       // 4. Click to OK button from the alert. To be able to click Alert button we need to switch drivers focus to alert
        Alert alert= driver.switchTo().alert();
        alert.accept();
       // 5. Verify “You successfully clicked an alert” text is displayed
        String actualDisplayMessage=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedDisplayMessage="You successfully clicked an alert";

        Assert.assertEquals(actualDisplayMessage,expectedDisplayMessage,"Actual result text is not as expected");

    }
    @Test
    public  void alertTest2() throws InterruptedException {
        //TC #2: Confirmation alert practice
        //1. Open browser


        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        WebElement jsconfirm= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));


        //3. Click to “Click for JS Confirm” button
        jsconfirm.click();
        Thread.sleep(2000);
        //4. Click to OK button from the alert
        Alert alert= driver.switchTo().alert();
        alert.accept();
        //5. Verify “You clicked: Ok” text is displayed
        WebElement actualMessage= driver.findElement(By.xpath("//p[@id='result']"));
        String actualmessage= actualMessage.getText();
        System.out.println(actualmessage);
        SoftAssert Object=new SoftAssert();// Although there is a problem and you want to execute the following lines you can use SoftAssert.
        String expectedMessage="You clicked: TAMAM";
        System.out.println(expectedMessage);
        //Assert.assertEquals(actualmessage,expectedMessage,"Message is not verified");
        Object.assertEquals(actualmessage,expectedMessage,"Message is not verified");
        System.out.println(" After error next lines are executed");
        Object.assertAll("There is a problem with the message");// this message will be seen above the error
    }


}
