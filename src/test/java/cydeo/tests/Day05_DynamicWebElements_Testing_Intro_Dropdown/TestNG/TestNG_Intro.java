package cydeo.tests.Day05_DynamicWebElements_Testing_Intro_Dropdown.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG_Intro {
    @BeforeMethod// This method runs before all tests
    public void setUpMethod(){
        System.out.println("---> Before method is running.");

    }

    @AfterMethod// This method runs after all tests
    public void tearDownMethod(){
        System.out.println("AfterMethod is running");
    }
    @BeforeClass //
    public void setUpMethod1(){
        System.out.println("BeforeClass is running.");

    }
    @Test(priority=2)// you can define the order of the tests by adding priority
    public void test(){
        System.out.println("Test 1 is running....");
        //Assert Equals= compares 2 of the same things
        String actual= "apple";
        String expected="apple";
        Assert.assertEquals(actual,expected);
    }
    @Test(priority = 1)
    public void test2 (){
        System.out.println("Test 2 is running.....");
        String actual= "apple";
        String expected="apple";
        Assert.assertTrue(actual.equals(expected));
    }



}
