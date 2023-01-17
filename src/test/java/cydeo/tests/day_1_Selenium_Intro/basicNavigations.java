package cydeo.tests.day_1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicNavigations {
    public static void main(String[] args) throws InterruptedException {
        // 1- Setup browser driver
        WebDriverManager.chromedriver().setup();
        //2-Create instance of the driver
        // The line below opens a blank chrome page

        WebDriver driver=new ChromeDriver();
        // Go to "https://www.tesla.com"
        driver.manage().window().maximize();// makes the screen maximum
        driver.get("https://www.tesla.com");
        // use selenium to navigate back
        // this will slow down selenium
        Thread.sleep(3000L);
        String currentTittle= driver.getTitle();
        System.out.println("currentTittle = " + currentTittle);
        String curentURL=  driver.getCurrentUrl();
        System.out.println("cuurentURL = " + curentURL);

        driver.navigate().back();

        // this will slow down selenium
        Thread.sleep(3000L);
        //it will go forward to the next page
        driver.navigate().forward();

        // this will slow down selenium
        Thread.sleep(3000L);
        driver.navigate().refresh();

        Thread.sleep(3000L);
        driver.navigate().to("https://google.com");
        currentTittle=driver.getTitle();
        System.out.println("currentTittle = " + currentTittle);
        // driver get title

       // System.out.println(driver.getTitle());

      curentURL=driver.getCurrentUrl();
        System.out.println("cuurentURL = " + curentURL);

        // driver.close() closes the page opened
        driver.close();

        //closes all sessions of chrome windows
      //  driver.quit();


    }
}
