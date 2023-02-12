package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CityPage {
    protected SelenideElement headerText = $("[data-test='htmlTag title']", 0);
    protected SelenideElement descriptionText = $("[data-test='htmlTag subtitle']", 0);
    protected  SelenideElement buttonMore = $("[data-qa-type='uikit/button']");
    protected SelenideElement contentButtonMore = $("[data-qa-type='uikit/button.content']");
    protected SelenideElement headerAfisha = $("[data-test='htmlTag title']", 1);
    protected SelenideElement descriptionAfisha = $("[data-test='htmlTag subtitle']", 1);
    protected SelenideElement cinemaCard = $("a[href='/gorod/cinema/']");
    protected SelenideElement cinemaCardButton = $(".gb5eVuVwS", 0);
    protected SelenideElement cinemaCardDescription = $(".eb5eVuVwS", 0);
    protected SelenideElement cinemaCardPicture = $(".fb5eVuVwS [data-test='image']", 0);
    protected SelenideElement concertsCard = $("a[href='/gorod/concerts/']");
    protected SelenideElement concertsCardDescription = $(".eb5eVuVwS", 2);
    protected SelenideElement concertsCardPicture = $(".fb5eVuVwS [data-test='image']", 2);
    protected SelenideElement concertsCardButton = $(".gb5eVuVwS", 2);
    protected SelenideElement theaterCard = $("a[href='/gorod/theatres/']");
    protected SelenideElement theaterCardDescription = $(".eb5eVuVwS", 1);
    protected SelenideElement theaterCardPicture = $(".fb5eVuVwS [data-test='image']", 1);
    protected SelenideElement theaterCardButton = $(".gb5eVuVwS", 1);

    public SelenideElement getTheaterCard() {
        return theaterCard;
    }

    public SelenideElement getTheaterCardDescription() {
        return theaterCardDescription;
    }

    public SelenideElement getTheaterCardPicture() {
        return theaterCardPicture;
    }

    public SelenideElement getTheaterCardButton() {
        return theaterCardButton;
    }
    public SelenideElement getConcertsCard() {

        return concertsCard;
    }

    public SelenideElement getConcertsCardPicture() {
        return concertsCardPicture;
    }

    public SelenideElement getConcertsCardButton() {
        return concertsCardButton;
    }

    public SelenideElement getConcertsCardDescription() {
        return concertsCardDescription;
    }

    public SelenideElement getCinemaCardButton() {
        return cinemaCardButton;
    }

    public SelenideElement getCinemaCard() {
        return cinemaCard;
    }
    public SelenideElement getCinemaCardDescription() {
        return cinemaCardDescription;
    }

    public SelenideElement getCinemaCardPicture() {
        return cinemaCardPicture;
    }

    public CityPage openCityPage(){
        open("/gorod/");
        return this;
    }

    public CityPage headerShouldHaveText(String expectText){
        headerText.shouldHave(text(expectText));
        return this;
    }

    public CityPage descriptionShouldHaveText(String expectText){
        descriptionText.shouldHave(text(expectText));
        return this;
    }

    public CityPage buttonMoreShouldBeVisible(){
        buttonMore.shouldHave(Condition.visible);
        return this;
    }

    public CityPage buttonMoreShouldHaveText(String expectText){
        contentButtonMore.shouldHave(text(expectText));
        return this;
    }

    public CityPage clickMoreButton(){
        buttonMore.click();
        return this;
    }

    public CityPage afishaHeaderShouldHaveText(String expectText){
        headerAfisha.shouldHave(text(expectText));
        return this;
    }

    public CityPage afishaDescriptionShouldHaveText(String expectText){
        descriptionAfisha.shouldHave(text(expectText));
        return this;
    }

    public CityPage cardHaveHeader(SelenideElement card, String expectText){
        card.shouldHave(text(expectText));
        return this;
    }

    public CityPage cardHaveDescription(SelenideElement cardDescription, String expectText){
        cardDescription.shouldHave(text(expectText));
        return this;
    }

    public CityPage cardButtonHaveHeader(SelenideElement cardButton, String expectText){
        cardButton.shouldHave(text(expectText));
        return this;
    }

    public CityPage cardPictureShouldBeVisable(SelenideElement cardPicture){
        cardPicture.shouldBe(visible);
        return this;
    }

    public CityPage сardButtonClick(SelenideElement сardButton){
        сardButton.click();
        return this;
    }
}
