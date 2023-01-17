package cydeo.TestBase;

import cydeo.Utilities.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBAse {
    public WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver= WebdriverFactory.getDriver("chrome");


    }
    @AfterMethod
    public  void tearDownMethod(){
        try{Thread.sleep(3000);}
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }

}
