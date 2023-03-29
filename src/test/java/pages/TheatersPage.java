package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.regex.Matcher;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TheatersPage {
    protected SelenideElement theaterBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    protected SelenideElement theaterPageHeader = $("[data-test='htmlTag title']", 0);
    protected SelenideElement theaterPageDescription = $("[data-test='htmlTag subtitle']", 0);
    protected SelenideElement theaterPageButton = $("[data-qa-type='uikit/button']");
    protected SelenideElement theaterPageApplication = $("[role='application']");
    protected SelenideElement theaterPageApplicationQrCode = $("[title='qrCode']");
    protected SelenideElement theaterPageApplicationGoogle= $("[data-test='googlePlayLink']");
    protected SelenideElement theaterPageApplicationAppstore = $("[data-test='appStoreLink']");
    protected SelenideElement theaterPageApplicationAppGallery = $("[data-test='appGalleryLink']");
    public SelenideElement getTheaterPageApplicationGoogle() {
        return theaterPageApplicationGoogle;
    }

    public SelenideElement getTheaterPageApplicationAppstore() {
        return theaterPageApplicationAppstore;
    }

    public SelenideElement getTheaterPageApplicationAppGallery() {
        return theaterPageApplicationAppGallery;
    }

    public SelenideElement getTheaterPageApplicationQrCode() {
        return theaterPageApplicationQrCode;
    }

    public SelenideElement getTheaterPageApplication() {
        return theaterPageApplication;
    }

    public SelenideElement getTheaterPageButton() {
        return theaterPageButton;
    }

    public TheatersPage openTheatersPage() {
        open("/gorod/theatres/");
        return this;
    }

    public SelenideElement getTheaterBreadCrumbs() {
        return theaterBreadCrumbs;
    }

    public SelenideElement getTheaterPageDescription() {
        return theaterPageDescription;
    }

    public SelenideElement getTheaterPageHeader() {
        return theaterPageHeader;
    }

    public TheatersPage elementShouldBeVisible(SelenideElement element) {
        element.shouldBe(Condition.visible);
        return this;
    }

    public TheatersPage elementShouldHaveText(SelenideElement element, String expectText) {
        element.shouldBe(Condition.have(Condition.text(expectText)));
        return this;
    }
}
