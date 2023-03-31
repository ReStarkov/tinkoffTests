package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class ConcertsPage {

    protected SelenideElement concertBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    protected SelenideElement concertPageHeader = $("[data-test='htmlTag title']", 0);
    protected SelenideElement concertPageDescription = $("[data-test='htmlTag subtitle']", 0);
    protected SelenideElement concertPageButton = $("[data-qa-type='uikit/button']");
    protected SelenideElement concertPageApplication = $("[role='application']");
    protected SelenideElement concertPageApplicationQrCode = $("[title='qrCode']");
    protected SelenideElement concertPageApplicationGoogle = $("[data-test='googlePlayLink']");
    protected SelenideElement concertPageApplicationAppstore = $("[data-test='appStoreLink']");
    protected SelenideElement concertPageApplicationAppGallery = $("[data-test='appGalleryLink']");

    public ConcertsPage openConcertsPage() {
        open("/gorod/concerts/");
        return this;
    }
}
