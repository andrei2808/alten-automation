package Tests.JunitTests;

import org.junit.*;

import static Utils.ConstantsUtils.URL_BASE2;

public class TestClasses extends BaseClassJunit{



    @Test
    public void test01() {
        System.out.println("This is my very first test!");
//        String s = "Alex";
//        int s2;
//        Assert.assertEquals("String assertion",s, "Alex");
//        int a = 5;
//        int b = 10;
//        Assert.assertEquals("Integer assertion",15,a+b);
//        Assert.assertTrue("Truth assertion",a+b!=15);
//        Assert.assertNull(s2);
        String searchQuery = "disney";
        String title = " Povesti din colectia de aur DIsney";
        Assert.assertTrue(title.toLowerCase().contains(searchQuery));
        driver.navigate().to(URL_BASE2);
    }

    @Test
    public void test02(){
        System.out.println("Test 02");
        //identify the search button place a string and hit run
        driver.navigate().to(URL_BASE2);
    }




}
