package Tests.JunitTests;

import org.junit.Test;

import static Utils.ConstantsUtils.URL_BASE2;

public class TestLoginJunit extends BaseClassJunit{

    @Test
    public void loginSIte(){
        System.out.println("Here we do the login");
        driver.navigate().to(URL_BASE2 + "/customer/account/login");
    }
}
