package cydeo.tests.day03_Tasks_cssSelector_xpath;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task2_NextBase {
    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a Chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");


        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected: Expected: Remember me on this computer
        String expectedRememberMeElement="Remember me on this computer";
        String actualRememberMeElement= driver.findElement(By.className("login-item-checkbox-label")).getText();
        driver.findElement(By.className("login-item-checkbox-label")).getText();
        if (expectedRememberMeElement.equals(actualRememberMeElement)){
            System.out.println("Remember me element text is VERIFIED");
        }else {
            System.out.println("Remember me element text is NOT VERIFIED");
        }

        //4- Verify “forgot password” link text is as expected: Expected: Forgot your password?
        String  expectedForgotPasswordText="Forgot your password?";
        String actualForgotPasswordText= driver.findElement(By.className("login-link-forgot-pass")).getText();
        if (expectedForgotPasswordText.equals(actualForgotPasswordText)){
            System.out.println("Forget my password  element text is VERIFIED");
        }else{
            System.out.println("Forget my password  element text is NOT VERIFIED");

        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //5- Verify “forgot password” href attribute’s value contains expected: Expected: forgot_password=yes

        driver.close();

    }
}
