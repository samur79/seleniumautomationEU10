package cydeo.Automation_Exercise;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC3LoginWithIncrorrectCredentials extends TestBAse {

    @Test
    public void loginWithIcredentials() {
        //1. Launch browser
        driver.get("http://automationexercise.com");
        //2. Navigate to url 'http://automationexercise.com'
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //3. Verify that home page is visible successfully
        WebElement signupLoginBtn= driver.findElement(By.xpath("//a[@href='/login']"));
        signupLoginBtn.click();
        //4. Click on 'Signup / Login' button
        WebElement lgnTYourAcc= driver.findElement(By.xpath("//div[@class='login-form']/h2"));
        System.out.println("lgnTYourAcc.isDisplayed() = " + lgnTYourAcc.isDisplayed());
        //5. Verify 'Login to your account' is visible
        WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("abcdg@abc.com.tr");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Abcdefg");

        //6. Enter incorrect email address and password
        WebElement loginBtn= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        loginBtn.click();
        //7. Click 'login' button
        WebElement message= driver.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/form/p"));
        System.out.println("message.isDisplayed() = " + message.isDisplayed());
        //8. Verify error 'Your email or password is incorrect!' is visible
    }
}
