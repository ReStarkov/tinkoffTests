package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class ConcertsPage {

    private SelenideElement concertBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    private SelenideElement concertPageHeader = $("[data-test='htmlTag title']", 0);
    private SelenideElement concertPageDescription = $("[data-test='htmlTag subtitle']", 0);
    private SelenideElement concertPageButton = $("[data-qa-type='uikit/button']");
    private SelenideElement concertPageApplication = $("[role='application']");
    private SelenideElement concertPageApplicationQrCode = $("[title='qrCode']");
    private SelenideElement concertPageApplicationGoogle = $("[data-test='googlePlayLink']");
    private SelenideElement concertPageApplicationAppstore = $("[data-test='appStoreLink']");
    private SelenideElement concertPageApplicationAppGallery = $("[data-test='appGalleryLink']");

    public ConcertsPage openConcertsPage() {
        open("/gorod/concerts/");
        return this;
    }
}
