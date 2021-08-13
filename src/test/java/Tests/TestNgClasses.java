package Tests;

import Utils.BrowserUtils;
import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestNgClasses {

    WebDriver driver;

    @BeforeClass
    public void beforeAll(){
        System.out.println("BEFORE CLASS");
    }

    @BeforeMethod
    public void beforeTests(){
        System.out.println("Before Test");
        driver = BrowserUtils.getDriver(Constants.CURRENT_BROWSER);
        driver.get(Constants.URL_BASE);

    }

    @Test
    public void test01(){
        System.out.println("My very first TestNG test!");
    }

    @Test
    public void test02(){
        System.out.println("Test 02");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AFTER TEST");
        driver.close();
    }

    @AfterClass
    public void afterALL(){
        System.out.println("AFTER ALL");
    }
}
