package com.automationpractice.pages;

import com.automationpractice.pages.helpers.WebElementHelper;
import org.openqa.selenium.WebDriver;

public class HomePage extends WebElementHelper {

    public HomePage(WebDriver driver) {
        super(driver);
        waitForPageLoaded();
        initHeader();
        initFooter();
    }

    public HomePage goToDefinedCategory() {
        waitForPageLoaded();
        headerPage
                .hoverOnCategory(System.getProperty("parentCategory"))
                .goToSubcategory(System.getProperty("subcategory"));
        return this;
    }
}
