package tests;

import org.framework.allureReport.TestListener;
import org.framework.imageCompare.ImageComparator;
import org.framework.pageObjects.HomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners({TestListener.class})
public class HomePageTest extends BaseTest {

    SoftAssert softAssert = new SoftAssert();

    @Test(description = "testing the page visually")
    public void checktitlepage() throws Exception {
        HomePage homePage = new HomePage(driver);
        softAssert.assertTrue(new ImageComparator(driver).compare("homePage"), "homePage baseline image isn't matching with actual image.");
        homePage.checkTitle();
        softAssert.assertTrue(new ImageComparator(driver).compare("homePage"), "Page baseline image isn't matching with actual image.");
        softAssert.assertAll();
    }

    @Test(description = "testing the page visually")
    public void clickfirstpage() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.clickfirsttest();
        softAssert.assertTrue(new ImageComparator(driver).compare("homePage"), "homePage baseline image isn't matching with actual image.");
        softAssert.assertAll();
    }
    
    @Test(description = "testing the page visually")
    public void clicksection1() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.clicksecton1();
        softAssert.assertTrue(new ImageComparator(driver).compare("homePage"), "Page baseline image isn't matching with actual image.");
        softAssert.assertAll();
    }

}