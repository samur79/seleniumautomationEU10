package cydeo.tests.Day07_WebTables_Utilities_JavaFakes;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingTables extends TestBAse {
    @Test
    public void handlingTables(){
        driver.get("https://practice.cydeo.com/tables");
        //P1_ WRITE A LOCATOR THAT RETURNS THE TABLE 1 ITSELF
        WebElement table1= driver.findElement(By.xpath("//table[@id='table1']"));
        //P2_ WRITE A LOCATOR THAT RETURNS ALL OF THE ROWS INSIDE OF TABLE 1
        WebElement rows= driver.findElement(By.xpath("//table[@id='table1']//tr"));
//P3_ WRITE A LOCATOR THAT RETURNS ALL OF THE ROWS INSIDE OF BODY - TABLE 1
        WebElement rows2= driver.findElement(By.xpath("//table[@id='table1']/tbody//tr"));
//P4_ WRITE A LOCATOR THAT RETURNS ONLY 3RD ROW IN THE BODY
        WebElement rowsThirdRow= driver.findElement(By.xpath("//table[@id='table1']/tbody//tr[3]"));

       // P5_ WRITE A LOCATOR THAT RETURNS ALL OF THE CELLS IN ALL OF THE ROW (IN BODY)
        WebElement allCells= driver.findElement(By.xpath(" //table[@id='table1']/tbody//tr//td"));
        //P6_ WRITE A LOCATOR THAT RETURNS ALL OF THE FIRST NAMES FROM TABLE
        WebElement firstNames= driver.findElement(By.xpath("    //table[@id='table1']/tbody//tr//td[2]"));
        //P7_ WRITE A LOCATOR THAT RETURNS FRANKS CELL SPECIFICALLY
        WebElement franksCell= driver.findElement(By.xpath("    //table[@id='table1']/tbody//tr[2]//td[2]"));

        //P8_ WRITE A LOCATOR THAT RETURNS FRANKS CELL SPECIFICALLY
        //    USE FRANKS TEXT
        WebElement franksCellFrank= driver.findElement(By.xpath("    //table[@id='table1']//td[.='Frank']"));

       // P9_ WRITE A LOCATOR THAT RETURNS $100 CELL SPECIFICALLYUSE FRANKS TEXT
        WebElement franksDollar= driver.findElement(By.xpath("       //table[@id='table1']/tbody//tr[3]//td[4]"));

    }
}
