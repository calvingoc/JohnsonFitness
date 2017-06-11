package com.lazerycode.selenium.page_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Calvin on 6/11/2017.
 * Page Class to hold toolbar link elements
 */
public class HomePageToolbar {
    @FindBy(css = "a.logo_link")
    public WebElement indexLogoLink;

    @FindBy(css = "a.sf-with-ul[href=\"http://us.corporate.johnsonfitness.com/content/about-us\"]")
    public WebElement aboutUsLink;

    @FindBy(css = "a.sf-with-ul[href=\"http://us.corporate.johnsonfitness.com/content/sustainability\"]")
    public WebElement sustainabilityLink;

    @FindBy(css = "li.sustainability.sf-breadcrumb-sfHover")
    public WebElement sustainabilityHover;

    @FindBy(linkText = "Our Products")
    public WebElement ourProductsSubLink;

    @FindBy(linkText = "Our Community")
    public WebElement ourCommunitySubLink;

    @FindBy(linkText = "Our People")
    public WebElement ourPeopleSubLink;

    @FindBy(linkText = "Our Building")
    public WebElement ourBuildingSubLink;

    @FindBy(css = "a.sf-with-ul[href=\"http://us.corporate.johnsonfitness.com/content/careers\"]")
    public WebElement careersLink;

    @FindBy(css = "a.sf-with-ul[href=\"http://us.corporate.johnsonfitness.com/content/product-registration\"]")
    public WebElement productRegistrationLink;

    @FindBy(css = "a.sf-with-ul[href=\"http://us.corporate.johnsonfitness.com/content/our-brands\"]")
    public WebElement ourBrandsLink;

    @FindBy(css = "a.sf-with-ul[href=\"/contact\"]")
    public WebElement contactUsLink;

    @FindBy(css = "a.worldwide_select")
    public WebElement globalSiteLink;
}
