package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestImonials {
    private SelenideElement openImonialsPage = $(".navigation_links [href='/testimonials']");
    private SelenideElement checkingTitle = $(".container-large h1");

    @Step("Открыть страницу")
    public TestImonials openPage() {
        open("https://www.zentist.io/");
        return this;
    }

    @Step("Переход на страницу TestImonials")
    public TestImonials goToImonialsPage() {
        openImonialsPage.click();
        return this;
    }

    @Step("Убедидтся что текст заголовка соотвествует нужному")
    public TestImonials assertTitle() {
        checkingTitle.shouldHave(Condition.text("See what the community is saying about Zentist."));
        return this;
    }

}
