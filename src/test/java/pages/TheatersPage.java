package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
public class TheatersPage {

    SelenideElement theaterBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    SelenideElement theaterPageHeader = $("[data-test='htmlTag title']", 0);
    SelenideElement theaterPageDescription = $("[data-test='htmlTag subtitle']", 0);

    public TheatersPage checkBreadCrumbs(String expectText){
        theaterBreadCrumbs.shouldHave(Condition.text(expectText));
        return this;
    }

    public TheatersPage checkPageHeader(String expectText){
        theaterPageHeader.shouldHave(Condition.text(expectText));
        return this;
    }

    public TheatersPage checkPageDescription(String expectText){
        theaterPageDescription.shouldHave(Condition.text(expectText));
        return this;
    }
}
