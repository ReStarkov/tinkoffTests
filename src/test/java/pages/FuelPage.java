package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class FuelPage {

    protected SelenideElement fuelBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    protected SelenideElement fuelPageHeader = $("[data-test='htmlTag title']", 0);
    protected SelenideElement fuelPageDescription = $("[data-test='htmlTag subtitle']", 0);
    protected SelenideElement fuelPageButton = $("[data-qa-type='uikit/button']");
    protected SelenideElement fuelPageApplication = $("[role='application']");
    protected SelenideElement fuelPageApplicationQrCode = $("[title='qrCode']");
    protected SelenideElement fuelPageApplicationGoogle = $("[data-test='googlePlayLink']");
    protected SelenideElement fuelPageApplicationAppstore = $("[data-test='appStoreLink']");
    protected SelenideElement fuelPageApplicationAppGallery = $("[data-test='appGalleryLink']");

    public FuelPage openFuelPage() {
        open("/gorod/fuel/");
        return this;
    }
}
