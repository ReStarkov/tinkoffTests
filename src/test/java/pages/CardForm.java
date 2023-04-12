package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Data
public class CardForm {
    public CardForm openCardForm() {
        open("/cards/debit-cards/tinkoff-black/?internal_source=home_main_block_button#form");
        return this;
    }

    private SelenideElement chooseCategory = $("[data-qa-type='uikit/multiSelect.dropdown']");
    private SelenideElement formHeader = $("[data-qa-type='uikit/sectionTitle']", 0);
    private SelenideElement fioInput = $("[data-qa-type='uikit/inputFio.inputBox.inputContainer']");
    private SelenideElement fioInputText = $("[data-qa-type='uikit/inputFio.value.input']");
    private SelenideElement phoneInput = $("[data-qa-type='uikit/inputPhone.inputBox.inputContainer']");
    private SelenideElement phoneInputText = $("[data-qa-type='uikit/inputPhone.value.input']");
    private SelenideElement emailInput = $("[data-qa-type='uikit/inputAutocomplete.inputBox.inputContainer']");
    private SelenideElement emailInputText = $("[data-qa-type='uikit/inputAutocomplete.value.input']");
    private SelenideElement dateInput = $("[data-qa-type='uikit/input.inputBox uikit/input.inputBox_required']");
    private SelenideElement dateInputText = $("[data-qa-type='uikit/input.value.input']");
    private SelenideElement chooseCountry = $("[data-qa-type='uikit/select.wrapper uikit/select.wrapper_required']");
    private SelenideElement chooseCountryAccept = $(byText("Имею гражданство РФ"));
    private SelenideElement choosePharmacy = $(byText("5% - Аптеки"));
    private SelenideElement chooseOzon = $(byText("5% - Ozon.ru"));
    private SelenideElement chooseFive = $(byText("3% - Пятёрочка"));
    private SelenideElement chooseTaxi = $(byText("5% - Такси"));

}
