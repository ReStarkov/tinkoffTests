package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CityPage {
    SelenideElement headerText = $("[data-test='htmlTag title']");
    SelenideElement descriptionText = $("[data-test='htmlTag subtitle']");
    SelenideElement buttonMore = $("[data-qa-type='uikit/button']");
    SelenideElement contentButtonMore = $("[data-qa-type='uikit/button.content']");

    public CityPage openCityPage(){
        open("/gorod/");
        return this;
    }

    public CityPage headerShouldHaveText(String expectText){
        headerText.shouldHave(Condition.text(expectText));
        return this;
    }

    public CityPage descriptionShouldHaveText(String expectText){
        descriptionText.shouldHave(Condition.text(expectText));
        return this;
    }

    public CityPage buttonMoreShouldBeVisible(){
        buttonMore.shouldHave(Condition.visible);
        return this;
    }

    public CityPage buttonMoreShouldHaveText(String expectText){
        contentButtonMore.shouldHave(Condition.text(expectText));
        return this;
    }
}
