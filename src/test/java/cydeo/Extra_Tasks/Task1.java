package cydeo.Extra_Tasks;

import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Task1 {
    @Test
    public void test1(){
        //TC #1: Smartbear software link verification
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3. Enter username: “Tester”
        WebElement username= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");
        //4. Enter password: “test”
        WebElement password= Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");
        //5. Click to Login button
        WebElement loginBtn=Driver.getDriver().findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
        loginBtn.click();
        //6. Print out count of all the links on landing page
        List<WebElement>links= Driver.getDriver().findElements(By.tagName("a"));
        for (WebElement link : links) {
            System.out.println(link.getText());

        }
        //7. Print out each link text on this page

    }
}
