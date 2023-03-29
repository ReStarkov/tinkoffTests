package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ConcertsPage {

    SelenideElement concertBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    SelenideElement concertPageHeader = $("[data-test='htmlTag title']", 0);
    SelenideElement concertPageDescription = $("[data-test='htmlTag subtitle']", 0);

    public SelenideElement getConcertBreadCrumbs() {
        return concertBreadCrumbs;
    }

    public SelenideElement getConcertPageHeader() {
        return concertPageHeader;
    }

    public SelenideElement getConcertPageDescription() {
        return concertPageDescription;
    }

    public ConcertsPage elementShouldBeVisible(SelenideElement element) {
        element.shouldBe(Condition.visible);
        return this;
    }

    public ConcertsPage elementShouldHaveText(SelenideElement element, String expectText) {
        element.shouldBe(Condition.have(Condition.text(expectText)));
        return this;
    }
}
