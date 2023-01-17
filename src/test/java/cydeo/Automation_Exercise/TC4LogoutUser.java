package cydeo.Automation_Exercise;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4LogoutUser  extends TestBAse {
    @Test
    public void logoutUser(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");
        //3. Verify that home page is visible successfully
        String actualURL= driver.getCurrentUrl();
        Assert.assertEquals(actualURL,"https://automationexercise.com/");
        //4. Click on 'Signup / Login' button
        WebElement signupLoginBtn= driver.findElement(By.xpath("//a[@href='/login']"));
        signupLoginBtn.click();

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
        WebElement usernameVisible= driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[10]/a/i"));
        System.out.println("usernameVisible.getText() = " + usernameVisible.getText());

        //9. Click 'Logout' button
        WebElement logout= driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]//a"));
        logout.click();
        //10. Verify that user is navigated to login page
        System.out.println(driver.getTitle());
    }

}
