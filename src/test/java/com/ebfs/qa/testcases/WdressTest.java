package com.ebfs.qa.testcases;

import com.ebfs.qa.base.TestBase;
import com.ebfs.qa.pages.ContactsPage;
import com.ebfs.qa.pages.HomePage;
import com.ebfs.qa.pages.LogInPage;
import com.ebfs.qa.pages.WdressPage;
import com.ebfs.qa.properties.WdressPageProperties;
import com.ebfs.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WdressTest extends TestBase {
    WdressPage wdressPage;

    public WdressTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
       wdressPage= new WdressPage();
    }

    @Test
    public void womenSelection(){
        wdressPage.SignIn();
        wdressPage.enterEmailToSignIn("uddin29fasih@yahoo.com");
        wdressPage.enterPasswdToSignIn("12345");
        wdressPage.womenSelection();

//        wdressPage.TShirt();
//         wdressPage.clickDress();
         wdressPage.sortBy();
         wdressPage.sortByZtoA();
        wdressPage.quickView();
        wdressPage.selectColor();
        wdressPage.selectSize();
        wdressPage.selectSize2();
       wdressPage.addToCart();
        wdressPage.getTwitter();

    }
    @AfterMethod
    public void tearDown(){
        try{
             Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
