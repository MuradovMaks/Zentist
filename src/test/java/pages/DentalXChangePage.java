package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;


public class DentalXChangePage extends BaseTest {
    private SelenideElement goesToDentalXChange = $(".footer-links [href='/partners/dentalxchange']");
    private SelenideElement faqAccordion = $("#accordion-1-header-2");
    private SelenideElement checkContent = $("#accordion-1-content-2 div ");




    @Step("Переход на страницу DentalXChange")
    public DentalXChangePage goToDentalXChange() {
        goesToDentalXChange.shouldHave(Condition.text("DentalXChange")).click();
        return this;
    }

    @Step("Раскрытие аккордеона FAQ")
    public DentalXChangePage faq() {
        faqAccordion.click();
        return this;
    }

    @Step("Провека соотвествия текста в выбранном разделе")
    public DentalXChangePage checkContentFaq() {
        checkContent.shouldHave(Condition.text("New users of Remit AI are provided with comprehensive onboarding resources. These include training videos. Users can also reach out to their dedicated account manager for any questions and concerns.\n" +
                "\n"));
        return this;
    }
}
