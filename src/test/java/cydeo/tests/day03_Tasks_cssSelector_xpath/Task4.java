package cydeo.tests.day03_Tasks_cssSelector_xpath;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task4 {
    public static void main(String[] args) {
        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //3- Verify “Reset password” button text is as expected:
        String expectedResetPasswordText="Reset password";                              //"tagName[attribute='value']"
        String actualResetPasswordText= driver.findElement(By.cssSelector("button[class='login-btn']")).getText();
        System.out.println("actualResetPasswordText = " + actualResetPasswordText);
        System.out.println("expectedResetPasswordText = " + expectedResetPasswordText);
        //Expected: Reset password
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from
        if (actualResetPasswordText.equals(expectedResetPasswordText)){
            System.out.println("Reset password text is VERIFIED");
        }else {
            System.err.println("Reset password text is NOT VERIFIED");
        }
        driver.close();
    }
}
