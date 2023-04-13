package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class FuelPage {

    private SelenideElement fuelBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    private SelenideElement fuelPageHeader = $("[data-test='htmlTag title']", 0);
    private SelenideElement fuelPageDescription = $("[data-test='htmlTag subtitle']", 0);
    private SelenideElement fuelPageButton = $("[data-qa-type='uikit/button']");
    private SelenideElement fuelPageApplication = $("[role='application']");
    private SelenideElement fuelPageApplicationQrCode = $("[title='qrCode']");
    private SelenideElement fuelPageApplicationGoogle = $("[data-test='googlePlayLink']");
    private SelenideElement fuelPageApplicationAppstore = $("[data-test='appStoreLink']");
    private SelenideElement fuelPageApplicationAppGallery = $("[data-test='appGalleryLink']");

    public FuelPage openFuelPage() {
        open("/gorod/fuel/");
        return this;
    }
}
