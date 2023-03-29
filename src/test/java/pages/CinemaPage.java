package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CinemaPage {

    SelenideElement cinemaBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    SelenideElement cinemaPageHeader = $("[data-test='htmlTag title']", 0);
    SelenideElement cinemaPageDescription = $("[data-test='htmlTag subtitle']", 0);

    public SelenideElement getCinemaBreadCrumbs() {
        return cinemaBreadCrumbs;
    }

    public SelenideElement getCinemaPageHeader() {
        return cinemaPageHeader;
    }

    public SelenideElement getCinemaPageDescription() {
        return cinemaPageDescription;
    }

    public CinemaPage checkBreadCrumbs(String expectText){
        cinemaBreadCrumbs.shouldHave(Condition.text(expectText));
        return this;
    }

    public CinemaPage checkPageHeader(String expectText){
        cinemaPageHeader.shouldHave(Condition.text(expectText));
        return this;
    }

    public CinemaPage checkPageDescription(String expectText){
        cinemaPageDescription.shouldHave(Condition.text(expectText));
        return this;
    }

    public CinemaPage elementShouldBeVisible(SelenideElement element) {
        element.shouldBe(Condition.visible);
        return this;
    }

    public CinemaPage elementShouldHaveText(SelenideElement element, String expectText) {
        element.shouldBe(Condition.have(Condition.text(expectText)));
        return this;
    }
}
