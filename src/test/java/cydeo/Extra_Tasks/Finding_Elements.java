package cydeo.Extra_Tasks;

import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class Finding_Elements {
    @Test
    public void openxcell(){
        //TC #1: Checking the number of links on the page
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        Driver.getDriver().get("https://www.openxcell.com");
        List<WebElement>links= Driver.getDriver().findElements(By.xpath("//a"));

        System.out.println("links.size() = " + links.size());

        //3. Count the number of the links on the page and verify
        //Expected: 332
        Assert.assertEquals("332",links.size());
    }

}
