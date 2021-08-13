package Tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

import static Utils.BrowserUtils.getDriver;
import static Utils.Constants.CURRENT_BROWSER;
import static Utils.Constants.URL_BASE;

public class TestClasses {

    WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This runs just once before all tests in the same class!");
    }


    @Before
    public void beforeTest(){
        System.out.println("THis surely runs each time before any test!");
        driver = getDriver(CURRENT_BROWSER);
        driver.navigate().to(URL_BASE);
    }

    @Test
    public void test01() {
        System.out.println("This is my very first test!");
    }

    @Test
    public void test02(){
        System.out.println("Test 02");
        //identify the search button place a string and hit run
    }

    @After
    public void afterTest(){
        System.out.println("This is the method that runs after each test!");
        driver.close();
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This runs only once at the end of the tests in the same class!");
    }


}
