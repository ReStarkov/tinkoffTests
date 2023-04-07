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

    SelenideElement chooseCategory = $("[data-qa-type='uikit/multiSelect.dropdown']");
    SelenideElement formHeader = $("[data-qa-type='uikit/sectionTitle']", 0);
    SelenideElement fioInput = $("[data-qa-type='uikit/inputFio.inputBox.inputContainer']");
    SelenideElement fioInputText = $("[data-qa-type='uikit/inputFio.value.input']");
    SelenideElement phoneInput = $("[data-qa-type='uikit/inputPhone.inputBox.inputContainer']");
    SelenideElement phoneInputText = $("[data-qa-type='uikit/inputPhone.value.input']");
    SelenideElement emailInput = $("[data-qa-type='uikit/inputAutocomplete.inputBox.inputContainer']");
    SelenideElement emailInputText = $("[data-qa-type='uikit/inputAutocomplete.value.input']");
    SelenideElement dateInput = $("[data-qa-type='uikit/input.inputBox uikit/input.inputBox_required']");
    SelenideElement dateInputText = $("[data-qa-type='uikit/input.value.input']");

    SelenideElement chooseCountry = $("[data-qa-type='uikit/select.wrapper uikit/select.wrapper_required']");
    SelenideElement chooseCountryAccept = $(byText("Имею гражданство РФ"));
}
