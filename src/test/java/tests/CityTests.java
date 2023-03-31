package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class CityTests extends BaseTest {
    public void openCityPageGoToAfisha() {
        step("Открытие страницы 'Тинькофф город'", () -> {
            cityPage.openCityPage();
        });
        step("Нажатие на кнопку 'Узнать больше'", () -> {
            cityPage.getButtonMore().click();
        });
    }

    @Test
    @DisplayName("Открытие страницы 'Тинькофф Город'. Проверка наличия элементов на странице")
    public void openCity() {
        step("Открытие страницы 'Тинькофф город'", () -> {
            cityPage.openCityPage();
        });
        step("На странице отображается заголовок 'Тинькофф Город'", () -> {
            elementShouldHaveText(cityPage.getHeaderText(), "Тинькофф Город");
        });
        step("На странице отображается подзаголовок \"Покупайте билеты на мероприятия, бронируйте рестораны и оплачивайте повседневные сервисы —\n" +
                "прямо в приложении Тинькофф'", () -> {
            elementShouldHaveText(cityPage.getDescriptionText(), "Покупайте билеты на мероприятия, бронируйте рестораны и оплачивайте повседневные сервисы —\n" +
                    "прямо в приложении Тинькофф");
        });
        step("На странице отображается кнопка 'Узнать больше'", () -> {
            elementShouldBeVisible(cityPage.getButtonMore());
            elementShouldHaveText(cityPage.getButtonMore(), "Узнать больше");
        });
    }

    @Test
    @DisplayName("В разделе 'Тинькофф Город' отображается блок 'Афиша' содержащий три карточки: 'Концерты', 'Кино', 'Театр'")
    public void afishaSectionTest() {
        openCityPageGoToAfisha();
        step("На экране отображается заголовок 'Афиша'", () -> {
            elementShouldHaveText(cityPage.getHeaderAfisha(), "Афиша");
        });
        step("На экране отображается подзаголовок 'Следите за мероприятиями в вашем городе и сразу покупайте билеты'", () -> {
            elementShouldHaveText(cityPage.getDescriptionAfisha(), "Следите за мероприятиями в вашем городе и сразу покупайте билеты");
        });
        step("В разделе 'Афиша' отображаются карточки 'Кино', 'Концерты','Театр'", () -> {
            elementShouldHaveText(cityPage.getTheaterHeader(), "Театр");
            elementShouldHaveText(cityPage.getCinemaHeader(), "Кино");
            elementShouldHaveText(cityPage.getConcertsHeader(), "Концерты");
        });
    }

    @Test
    @DisplayName("Проверка отображения элементов на карточке 'Кино'. Переход из карточки к разделу бронирования")
    public void cinemaCardTest() {
        openCityPageGoToAfisha();
        step("Проверка заголовка на карточке 'Кино'", () -> {
            elementShouldHaveText(cityPage.getCinemaHeader(), "Кино");
        });
        step("В описании к карточке отображается текст 'Посмотреть афишу, выбрать кинотеатр и купить билеты с кэшбэком до 30%'", () -> {
            elementShouldHaveText(cityPage.getCinemaCardDescription(), "Посмотреть афишу, выбрать кинотеатр и купить билеты с кэшбэком до 30%");

        });
        step("Проверка отображения изображения на карточке 'Кино'", () -> {
            elementShouldBeVisible(cityPage.getCinemaCardPicture());
        });
        step("На карточке 'Кино' присутствует кнопка с текстом 'Подробнее'", () -> {
            elementShouldHaveText(cityPage.getCinemaCardButton(), "Подробнее");
        });
        step("Клик по кнопке с текстом 'Подробнее' на карточке 'Кино'", () -> {
            cityPage.getCinemaCardButton().click();
            step("При переходе в раздел 'Кино' на экране отображается заголовок 'Билеты в кино в приложении Тинькофф'", () -> {
                elementShouldHaveText(cinemaPage.getCinemaPageHeader(), "Билеты в кино в приложении Тинькофф");
            });
            step("При переходе в раздел 'Кино' на экране отображается подзаголовок 'Выбирайте фильм, кинотеатр, сеанс и места — оплачивайте с кэшбэком до 30%'", () -> {
                elementShouldHaveText(cinemaPage.getCinemaPageDescription(), "Выбирайте фильм, кинотеатр, сеанс и места — оплачивайте с кэшбэком до 30%");
            });
            step("В навигации сайта указано, что в данные момент находимся в разделе 'Кино'", () -> {
                elementShouldHaveText(cinemaPage.getCinemaBreadCrumbs(), "Кино");
            });
        });
    }

    @Test
    @DisplayName("Проверка отображения элементов на карточке 'Концерты'. Переход из карточки к разделу бронирования")
    public void concertCardTest() {
        openCityPageGoToAfisha();
        step("Проверка заголовка на карточке 'Концерты'", () -> {
            elementShouldHaveText(cityPage.getConcertsHeader(), "Концерты");
        });
        step("В описании к карточке отображается текст 'Купить билеты на концерт любимого исполнителя с кэшбэком до 30%'", () -> {
            elementShouldHaveText(cityPage.getConcertsCardDescription(), "Купить билеты на концерт любимого исполнителя с кэшбэком до 30%");

        });
        step("Проверка отображения изображения на карточке 'Концерты'", () -> {
            elementShouldBeVisible(cityPage.getConcertsCardPicture());
        });
        step("На карточке 'Концерты' присутствует кнопка с текстом 'Подробнее'", () -> {
            elementShouldHaveText(cityPage.getConcertsCardButton(), "Подробнее");
        });
        step("Клик по кнопке с текстом 'Подробнее' на карточке 'Концерты'", () -> {
            cityPage.getConcertsCardButton().click();
            step("При переходе в раздел 'Концерты' на экране отображается заголовок 'Билеты на концерты в приложении Тинькофф'", () -> {
                elementShouldHaveText(concertsPage.getConcertPageHeader(), "Билеты на концерты в приложении Тинькофф");
            });
            step("При переходе в раздел 'Концерты' на экране отображается подзаголовок 'Покупайте билеты на концерты и стендапы с кэшбэком до 30%'", () -> {
                elementShouldHaveText(concertsPage.getConcertPageDescription(), "Покупайте билеты на концерты и стендапы с кэшбэком до 30%");
            });
            step("В навигации сайта указано, что в данные момент находимся в разделе 'Концерты'", () -> {
                elementShouldHaveText(concertsPage.getConcertBreadCrumbs(), "Концерты");
            });
        });
    }

    @Test
    @DisplayName("Проверка отображения элементов на карточке 'Театр'. Переход из карточки к разделу бронирования")
    public void theaterCardTest() {
        openCityPageGoToAfisha();
        step("Проверка заголовка на карточке 'Театр'", () -> {
            elementShouldHaveText(cityPage.getTheaterHeader(), "Театр");
        });
        step("В описании к карточке отображается текст 'Выбрать спектакль по жанру или театру и купить билеты с кэшбэком до 30%'", () -> {
            elementShouldHaveText(cityPage.getTheaterCardDescription(), "Выбрать спектакль по жанру или театру и купить билеты с кэшбэком до 30%");
        });
        step("Проверка отображения изображения на карточке 'Театр'", () -> {
            elementShouldBeVisible(cityPage.getTheaterCardPicture());
        });
        step("На карточке 'Театр' присутствует кнопка с текстом 'Подробнее'", () -> {
            elementShouldHaveText(cityPage.getTheaterCardButton(), "Подробнее");
        });
        step("Клик по кнопке с текстом 'Подробнее' на карточке 'Театр'", () -> {
            cityPage.getTheaterCardButton().click();
            step("При переходе в раздел 'Театр' на экране отображается заголовок 'Билеты в театр в приложении Тинькофф'", () -> {
                elementShouldHaveText(theatersPage.getTheaterPageHeader(), "Билеты в театр в приложении Тинькофф");
            });
            step("При переходе в раздел 'Театр' на экране отображается подзаголовок 'Покупайте билеты на спектакли, мюзиклы и шоу с кэшбэком до 30%'", () -> {
                elementShouldHaveText(theatersPage.getTheaterPageDescription(), "Покупайте билеты на спектакли, мюзиклы и шоу с кэшбэком до 30%");
            });
            step("В навигации сайта указано, что в данные момент находимся в разделе 'Театры'", () -> {
                elementShouldHaveText(theatersPage.getTheaterBreadCrumbs(), "Театры");
            });
        });
    }
}
