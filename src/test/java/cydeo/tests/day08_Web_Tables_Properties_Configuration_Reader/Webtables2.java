package cydeo.tests.day08_Web_Tables_Properties_Configuration_Reader;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Webtables2 extends TestBAse {


    @Test
    public void webTables_2(){
        driver.get("https://practice.cydeo.com/tables");
        // Let's print out Jason
        WebElement row3cell2= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("Before clicking row3cell2.getText() = " + row3cell2.getText());

        WebElement firstName= driver.findElement(By.xpath("(//span[.='First Name'])"));
        firstName.click();
       row3cell2= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println(" After clicking row3cell2.getText() = " + row3cell2.getText());
// in a dynamic table after clicking somewhere the place of the names will change so instead of
        //identifying the cell we need to identify the name itself
WebElement jasonCell= driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("jasonCell.getText() = " + jasonCell.getText());
//priintout  all cells in row 3
        List<WebElement>list= driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        for (WebElement eachcell : list) {
            System.out.println("eachcell.getText() = " + eachcell.getText());
        }




    }

}
