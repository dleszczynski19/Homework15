package com.configuration;

import com.automationpractice.pages.configuration.BasePage;
import org.openqa.selenium.support.PageFactory;

public class PagesFactory extends TestBase {
    public <T extends BasePage> T at(Class<T> page) {
        return PageFactory.initElements(driver, page);
    }
}
