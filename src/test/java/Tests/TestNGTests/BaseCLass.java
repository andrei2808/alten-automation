package Tests.TestNGTests;

import Utils.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static Utils.BrowserUtils.getBrowsers;

public class BaseCLass {
    public WebDriver driver;

    @BeforeClass
    public void beforeAll(){
//        System.out.println("BEFORE CLASS");
        ConfigReader.readConfigFile();
//        System.out.println(SystemVariableReader.BROWSER);
//        System.out.println(SystemVariableReader.ENV);
//        SystemVariableReader.printSystemVariables();
        Log.info("Starting Tests");
    }

    @BeforeMethod
    public void beforeTests(){
//        System.out.println("Before Test");
        //System.out.println(ConstantsUtils.CURRENT_BROWSER);
        System.out.println("URL: " + ConfigReader.URL);
        System.out.println("BROWSER: " + getBrowsers(ConfigReader.BROWSER));
        System.out.println("ENV :" + ConfigReader.ENV);
        driver = BrowserUtils.getDriver(getBrowsers(ConfigReader.BROWSER));
    }

    @AfterMethod
    public void afterMethod(){
//        System.out.println("AFTER TEST");
        if (driver != null) {
            driver.close();
        }
    }
    @AfterClass
    public void afterALL(){
//        System.out.println("AFTER ALL");
        Log.info("Tests ended");
    }
}
