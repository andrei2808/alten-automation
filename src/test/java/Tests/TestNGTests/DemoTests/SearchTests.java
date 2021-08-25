package Tests.TestNGTests.DemoTests;

import Tests.TestNGTests.BaseCLass;
import Utils.ConstantsUtils;
import org.testng.annotations.Test;

public class SearchTests extends BaseCLass {

    @Test
    public void searchTest(){
        System.out.println("Here we do the seach test");
        driver.get(ConstantsUtils.URL_BASE2);


    }
}
