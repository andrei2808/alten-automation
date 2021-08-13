package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Utils.Constants.DRIVERS_PATH;

public class BrowserUtils {

    public static Browsers getBrowsers (String browser){
        switch (browser.toLowerCase()){
            case "chrome":{
                return Browsers.CHROME;
            }
            case "firefox":{
                return  Browsers.FIREFOX;
            }
            case "edge":{
                return Browsers.EDGE;
            }
            default:{
                return null;
            }
        }

    }



    public static WebDriver getDriver (String browser){
        WebDriver driver = null;
        switch (browser.toLowerCase()){
            case "chrome" : {
                System.setProperty("webdriver.chrome.driver", DRIVERS_PATH + "chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            case "firefox" : {
                break;
            }
            case "edge" : {
                break;
            }
            default:{
                throw new IllegalArgumentException("The value provided for the browser type is illegal:" + browser);
            }
        }
        return driver;
    }
}
