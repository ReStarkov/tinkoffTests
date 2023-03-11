package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ConcertsPage {

    SelenideElement concertBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    SelenideElement concertPageHeader = $("[data-test='htmlTag title']", 0);
    SelenideElement concertPageDescription = $("[data-test='htmlTag subtitle']", 0);

    public ConcertsPage checkBreadCrumbs(String expectText){
        concertBreadCrumbs.shouldHave(Condition.text(expectText));
        return this;
    }

    public ConcertsPage checkPageHeader(String expectText){
        concertPageHeader.shouldHave(Condition.text(expectText));
        return this;
    }

    public ConcertsPage checkPageDescription(String expectText){
        concertPageDescription.shouldHave(Condition.text(expectText));
        return this;
    }
}
