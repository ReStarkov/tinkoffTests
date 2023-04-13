package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class ConcertsTests extends BaseTest {

    @BeforeAll
    public static void openConcertPage() {
        step("Открытие страницы 'Тинькофф город - Концерты'", () -> {
            concertsPage.openConcertsPage();
        });
    }

    @Test
    @DisplayName("Открытие страницы 'Тинькофф Город - Концерты'. Проверка наличия блока мобильного приложения на странице")
    public void theatersPageTest() {
        step("При переходе в раздел 'Концерты' на экране отображается заголовок 'Билеты на концерты в приложении Тинькофф'", () -> {
            elementShouldHaveText(concertsPage.getConcertPageHeader(), "Билеты на концерты в приложении Тинькофф");
        });
        step("На экране отображается кнопка с текстом 'Выбрать концерт''", () -> {
            elementShouldBeVisible(concertsPage.getConcertPageButton());
            elementShouldHaveText(concertsPage.getConcertPageButton(), "Выбрать концерт");
        });
        step("Нажатие на кнопку с текстом 'Выбрать концерт'", () -> {
            concertsPage.getConcertPageButton().click();
        });
        step("Произошел переход к блоку мобильного приложения. В блоке отображается надпись 'Выберите мероприятие' ", () -> {
            elementShouldBeVisible(concertsPage.getConcertPageApplication());
            step("В блоке отображается надпись 'Выберите мероприятие", () -> {
                elementShouldHaveText(concertsPage.getConcertPageApplication(), "Выберите мероприятие");
            });
            step("В блоке отображается QR-код", () -> {
                elementShouldBeVisible(concertsPage.getConcertPageApplicationQrCode());
            });
            step("В блоке отображаются иконки мобильных маркетов App store, Google play, AppGalery", () -> {
                elementShouldBeVisible(concertsPage.getConcertPageApplicationGoogle());
                elementShouldBeVisible(concertsPage.getConcertPageApplicationAppGallery());
                elementShouldBeVisible(concertsPage.getConcertPageApplicationAppstore());
            });
        });
    }
}
