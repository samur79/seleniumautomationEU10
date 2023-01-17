package cydeo.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverFactory {

    public static WebDriver getDriver( String browserType){

       WebDriver driver;

        if (System.getProperty("os.name").contains("Windows")) {
            if (browserType.equalsIgnoreCase("safari")) {
                throw new NullPointerException("Invalid browser :" + browserType);
            }
        }
        if (System.getProperty("os.name").contains("Mac")) {
            if (browserType.equalsIgnoreCase("edge")) {
                throw new NullPointerException("Invalid browser :" + browserType);
            }
        }

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return driver;
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return driver;

        } else if (browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return driver;

        } else if (browserType.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return driver;
        } else {
            System.out.println("Given driver type does not exist or not currently supported");
            System.out.println("driver= null");
            return null;
        }


    }
    }
    // TASK:NEW METHOD CREATION
    // Method name: getDriver
    // Static method
    //Accepts String arg: browserType
    // - This arg will determine what type of browser is opened
    // - if "chrome" passed ---> it will open chrome browser
    //- if "firefox" passed it will open firefox browser
    // Return type WebDriver
