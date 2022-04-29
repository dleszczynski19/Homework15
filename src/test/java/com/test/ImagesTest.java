package com.test;

import com.automationpractice.pages.CategoryPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.QuickViewPage;
import com.configuration.PagesFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImagesTest extends PagesFactory {
    private Logger log = LoggerFactory.getLogger(ImagesTest.class);

    @Test
    public void shouldCheckEachIconImageIsViewed() {

        at(HomePage.class).goToDefinedCategory();

        at(CategoryPage.class)
                .hoverOnImage()
                .clickOnQuickView();

        at(QuickViewPage.class)
                .checkEachImage()
                .assertAll();
        log.info(passed, passedMessage);
    }
}