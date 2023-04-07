package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CardFormTests extends BaseTest{
    @BeforeAll
    public static void openCardForm() {
        step("Открытие страницы оформления карты", () -> {
            cardForm.openCardForm();
        });
    }

    @Test
    @DisplayName("Открытие страницы оформления карточки. Заполнение формы")
    public void cardFormTest() {

        String fio = "Иванов Петя Петрович";
        String phone = "9262239323";
        String mail = "abc@mail.com";
        String date = "24101987";


        step("В форме отображается заголовок с текстом 'Выберите дизайн карты'", () -> {
            elementShouldHaveText(cardForm.getFormHeader(), "Выберите дизайн карты");
        });
        step("Нажатие на форму выбора категорий. Выбор 4х категорий в списке", () -> {
            cardForm.getChooseCategory().click();
            $(byText("5% - Аптеки")).click();
            $(byText("5% - Ozon.ru")).click();
            $(byText("3% - Пятёрочка")).click();
            $(byText("5% - Такси")).click();
            cardForm.getChooseCategory().click();
        });
        step("Ввод ФИО", () -> {
            cardForm.getFioInput().click();
            cardForm.getFioInputText().setValue(fio);
        });
        step("Ввод телефон", () -> {
            cardForm.getPhoneInput().click();
            cardForm.getPhoneInputText().setValue(phone);
        });
        step("Ввод email", () -> {
            cardForm.getEmailInput().click();
            cardForm.getEmailInputText().setValue(mail);
        });
        step("Ввод даты рождения", () -> {
            cardForm.getDateInput().click();
            cardForm.getDateInputText().setValue(date);
        });
        step("Ввод гражданства", () -> {
            cardForm.getChooseCountry().click();
            cardForm.getChooseCountryAccept().click();
        });
        step("Проверка результата", () -> {
            elementShouldHaveText(cardForm.getChooseCategory(),"5% - Аптеки, 5% - Ozon.ru, 3% - Пятёрочка, 5% - Такси");
            elementShouldHaveText(cardForm.getFioInput(), fio);
            elementShouldHaveText(cardForm.getPhoneInput(), "+7 (926) 223-93-23");
            elementShouldHaveText(cardForm.getChooseCountry(),"Имею гражданство РФ");
        });
    }
}
