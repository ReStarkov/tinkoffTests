package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class СinemaPage {

    SelenideElement cinemaBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    SelenideElement cinemaPageHeader = $("[data-test='htmlTag title']", 0);
    SelenideElement cinemaPageDescription = $("[data-test='htmlTag subtitle']", 0);

    public СinemaPage checkBreadCrumbs(String expectText){
        cinemaBreadCrumbs.shouldHave(Condition.text(expectText));
        return this;
    }

    public СinemaPage checkPageHeader(String expectText){
        cinemaPageHeader.shouldHave(Condition.text(expectText));
        return this;
    }

    public СinemaPage checkPageDescription(String expectText){
        cinemaPageDescription.shouldHave(Condition.text(expectText));
        return this;
    }
}
