package com.automationpractice.pages;

import com.automationpractice.pages.helpers.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class QuickViewPage extends WebElementHelper {
    private Logger log = LoggerFactory.getLogger(QuickViewPage.class);

    public QuickViewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#thumbs_list a")
    private List<WebElement> thumbsList;

    @FindBy(css = "#bigpic")
    private WebElement viewedImage;

    @FindBy(css = ".fancybox-iframe")
    private WebElement iframe;

    public QuickViewPage checkEachImage() {
        log.info("Checking is each image viewed on bigpic");
        waitForPageLoaded();
        switchIframe(iframe);
        waitForElement(viewedImage);
        for (WebElement element : thumbsList) {
            hoverElement(element);
            element = findElementInAnotherElement(element, "img");
            softAssert.assertThat(getAttributeValue(element, "src"))
                    .isEqualTo(getAttributeValue(viewedImage, "src").replaceAll("large", "cart"));
            log.info("Image with id: " + getAttributeValue(element, "id") + " checked");
        }
        return this;
    }

    public QuickViewPage assertAll() {
        softAssert.assertAll();
        return this;
    }
}
