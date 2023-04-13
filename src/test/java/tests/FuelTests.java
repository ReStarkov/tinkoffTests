package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class FuelTests extends BaseTest {

    @BeforeAll
    public static void openConcertPage() {
        step("Открытие страницы 'Тинькофф город - Топливо'", () -> {
            fuelPage.openFuelPage();
        });
    }

    @Test
    @DisplayName("Открытие страницы 'Тинькофф Город - Топливо'. Проверка наличия блока мобильного приложения на странице")
    public void fuelPageTest() {
        step("При переходе в раздел 'Топливо' на экране отображается заголовок 'Топливо с кэшбэком до 10% в приложении Тинькофф'", () -> {
            elementShouldHaveText(fuelPage.getFuelPageHeader(), "Топливо с кэшбэком до 10% в приложении Тинькофф");
        });
        step("На экране отображается кнопка с текстом 'Найти заправку''", () -> {
            elementShouldBeVisible(fuelPage.getFuelPageButton());
            elementShouldHaveText(fuelPage.getFuelPageButton(), "Найти заправку");
        });
        step("Нажатие на кнопку с текстом 'Найти заправку'", () -> {
            fuelPage.getFuelPageButton().click();
        });
        step("Произошел переход к блоку мобильного приложения. В блоке отображается надпись 'Заправляйте топливо с кэшбэкоме' ", () -> {
            elementShouldBeVisible(fuelPage.getFuelPageApplication());
            step("В блоке отображается надпись 'Выберите мероприятие", () -> {
                elementShouldHaveText(fuelPage.getFuelPageApplication(), "Заправляйте топливо с кэшбэком");
            });
            step("В блоке отображается QR-код", () -> {
                elementShouldBeVisible(fuelPage.getFuelPageApplicationQrCode());
            });
            step("В блоке отображаются иконки мобильных маркетов App store, Google play, AppGalery", () -> {
                elementShouldBeVisible(fuelPage.getFuelPageApplicationGoogle());
                elementShouldBeVisible(fuelPage.getFuelPageApplicationAppGallery());
                elementShouldBeVisible(fuelPage.getFuelPageApplicationAppstore());
            });
        });
    }
}
