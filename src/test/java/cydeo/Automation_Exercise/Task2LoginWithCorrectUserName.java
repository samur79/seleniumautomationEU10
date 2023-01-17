package cydeo.Automation_Exercise;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2LoginWithCorrectUserName extends TestBAse {

    @Test
    public  void loginWithUserName(){
        //1. Launch browser
        driver.get("https://automationexercise.com");
        //2. Navigate to url 'http://automationexercise.com'
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //3. Verify that home page is visible successfully
        WebElement signupLoginBtn= driver.findElement(By.xpath("//a[@href='/login']"));
        signupLoginBtn.click();
        //4. Click on 'Signup / Login' button
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //5. Verify 'Login to your account' is visible
        WebElement loginToYourAccount= driver.findElement(By.xpath("//h2[.='Login to your account']"));
        String actualtext=loginToYourAccount.getText();
        Assert.assertEquals(actualtext,"Login to your account");

        //6. Enter correct email address and password
        WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("abc@abc.info");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Abcdef");
        //7. Click 'login' button
        WebElement loginBtn= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        loginBtn.click();
        //8. Verify that 'Logged in as username' is visible
        WebElement loggedInUsername= driver.findElement(By.xpath("//b[.='Abc Def']"));
        loggedInUsername.getText();
        Assert.assertEquals( loggedInUsername.getText(),"Abc Def");
        //9. Click 'Delete Account' button
        WebElement deleteBtn= driver.findElement(By.xpath("//a[@href='/delete_account']"));
        deleteBtn.click();
        WebElement iframe=driver.findElement(By.xpath("//iframe[@id='aswift_5']"));

        driver.switchTo().frame(iframe);
        WebElement addClose= driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/svg"));
        addClose.click();

        //10. Verify that 'ACCOUNT DELETED!' is visible


    }
}
