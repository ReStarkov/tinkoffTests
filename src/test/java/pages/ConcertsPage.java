package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ConcertsPage {

    SelenideElement сoncertBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    SelenideElement сoncertPageHeader = $("[data-test='htmlTag title']", 0);
    SelenideElement сoncertPageDescription = $("[data-test='htmlTag subtitle']", 0);

    public ConcertsPage checkBreadCrumbs(String expectText){
        сoncertBreadCrumbs.shouldHave(Condition.text(expectText));
        return this;
    }

    public ConcertsPage checkPageHeader(String expectText){
        сoncertPageHeader.shouldHave(Condition.text(expectText));
        return this;
    }

    public ConcertsPage checkPageDescription(String expectText){
        сoncertPageDescription.shouldHave(Condition.text(expectText));
        return this;
    }
}
