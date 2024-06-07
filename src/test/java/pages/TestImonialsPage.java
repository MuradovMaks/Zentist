package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;


public class TestImonialsPage extends BaseTest {
    private SelenideElement openImonialsPage = $(".navigation_links [href='/testimonials']");
    private SelenideElement checkingTitle = $(".container-large h1");



    @Step("Переход на страницу TestImonials")
    public TestImonialsPage goToImonialsPage() {
        openImonialsPage.click();
        return this;
    }

    @Step("Убедидтся что текст заголовка соотвествует нужному")
    public TestImonialsPage assertTitle() {
        checkingTitle.shouldHave(Condition.text("See what the community is saying about Zentist."));
        return this;
    }

}
