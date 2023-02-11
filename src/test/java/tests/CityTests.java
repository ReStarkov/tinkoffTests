package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;


public class CityTests extends BaseTest {

    @Test
    @DisplayName("Переход с главной страницы в раздел 'Город' при помощи кнопки в хедере. Проверка наличия элементов на странице")
    public void GoToCitySection(){
        step("Открытие главное страницы Тинькофф Банка", () -> {
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
}
