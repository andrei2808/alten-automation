package Tests.TestNGTests.LoginTests;

import Tests.TestNGTests.BaseCLass;
import org.testng.annotations.Test;

import static Utils.ConfigReader.URL;

public class UsernameTests extends BaseCLass {


    @Test
    public void usernameMoreMaxLength(){
        driver.get(URL + "#/login");

    }

    @Test
    public  void usernameMinimumLength(){
        driver.get(URL + "#/login");

    }

    @Test
    public void usernameLessMinLength() {
        driver.get(URL + "#/login");

    }

    @Test
    public void usernameMaxLength(){
        driver.get(URL + "#/login");


    }

    @Test
    public void usernameSPecialChars(){
        driver.get(URL + "#/login");

    }

    @Test
    public void usernameAlphanumeric() {
        driver.get(URL + "#/login");

    }

    @Test
    public void usernameNUll(){
        driver.get(URL + "#/login");

    }

    @Test
    public void usernameRegistered(){
        driver.get(URL + "#/login");

    }

    @Test
    public void usernameUnregistere(){
        driver.get(URL + "#/login");

    }
}
