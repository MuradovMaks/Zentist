package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class BlueprintSmiles {
    SelenideElement checkTitleCS = $(".div-block-958");
    SelenideElement goToBlueprint = $("#w-node-_31138404-152d-852c-b023-11fe6be5960d-a9820cae [href='/case-study/blueprint-smiles-case-study']");
    ElementsCollection checkText = $$("h2");


    @Step("Открыть страницу CaseStudents")
    public BlueprintSmiles openPage() {
        open("case-studies/all");
        return this;
    }

    @Step("Проверка соответствия заголовка данному разделу")
    public BlueprintSmiles checkTitle() {
        checkTitleCS.shouldHave(Condition.text("Achieving a 99.6% Revenue Collection Rate with Remit AI"));
        return this;
    }

    @Step("Переход к разделу BlueprintSmiles и его открытие ")
    public BlueprintSmiles goToBlueprintSmiles() {
        goToBlueprint.click();
        return this;
    }

    @Step("Проверка контента находящегося на странице")
    public BlueprintSmiles checkContent() {
        checkText.shouldHave(CollectionCondition.containExactTextsCaseSensitive("Continued Evolution: Setting New Benchmarks"));
        return this;
    }
}
