package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class FooterPage {
    private WebDriver driver;

    public FooterPage(WebDriver driver, WebElement element) {
        this.driver = driver;
        PageFactory.initElements(new DefaultElementLocatorFactory(element), this);
    }
}
