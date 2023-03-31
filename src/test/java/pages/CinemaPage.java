package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class CinemaPage {

    protected SelenideElement cinemaBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    protected SelenideElement cinemaPageHeader = $("[data-test='htmlTag title']", 0);
    protected SelenideElement cinemaPageDescription = $("[data-test='htmlTag subtitle']", 0);
    protected SelenideElement cinemaPageButton = $("[data-qa-type='uikit/button']");
    protected SelenideElement cinemaPageApplication = $("[role='application']");
    protected SelenideElement cinemaPageApplicationQrCode = $("[title='qrCode']");
    protected SelenideElement cinemaPageApplicationGoogle= $("[data-test='googlePlayLink']");
    protected SelenideElement cinemaPageApplicationAppstore = $("[data-test='appStoreLink']");
    protected SelenideElement cinemaPageApplicationAppGallery = $("[data-test='appGalleryLink']");

    public CinemaPage openCinemaPage() {
        open("/gorod/cinema/");
        return this;
    }

}
