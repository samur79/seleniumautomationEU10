package cydeo.tests.day03_Tasks_cssSelector_xpath;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task5 {
    public static void main(String[] args) {
        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:
        WebElement loginBox= driver.findElement(By.cssSelector("input[class='login-inp']"));
        loginBox.sendKeys("gHgstr457");
        //4- Click to `Reset password` button
        WebElement resetPasswordButton= driver.findElement(By.cssSelector("button[class='login-btn']"));
        resetPasswordButton.click();
        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
        WebElement errorText= driver.findElement(By.cssSelector("div[class='errortext']"));
        if  (errorText.getText().equals("Login or E-mail not found")){
            System.out.println("Error text is VERIFIED");
        }else {
            System.out.println("Error text verification FAILED!!");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from

    }
}
