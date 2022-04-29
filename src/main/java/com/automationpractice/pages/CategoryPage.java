package com.automationpractice.pages;

import com.automationpractice.pages.helpers.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends WebElementHelper {

    public CategoryPage(WebDriver driver) {
        super(driver);
        waitForPageLoaded();
    }

    @FindBy(css = ".product_img_link img")
    private WebElement productImage;

    @FindBy(css = "a.quick-view")
    private WebElement quickViewButton;

    public CategoryPage hoverOnImage(){
        hoverElement(productImage);
        return this;
    }

    public CategoryPage clickOnQuickView(){
        clickOnElement(quickViewButton);
        return this;
    }

}
