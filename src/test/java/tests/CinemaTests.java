package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class CinemaTests extends BaseTest {

    @BeforeAll
    public static void openCinemasPage() {
        step("Открытие страницы 'Тинькофф город - Кино'", () -> {
            cinemaPage.openCinemaPage();
        });
    }

    @Test
    @DisplayName("Открытие страницы 'Тинькофф Город - Кино'. Проверка наличия блока мобильного приложения на странице")
    public void theatersPageTest() {
        step("При переходе в раздел 'Кино' на экране отображается заголовок 'Билеты в кино в приложении Тинькофф'", () -> {
            elementShouldHaveText(cinemaPage.getCinemaPageHeader(), "Билеты в кино в приложении Тинькофф");
        });
        step("На экране отображается кнопка с текстом 'Выбрать сеанс''", () -> {
            elementShouldBeVisible(cinemaPage.getCinemaPageButton());
            elementShouldHaveText(cinemaPage.getCinemaPageButton(), "Выбрать сеанс");
        });
        step("Нажатие на кнопку с текстом 'Выбрать сеанс'", () -> {
            cinemaPage.getCinemaPageButton().click();
        });
        step("Произошел переход к блоку мобильного приложения. В блоке отображается надпись 'Выберите киносеанс' ", () -> {
            elementShouldBeVisible(cinemaPage.getCinemaPageApplication());
            step("В блоке отображается надпись 'Выберите киносеанс", () -> {
                elementShouldHaveText(cinemaPage.getCinemaPageApplication(), "Выберите киносеанс");
            });
            step("В блоке отображается QR-код", () -> {
                elementShouldBeVisible(cinemaPage.getCinemaPageApplicationQrCode());
            });
            step("В блоке отображаются иконки мобильных маркетов App store, Google play, AppGalery", () -> {
                elementShouldBeVisible(cinemaPage.getCinemaPageApplicationGoogle());
                elementShouldBeVisible(cinemaPage.getCinemaPageApplicationAppGallery());
                elementShouldBeVisible(cinemaPage.getCinemaPageApplicationAppstore());
            });
        });
    }
}
