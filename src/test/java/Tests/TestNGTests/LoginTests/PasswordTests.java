package Tests.TestNGTests.LoginTests;

import Tests.TestNGTests.BaseCLass;
import org.testng.annotations.Test;

import static Utils.ConfigReader.URL;

public class PasswordTests extends BaseCLass {


    @Test
    public void passwordLessMin(){
        driver.get(URL + "#/login");


    }

    @Test
    public void passwordMinLength(){
        driver.get(URL + "#/login");

    }

    @Test
    public void passwordMaxLength(){
        driver.get(URL + "#/login");

    }

    @Test
    public void passwordMoreMax(){
        driver.get(URL + "#/login");

    }

    @Test
    public void passwordCharsetTest(){
        driver.get(URL + "#/login");

    }

    @Test
    public void passwordNull(){
        driver.get(URL + "#/login");

    }

    @Test
    public void passwordUsernameRegistered(){
        driver.get(URL + "#/login");

    }




}
