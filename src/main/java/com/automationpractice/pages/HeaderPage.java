package com.automationpractice.pages;

import com.automationpractice.pages.helpers.WebElementHelper;
import com.automationpractice.pages.models.CategoryModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HeaderPage extends WebElementHelper {
    private Logger log = LoggerFactory.getLogger(HeaderPage.class);

    public HeaderPage(WebDriver driver, WebElement element) {
        super(driver);
        PageFactory.initElements(new DefaultElementLocatorFactory(element), this);
    }

    @FindBy(css = ".login")
    private WebElement loginButton;

    @FindBy(css = "#contact-link a")
    private WebElement contactUsButton;

    @FindBy(css = ".shop-phone strong")
    private WebElement contactPhoneLabel;

    @FindBy(css = "a[title=\"Women\"]")
    private WebElement womenCategory;

    @FindBy(css = "a[title=\"Blouses\"]")
    private WebElement blousesSubcategory;

    public HeaderPage hoverOnCategory(String categoryTitle) {
        hoverElement(findElementByCss("a[title=\"" + categoryTitle + "\"]"));
        return this;
    }

    public HeaderPage goToSubcategory(String subcategory) {
        clickOnElement(findElementByCss("a[title=\"" + subcategory + "\"]"));
        log.info("User moved to category: " + subcategory);
        return this;
    }
}
