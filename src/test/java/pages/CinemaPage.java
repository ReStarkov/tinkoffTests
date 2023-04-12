package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class CinemaPage {

    private SelenideElement cinemaBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    private SelenideElement cinemaPageHeader = $("[data-test='htmlTag title']", 0);
    private SelenideElement cinemaPageDescription = $("[data-test='htmlTag subtitle']", 0);
    private SelenideElement cinemaPageButton = $("[data-qa-type='uikit/button']");
    private SelenideElement cinemaPageApplication = $("[role='application']");
    private SelenideElement cinemaPageApplicationQrCode = $("[title='qrCode']");
    private SelenideElement cinemaPageApplicationGoogle= $("[data-test='googlePlayLink']");
    private SelenideElement cinemaPageApplicationAppstore = $("[data-test='appStoreLink']");
    private SelenideElement cinemaPageApplicationAppGallery = $("[data-test='appGalleryLink']");

    public CinemaPage openCinemaPage() {
        open("/gorod/cinema/");
        return this;
    }

}
