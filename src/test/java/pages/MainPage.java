package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement cityButton = $("a[href='/gorod/']");

    public MainPage openMainPage(){
        open("https://www.tinkoff.ru/");
        return this;
    }
    public MainPage clickCityButton(){
        cityButton.click();
        return this;
    }
}
