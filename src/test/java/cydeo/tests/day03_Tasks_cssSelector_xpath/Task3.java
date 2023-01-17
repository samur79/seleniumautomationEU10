package cydeo.tests.day03_Tasks_cssSelector_xpath;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebdriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “Log in” button text is as expected:
        String expectedLoginText="Log In";
       // WebElement loginButton= driver.findElement(By.cssSelector("input[class='login-btn']"));
       // WebElement loginButton= driver.findElement(By.cssSelector("input[type='submit']"));
                                                                                //"tagName[attribute='value']"
        WebElement loginButton= driver.findElement(By.cssSelector("input[value='Log In']"));
        String actualLoginText= loginButton.getAttribute("value");

        //Expected: Log In
        System.out.println("actualLoginText = " + actualLoginText);
        System.out.println("expectedLoginText = " + expectedLoginText);
        if (expectedLoginText.equals(actualLoginText)){
            System.out.println("Login Button text is verified");
        }else {
            System.err.println("Login button text is not verified!!");
        }
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
     driver.close();
        //PS2: Pay attention to where to get the text of this button from
    }
}
