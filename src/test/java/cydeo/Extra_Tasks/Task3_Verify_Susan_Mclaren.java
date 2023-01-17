package cydeo.Extra_Tasks;

import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3_Verify_Susan_Mclaren {
    @Test
    public void susanMacLaren(){
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
        //2. Click on View all orders
        WebElement viewAllOrders= Driver.getDriver().findElement(By.xpath("//a[.='View all orders']"));
        viewAllOrders.click();
        WebElement date= Driver.getDriver().findElement(By.xpath("//td[.='Susan McLaren']/../td[5]"));
        String actualDate= date.getText();
        Assert.assertEquals(actualDate,"01/05/2010");

        //3. Verify Susan McLaren has order on date “01/05/2010”
    }
}
