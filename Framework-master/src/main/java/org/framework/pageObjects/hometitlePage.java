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

public class hometitlePage extends Page {

    @FindBy(xpath = "span[contains(., 'Library')]")
    @AndroidFindBy(xpath = "span[contains(., 'Library')]")
    @iOSFindBy(id = "Library")
    private WebElement elePageTitle;

    @FindBy(xpath = "//div[@class='sectionContainer']/div[1]/button")
    @AndroidFindBy(xpath = "//div[@class='sectionContainer']/div[1]/button")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@button, 'your sites.')]")
    private WebElement verifysection;


    WebDriver driver;

    public hometitlePage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logMessage("Initializing the " + this.getClass().getSimpleName() + " elements");
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        Thread.sleep(1000);
    }

    public String getTitle() throws Exception {
        return getText(elePageTitle);
    }

    public void verifysection1() throws Exception {
        clickElement(verifysection);
    }
}
