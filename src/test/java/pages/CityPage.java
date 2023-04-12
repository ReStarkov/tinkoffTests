package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class CityPage {
    private SelenideElement headerText = $("[data-test='htmlTag title']", 0);
    private SelenideElement descriptionText = $("[data-test='htmlTag subtitle']", 0);
    private SelenideElement buttonMore = $("[data-qa-type='uikit/button']");
    private SelenideElement contentButtonMore = $("[data-qa-type='uikit/button.content']");
    private SelenideElement headerAfisha = $("[data-test='htmlTag title']", 1);
    private SelenideElement descriptionAfisha = $("[data-test='htmlTag subtitle']", 1);
    private SelenideElement cinemaCardButton = $("[data-test='htmlTag slides_button']", 0);
    private SelenideElement cinemaCardDescription = $("[data-test='htmlTag slides_subtitle']", 0);
    private SelenideElement cinemaCardPicture = $("[data-test='image']", 1);
    private SelenideElement concertsCardDescription = $("[data-test='htmlTag slides_subtitle']", 2);
    private SelenideElement concertsCardPicture = $("[data-test='image']", 3);
    private SelenideElement concertsCardButton = $("[data-test='htmlTag slides_button']", 2);
    private SelenideElement cinemaHeader = $("[data-test='htmlTag slides_title']", 0);
    private SelenideElement theaterHeader = $("[data-test='htmlTag slides_title']", 1);
    private SelenideElement concertsHeader = $("[data-test='htmlTag slides_title']", 2);
    private SelenideElement theaterCardDescription = $("[data-test='htmlTag slides_subtitle']", 1);
    private SelenideElement theaterCardPicture = $("[data-test='image']", 2);
    private SelenideElement theaterCardButton = $("[data-test='htmlTag slides_button']", 1);

    public CityPage openCityPage() {
        open("/gorod/");
        return this;
    }
}
