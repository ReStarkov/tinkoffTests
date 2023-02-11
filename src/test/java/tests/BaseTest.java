package tests;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import pages.CityPage;
import pages.MainPage;

public class BaseTest {
    MainPage mainPage = new MainPage();
    CityPage cityPage = new CityPage();

    @BeforeEach
    void setLogger() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.tinkoff.ru";
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "100.0");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
    }
}
