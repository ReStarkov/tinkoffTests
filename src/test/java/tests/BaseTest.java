package tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import com.codeborne.selenide.logevents.SelenideLogger;

import pages.*;

public class BaseTest {
    static CityPage cityPage = new CityPage();
    static CinemaPage cinemaPage = new CinemaPage();
    static ConcertsPage concertsPage = new ConcertsPage();
    static TheatersPage theatersPage = new TheatersPage();

    @BeforeEach
    void setLogger() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.setConfig();;
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }

    public void elementShouldBeVisible(SelenideElement element) {
        element.shouldBe(Condition.visible);
    }

    public void elementShouldHaveText(SelenideElement element, String expectText) {
        element.shouldBe(Condition.have(Condition.text(expectText)));

    }
}
