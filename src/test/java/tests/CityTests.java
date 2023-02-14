package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CityPage;

import static io.qameta.allure.Allure.step;


public class CityTests extends BaseTest {


    public void openCityPageGoToAfisha(){
        step("Открытие страницы 'Тинькофф город'", () ->{
            cityPage.openCityPage();
        });
        step("Нажатие на кнопку 'Узнать больше'", () ->{
            cityPage.clickMoreButton();
        });
    }

    @Test
    @DisplayName("Переход с главной страницы в раздел 'Город' при помощи кнопки в хедере. Проверка наличия элементов на странице")
    public void goToCitySectionTest(){
        step("Открытие главной страницы Тинькофф Банка", () -> {
            mainPage.openMainPage();
        });
        step("Клик по кнопке 'Город' в меню хедера страницы", () ->{
            mainPage.clickCityButton();
        });
        step("На странице отображается заголовок 'Тинькофф Город'", () ->{
            cityPage.headerShouldHaveText("Тинькофф Город");
        });
        step("На странице отображается подзаголовок \"Покупайте билеты на мероприятия, бронируйте рестораны и оплачивайте повседневные сервисы —\n" +
                "прямо в приложении Тинькофф'", () ->{
            cityPage.descriptionShouldHaveText("Покупайте билеты на мероприятия, бронируйте рестораны и оплачивайте повседневные сервисы —\n" +
                    "прямо в приложении Тинькофф");
        });
        step("На странице отображается кнопка 'Узнать больше'", () ->{
            cityPage.buttonMoreShouldBeVisible();
            cityPage.buttonMoreShouldHaveText("Узнать больше");
        });
    }

    @Test
    @DisplayName("В разделе 'Тинькофф Город' отображается блок 'Афиша' содержащий три карточки: 'Концерты', 'Кино', 'Театр'")
    public void afishaSectionTest(){
        openCityPageGoToAfisha();
        step("На экране отображается заголовок 'Афиша'", () ->{
            cityPage.afishaHeaderShouldHaveText("Афиша");
        });
        step("На экране отображается подзаголовок 'Следите за мероприятиями в вашем городе и сразу покупайте билеты'", () ->{
            cityPage.afishaDescriptionShouldHaveText("Следите за мероприятиями в вашем городе и сразу покупайте билеты");
        });
        step("В разделе 'Афиша' отображаются карточки 'Кино', 'Концерты','Театр'", () ->{
            cityPage.cardHaveHeader(cityPage.getTheaterCard() , "Театр");
            cityPage.cardHaveHeader(cityPage.getCinemaCard(), "Кино");
            cityPage.cardHaveHeader(cityPage.getConcertsCard() , "Концерты");
        });
    }

    @Test
    @DisplayName("Проверка отображения элементов на карточке 'Кино'. Переход из карточки к разделу бронирования")
    public void сinemaCardTest(){
        openCityPageGoToAfisha();
        step("Проверка заголовка на карточке 'Кино'", () ->{
            cityPage.cardHaveHeader(cityPage.getCinemaCard(), "Кино");
        });
        step("В описании к карточке отображается текст 'Посмотреть афишу, выбрать кинотеатр и купить билеты с кэшбэком до 30%'", () ->{
            cityPage.cardHaveDescription(cityPage.getCinemaCardDescription(), "Посмотреть афишу, выбрать кинотеатр и купить билеты с кэшбэком до 30%");
        });
        step("Проверка отображения изображения на карточке 'Кино'", () ->{
            cityPage.cardPictureShouldBeVisable(cityPage.getCinemaCardPicture());
        });
        step("На карточке 'Кино' присутствует кнопка с текстом 'Подробнее'", () ->{
            cityPage.cardButtonHaveHeader(cityPage.getCinemaCardButton(),"Подробнее");
        });
        step("Клик по кнопке с текстом 'Подробнее' на карточке 'Кино'", () ->{
            cityPage.сardButtonClick(cityPage.getCinemaCardButton());
            step("При переходе в раздел 'Кино' на экране отображается заголовок 'Билеты в кино в приложении Тинькофф'", () ->{
                cinemaPage.checkPageHeader("Билеты в кино в приложении Тинькофф");
            });
            step("При переходе в раздел 'Кино' на экране отображается подзаголовок 'Выбирайте фильм, кинотеатр, сеанс и места — оплачивайте с кэшбэком до 30%'", () ->{
                cinemaPage.checkPageDescription("Выбирайте фильм, кинотеатр, сеанс и места — оплачивайте с кэшбэком до 30%");
            });
            step("В навигации сайта указано, что в данные момент находимся в разделе 'Кино'", () ->{
                cinemaPage.checkBreadCrumbs("Кино");
            });
        });
    }

    @Test
    @DisplayName("Проверка отображения элементов на карточке 'Концерты'. Переход из карточки к разделу бронирования")
    public void concertCardTest(){
        openCityPageGoToAfisha();
        step("Проверка заголовка на карточке 'Концерты'", () ->{
            cityPage.cardHaveHeader(cityPage.getConcertsCard() , "Концерты");
        });
        step("В описании к карточке отображается текст 'Купить билеты на концерт любимого исполнителя с кэшбэком до 30%'", () ->{
            cityPage.cardHaveDescription(cityPage.getConcertsCardDescription(), "Купить билеты на концерт любимого исполнителя с кэшбэком до 30%");
        });
        step("Проверка отображения изображения на карточке 'Концерты'", () ->{
            cityPage.cardPictureShouldBeVisable(cityPage.getConcertsCardPicture());
        });
        step("На карточке 'Концерты' присутствует кнопка с текстом 'Подробнее'", () ->{
            cityPage.cardButtonHaveHeader(cityPage.getConcertsCardButton(),"Подробнее");
        });
        step("Клик по кнопке с текстом 'Подробнее' на карточке 'Концерты'", () ->{
            cityPage.сardButtonClick(cityPage.getConcertsCardButton());
            step("При переходе в раздел 'Концерты' на экране отображается заголовок 'Билеты на концерты в приложении Тинькофф'", () ->{
                concertsPage.checkPageHeader("Билеты на концерты в приложении Тинькофф");
            });
            step("При переходе в раздел 'Концерты' на экране отображается подзаголовок 'Покупайте билеты на концерты и стендапы с кэшбэком до 30%'", () ->{
                concertsPage.checkPageDescription("Покупайте билеты на концерты и стендапы с кэшбэком до 30%");
            });
            step("В навигации сайта указано, что в данные момент находимся в разделе 'Концерты'", () ->{
                concertsPage.checkBreadCrumbs("Концерты");
            });
        });
    }

    @Test
    @DisplayName("Проверка отображения элементов на карточке 'Театр'. Переход из карточки к разделу бронирования")
    public void theaterCardTest(){
        openCityPageGoToAfisha();
        step("Проверка заголовка на карточке 'Театр'", () ->{
            cityPage.cardHaveHeader(cityPage.getTheaterCard() , "Театр");
        });
        step("В описании к карточке отображается текст 'Выбрать спектакль по жанру или театру и купить билеты с кэшбэком до 30%'", () ->{
            cityPage.cardHaveDescription(cityPage.getTheaterCardDescription(), "Выбрать спектакль по жанру или театру и купить билеты с кэшбэком до 30%");
        });
        step("Проверка отображения изображения на карточке 'Театр'", () ->{
            cityPage.cardPictureShouldBeVisable(cityPage.getTheaterCardPicture());
        });
        step("На карточке 'Театр' присутствует кнопка с текстом 'Подробнее'", () ->{
            cityPage.cardButtonHaveHeader(cityPage.getTheaterCardButton(),"Подробнее");
        });
        step("Клик по кнопке с текстом 'Подробнее' на карточке 'Театр'", () ->{
            cityPage.сardButtonClick(cityPage.getTheaterCardButton());
            step("При переходе в раздел 'Театр' на экране отображается заголовок 'Билеты в театр в приложении Тинькофф'", () ->{
                theatersPage.checkPageHeader("Билеты в театр в приложении Тинькофф");
            });
            step("При переходе в раздел 'Театр' на экране отображается подзаголовок 'Покупайте билеты на спектакли, мюзиклы и шоу с кэшбэком до 30%'", () ->{
                theatersPage.checkPageDescription("Покупайте билеты на спектакли, мюзиклы и шоу с кэшбэком до 30%");
            });
            step("В навигации сайта указано, что в данные момент находимся в разделе 'Театры'", () ->{
                theatersPage.checkBreadCrumbs("Театры");
            });
        });
    }



}
