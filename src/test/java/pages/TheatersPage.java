package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class TheatersPage {
    private SelenideElement theaterBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    private SelenideElement theaterPageHeader = $("[data-test='htmlTag title']", 0);
    private SelenideElement theaterPageDescription = $("[data-test='htmlTag subtitle']", 0);
    private SelenideElement theaterPageButton = $("[data-qa-type='uikit/button']");
    private SelenideElement theaterPageApplication = $("[role='application']");
    private SelenideElement theaterPageApplicationQrCode = $("[title='qrCode']");
    private SelenideElement theaterPageApplicationGoogle= $("[data-test='googlePlayLink']");
    private SelenideElement theaterPageApplicationAppstore = $("[data-test='appStoreLink']");
    private SelenideElement theaterPageApplicationAppGallery = $("[data-test='appGalleryLink']");

    public TheatersPage openTheatersPage() {
        open("/gorod/theatres/");
        return this;
    }

}
