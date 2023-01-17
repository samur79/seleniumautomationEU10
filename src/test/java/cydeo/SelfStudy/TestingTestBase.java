package cydeo.SelfStudy;

import cydeo.TestBase.TestBAse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingTestBase extends TestBAse {
    @Test
    public  void gooleTitle(){
        driver.get("http://google.com");
        String expectedTitle="Google";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
