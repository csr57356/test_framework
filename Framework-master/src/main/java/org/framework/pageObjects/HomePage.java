package org.framework.pageObjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.framework.helpers.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.framework.logger.LoggingManager.logMessage;

public class HomePage extends Page {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(., 'Library')]")
    @AndroidFindBy(xpath = "//span[contains(., 'Library')]")
    @iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label, 'Library')]")
    private WebElement homeTitleBtn;

    @FindBy(xpath = "//div[@class='libraryListContainer']/ul/li[1]/strong/a")
    @AndroidFindBy(xpath = "//div[@class='libraryListContainer']/ul/li[1]/strong/a")
    @iOSFindBy(id = "link")
    private WebElement clickfirstest;
    
    @FindBy(xpath = "//div[@class='sectionContainer']/div[1]/button")
    @AndroidFindBy(xpath = "//div[@class='sectionContainer']/div[1]/button")
    @iOSFindBy(id = "Button")
    private WebElement section1;
    
    public HomePage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logMessage("Initializing the "+this.getClass().getSimpleName()+" elements");
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        Thread.sleep(1000);
    }

    public hometitlePage checkTitle() throws Exception {
        clickElement(homeTitleBtn);
        new hometitlePage(driver).getText(homeTitleBtn);
        logMessage("check title");
        return new hometitlePage(driver);
    }

    public hometitlePage clickfirsttest() throws Exception {
        clickElement(clickfirstest);
        new hometitlePage(driver).verifysection1();
        logMessage("click firsttest");
        return new hometitlePage(driver);
    }

    
    public hometitlePage clicksecton1() throws Exception {
        clickElement(clickfirstest);
        clickElement(section1);
        logMessage("section1");
        return new hometitlePage(driver);
    }

}