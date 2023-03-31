package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class CityPage {
    protected SelenideElement headerText = $("[data-test='htmlTag title']", 0);
    protected SelenideElement descriptionText = $("[data-test='htmlTag subtitle']", 0);
    protected SelenideElement buttonMore = $("[data-qa-type='uikit/button']");
    protected SelenideElement contentButtonMore = $("[data-qa-type='uikit/button.content']");
    protected SelenideElement headerAfisha = $("[data-test='htmlTag title']", 1);
    protected SelenideElement descriptionAfisha = $("[data-test='htmlTag subtitle']", 1);
    protected SelenideElement cinemaCardButton = $("[data-test='htmlTag slides_button']", 0);
    protected SelenideElement cinemaCardDescription = $("[data-test='htmlTag slides_subtitle']", 0);
    protected SelenideElement cinemaCardPicture = $("[data-test='image']", 1);
    protected SelenideElement concertsCardDescription = $("[data-test='htmlTag slides_subtitle']", 2);
    protected SelenideElement concertsCardPicture = $("[data-test='image']", 3);
    protected SelenideElement concertsCardButton = $("[data-test='htmlTag slides_button']", 2);
    protected SelenideElement cinemaHeader = $("[data-test='htmlTag slides_title']", 0);
    protected SelenideElement theaterHeader = $("[data-test='htmlTag slides_title']", 1);
    protected SelenideElement concertsHeader = $("[data-test='htmlTag slides_title']", 2);
    protected SelenideElement theaterCardDescription = $("[data-test='htmlTag slides_subtitle']", 1);
    protected SelenideElement theaterCardPicture = $("[data-test='image']", 2);
    protected SelenideElement theaterCardButton = $("[data-test='htmlTag slides_button']", 1);

    public CityPage openCityPage() {
        open("/gorod/");
        return this;
    }
}
