package cydeo.Automation_Exercise;

import cydeo.TestBase.TestBAse;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1_Register_User extends TestBAse {

    @Test
    public void registerUser(){
        //1. Launch browser
        driver.get("https://automationexercise.com");

        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        WebElement loginSignupBtn= driver.findElement(By.xpath("//a[@href='/login']"));
        //4. Click on 'Signup / Login' button
        loginSignupBtn.click();
        //5. Verify 'New User Signup!' is visible
        WebElement newSingUP= driver.findElement(By.xpath("//div[@class='signup-form']"));
        //6. Enter name and email address
        WebElement nameBtn= driver.findElement(By.xpath("//input[@placeholder='Name']"));
        nameBtn.sendKeys("Abc Def");
        WebElement enterYourMail=driver.findElement(By.xpath("//form[@action='/signup']//input[@name='email']"));
        enterYourMail.sendKeys("abc@abc.info");
        //7. Click 'Signup' button
        WebElement singUpBtn= driver.findElement(By.xpath("//form[@action='/signup']//button[.='Signup']"));
        singUpBtn.click();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAcntInfo= driver.findElement(By.xpath("//b[.='Enter Account Information']"));
        String actualText= enterAcntInfo.getText();
        Assert.assertEquals(actualText,"ENTER ACCOUNT INFORMATION");
        //9. Fill details: Title, Name, Email, Password, Date of birth
        WebElement title= driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
        title.click();
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Abcdef");
        WebElement selectDay= driver.findElement(By.xpath("//select[@id='days']"));
        Select days=new Select(selectDay);
        days.selectByVisibleText("17");

        WebElement selectMonth= driver.findElement(By.xpath("//select[@id='months']"));
        Select months= new Select(selectMonth);
        months.selectByVisibleText("March");

        WebElement selectYear= driver.findElement(By.xpath("//select[@id='years']"));
        Select year= new Select(selectYear);
        year.selectByVisibleText("1980");
        //10. Select checkbox 'Sign up for our newsletter!'
        WebElement newsletterBox= driver.findElement(By.xpath("//input[@id='newsletter']"));
        newsletterBox.submit();

        //11. Select checkbox 'Receive special offers from our partners!'

       WebElement specialOffers= driver.findElement(By.xpath("//span[@id='optin']/span"));
        specialOffers.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName=driver.findElement(By.xpath("//input[@id='first_name']"));
        firstName.sendKeys("Abcde");

        WebElement lastName=driver.findElement(By.xpath("//input[@id='last_name']"));
        lastName.sendKeys("Efgij");
        WebElement address= driver.findElement(By.xpath("//input[@id='address1']"));
        address.sendKeys("Alphabet Road, Vowel Square, AB12CD");
        WebElement country=driver.findElement(By.xpath("//input[@id='country']"));
        Select countries= new Select(country);
        countries.selectByVisibleText("Singapore");
        WebElement state= driver.findElement(By.xpath("//input[@id='state']"));
        state.sendKeys("Alfanumeric");
        WebElement zipCode= driver.findElement(By.xpath("//input[@id='zipcode']"));
        zipCode.sendKeys("AB12CD");
        WebElement city= driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("Neverland");
        //13. Click 'Create Account button'
        WebElement createAccountBtn=driver.findElement(By.xpath("//button[.='Create Account']"));
        createAccountBtn.click();
        //14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement accountCreated= driver.findElement(By.xpath("//b[.='Account Created!']"));
        accountCreated.getText();
        Assert.assertEquals(accountCreated.getText(),"ACCOUNT CREATED!");
        //15. Click 'Continue' button
       WebElement continueBtn= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a]"));
       continueBtn.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Removing the all google ads in the HTML by JavaScript
        js.executeScript("const arr = document.querySelectorAll('.adsbygoogle'); " +
                "arr.forEach(e => e.remove());");


        //16. Verify that 'Logged in as username' is visible

        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }



}
