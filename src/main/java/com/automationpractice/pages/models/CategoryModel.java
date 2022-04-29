package com.automationpractice.pages.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class CategoryModel {
    private WebElement category;

    public CategoryModel(WebDriver driver, WebElement element) {
        this.driver = driver;
        PageFactory.initElements(new DefaultElementLocatorFactory(element), this);
        category = element;
    }

    private WebDriver driver;
    private String categoryName;
    private WebElement categoryLink;

    public String getCategoryName() {
        categoryName = category.getText();
        return categoryName;
    }

    @Override
    public String toString() {
        return "name: " + categoryName;
    }
}
