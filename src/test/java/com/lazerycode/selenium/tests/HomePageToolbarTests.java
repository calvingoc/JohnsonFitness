package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_elements.HomePageToolbar;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Tests http://us.corporate.johnsonfitness.com/ toolbar's visibility and links
 * Created by Calvin on 6/11/2017.
 */
public class HomePageToolbarTests extends DriverBase {
    final static String HOME_PAGE = "http://us.corporate.johnsonfitness.com/";
    final static String GECKO_DRIVER_LOCATION ="C:\\selenium\\gecko\\geckodriver.exe";
    private WebDriver driver;
    private HomePageToolbar page;

    @BeforeClass
    public void setUp() throws Exception{
        System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_LOCATION);
        driver = getDriver();
        page = PageFactory.initElements(driver, HomePageToolbar.class);
    }

    @Test
    public void homePageToolbarVisibility(){
        driver.get(HOME_PAGE);
        Assert.assertTrue(page.indexLogoLink.isDisplayed());
        Assert.assertTrue(page.aboutUsLink.isDisplayed());
        Assert.assertTrue(page.sustainabilityLink.isDisplayed());
        Assert.assertTrue(page.careersLink.isDisplayed());
        Assert.assertTrue(page.productRegistrationLink.isDisplayed());
        Assert.assertTrue(page.ourBrandsLink.isDisplayed());
        Assert.assertTrue(page.contactUsLink.isDisplayed());
        Assert.assertTrue(page.globalSiteLink.isDisplayed());
    }

    @Test
    public void submenuVisibility() throws Exception{
        driver.get(HOME_PAGE);
        Assert.assertFalse(page.ourProductsSubLink.isDisplayed());
        Assert.assertFalse(page.ourCommunitySubLink.isDisplayed());
        Assert.assertFalse(page.ourPeopleSubLink.isDisplayed());
        Assert.assertFalse(page.ourBuildingSubLink.isDisplayed());
        Actions builder = new Actions(driver);
        Action mouseOver = builder.moveToElement(page.sustainabilityHover).build();
        mouseOver.perform();
        Assert.assertTrue(page.ourProductsSubLink.isDisplayed());
        Assert.assertTrue(page.ourCommunitySubLink.isDisplayed());
        Assert.assertTrue(page.ourPeopleSubLink.isDisplayed());
        Assert.assertTrue(page.ourBuildingSubLink.isDisplayed());
    }

    @Test
    public void indexLink(){
        driver.get(HOME_PAGE);
        page.indexLogoLink.click();
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("element_1")));
        Assert.assertTrue(driver.getCurrentUrl().equals("http://www.johnsonfitness.com/globe/index"));
    }

    @Test
    public void aboutUsLink(){
        driver.get(HOME_PAGE);
        page.aboutUsLink.click();
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("content_127")));
        Assert.assertTrue(driver.getCurrentUrl().equals("http://us.corporate.johnsonfitness.com/content/about-us"));
    }

    @Test
    public void sustainabilityLink(){
        driver.get(HOME_PAGE);
        page.sustainabilityLink.click();
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("content_342")));
        Assert.assertTrue(driver.getCurrentUrl().equals("http://us.corporate.johnsonfitness.com/content/sustainability"));
    }

    @Test
    public void sustainabilitySubmenu(){
        driver.get(HOME_PAGE);
        page.sustainabilityLink.click();
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("content_342")));
        Assert.assertTrue(page.ourBuildingSubLink.isDisplayed());
        Assert.assertTrue(page.ourPeopleSubLink.isDisplayed());
        Assert.assertTrue(page.ourCommunitySubLink.isDisplayed());
        Assert.assertTrue(page.ourProductsSubLink.isDisplayed());
    }

    @Test
    public void careersLink(){
        driver.get(HOME_PAGE);
        page.careersLink.click();
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("content_130")));
        Assert.assertTrue(driver.getCurrentUrl().equals("http://us.corporate.johnsonfitness.com/content/careers"));
    }

    @Test
    public void productRegistrationLink(){
        driver.get(HOME_PAGE);
        page.productRegistrationLink.click();
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("content_135")));
        Assert.assertTrue(driver.getCurrentUrl().equals("http://us.corporate.johnsonfitness.com/content/product-registration"));
    }

    @Test
    public void ourBrandsLink(){
        driver.get(HOME_PAGE);
        page.ourBrandsLink.click();
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("content_140")));
        Assert.assertTrue(driver.getCurrentUrl().equals("http://us.corporate.johnsonfitness.com/content/our-brands"));
    }

    @Test
    public void contactUsLink(){
        driver.get(HOME_PAGE);
        page.contactUsLink.click();
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("content_144")));
        Assert.assertTrue(driver.getCurrentUrl().equals("http://us.corporate.johnsonfitness.com/contact"));
    }

    @Test
    public void globalLink(){
        driver.get(HOME_PAGE);
        page.globalSiteLink.click();
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("element_1")));
        Assert.assertTrue(driver.getCurrentUrl().equals("http://www.johnsonfitness.com/globe/index"));
    }
}
