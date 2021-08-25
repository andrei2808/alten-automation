package Tests.JunitTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import static Utils.BrowserUtils.getBrowsers;
import static Utils.BrowserUtils.getDriver;
import static Utils.ConstantsUtils.CURRENT_BROWSER;

public class BaseClassJunit {

    WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This runs just once before all tests in the same class!");
    }


    @Before
    public void beforeTest(){
        System.out.println("THis surely runs each time before any test!");
        driver = getDriver(getBrowsers(CURRENT_BROWSER));

    }

    @After
    public void afterTest(){
        System.out.println("This is the method that runs after each test!");
        if (driver != null){
            driver.close();
        }
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This runs only once at the end of the tests in the same class!");
    }

}
