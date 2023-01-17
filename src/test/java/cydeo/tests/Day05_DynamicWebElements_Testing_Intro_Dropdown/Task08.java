package cydeo.tests.Day05_DynamicWebElements_Testing_Intro_Dropdown;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task08 extends TestBAse {

    @Test
    public void setUpMethod(){
       driver.get("https://practice.cydeo.com/dropdown");
        WebElement multipleSelect= driver.findElement(By.xpath("//select[@name='Languages']"));
        Select multipleSelectList= new Select(multipleSelect);
        multipleSelectList.getOptions();
        for (WebElement option : multipleSelectList.getOptions()) {
            System.out.println("option = " + option.getText());
            multipleSelectList.selectByVisibleText(option.getText());
            System.out.println("is option selected after selected? "+option.isSelected());
            multipleSelectList.deselectAll();
            System.out.println("is option selected after deselect "+option.isSelected());
            System.out.println("==========================================================");
        }




    }
}
/*
TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all value
 */