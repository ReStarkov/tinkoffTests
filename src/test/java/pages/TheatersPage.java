package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import java.util.regex.Matcher;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class TheatersPage {
    protected SelenideElement theaterBreadCrumbs = $("[data-item-type='breadcrumbs']", 1);
    protected SelenideElement theaterPageHeader = $("[data-test='htmlTag title']", 0);
    protected SelenideElement theaterPageDescription = $("[data-test='htmlTag subtitle']", 0);
    protected SelenideElement theaterPageButton = $("[data-qa-type='uikit/button']");
    protected SelenideElement theaterPageApplication = $("[role='application']");
    protected SelenideElement theaterPageApplicationQrCode = $("[title='qrCode']");
    protected SelenideElement theaterPageApplicationGoogle= $("[data-test='googlePlayLink']");
    protected SelenideElement theaterPageApplicationAppstore = $("[data-test='appStoreLink']");
    protected SelenideElement theaterPageApplicationAppGallery = $("[data-test='appGalleryLink']");

    public TheatersPage openTheatersPage() {
        open("/gorod/theatres/");
        return this;
    }

}
