package Tests.TestNGTests.DemoTests;

import Tests.TestNGTests.BaseCLass;
import Utils.ConstantsUtils;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgClasses extends BaseCLass {

    @Test
    public void test01(){
        System.out.println("My very first TestNG test!");
        double a = 1.05;
        double b = 2.01;
        double sum = a+b;
        Assert.assertEquals(sum, 3.06, 0.1, "Equalls!");
        driver.get(ConstantsUtils.URL_BASE2);
    }

    @Test
    public void test02(){
        System.out.println("Test 02");
        driver.get(ConstantsUtils.URL_BASE2);
    }



}
