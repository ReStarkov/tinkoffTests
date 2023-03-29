package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class TheatersTests extends BaseTest {

    @BeforeAll
    public static void openTheatersPage() {
        step("Открытие страницы 'Тинькофф город - Театры'", () -> {
            theatersPage.openTheatersPage();
        });
    }

    @Test
    @DisplayName("Открытие страницы 'Тинькофф Город - Театры'. Проверка наличия блока мобильного приложения на странице")
    public void theatersPageTest() {
        step("При переходе в раздел 'Театр' на экране отображается заголовок 'Билеты в театр в приложении Тинькофф'", () -> {
            theatersPage.elementShouldHaveText(theatersPage.getTheaterPageHeader(), "Билеты в театр в приложении Тинькофф");
        });
        step("На экране отображается кнопка с текстом 'Выбрать представление''", () -> {
            theatersPage.elementShouldBeVisible(theatersPage.getTheaterPageButton());
            theatersPage.elementShouldHaveText(theatersPage.getTheaterPageButton(),"Выбрать представление");
        });
        step("Нажатие на кнопку с текстом 'Выбрать представление''", () -> {
            theatersPage.getTheaterPageButton().click();
        });
        step("Произошел переход к блоку мобильного приложения. В блоке отображается надпись 'Выберите представление' ", () -> {
            theatersPage.elementShouldBeVisible(theatersPage.getTheaterPageApplication());
            step("В блоке отображается надпись 'Выберите представлени ", () -> {
                theatersPage.elementShouldHaveText(theatersPage.getTheaterPageApplication(),"Выберите представление");
            });
            step("В блоке отображается надпись QR-код", () -> {
                theatersPage.elementShouldBeVisible(theatersPage.getTheaterPageApplicationQrCode());
            });
            step("В блоке отображаются иконки мобильных маркетов App store, Google play, AppGalery", () -> {
                theatersPage.elementShouldBeVisible(theatersPage.getTheaterPageApplicationGoogle());
                theatersPage.elementShouldBeVisible(theatersPage.getTheaterPageApplicationAppGallery());
                theatersPage.elementShouldBeVisible(theatersPage.getTheaterPageApplicationAppstore());
            });
        });
    }
}
