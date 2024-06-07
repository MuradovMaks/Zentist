package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;


public class ContactUsPage extends BaseTest {
    private SelenideElement openContactPage = $(".navigation_links [href='/contacts']");
    private SelenideElement name = $("#First-Name-3");
    private SelenideElement lastname = $("#Last-Name-3");
    private SelenideElement bussinessEmail = $("#Email-3");
    private SelenideElement phoneNum = $("#Phone-3");
    private SelenideElement dentalGroup = $("#practice");
    private SelenideElement practice = $("#How-Many-Practices-4");
    private SelenideElement refferalCode = $("#referral");
    private SelenideElement submitScheduleForm = $("#schedule-submit");
    private SelenideElement checkMessage = $("#schedule-form");
    private SelenideElement askQuestion = $("#Question");



    @Step("Переход к форме ContactUs")
    public ContactUsPage goToContactUs() {
        openContactPage.click();
        return this;
    }

    @Step("Ввод Имени")
    public ContactUsPage setName() {
        name.setValue("Max");
        return this;
    }

    @Step("Ввод Фамилии")
    public ContactUsPage setLastName() {
        lastname.setValue("Muradov");
        return this;
    }

    @Step("Ввод Email")
    public ContactUsPage setBusinessEmail() {
        bussinessEmail.setValue("ABVGD@bk.ru");
        return this;
    }

    @Step("Ввод номера телефона")
    public ContactUsPage setPhoneNumber() {
        phoneNum.setValue("+79837871133");
        return this;
    }

    @Step("Ввод группы")
    public ContactUsPage setDentalGroup() {
        dentalGroup.setValue("Caribe");
        return this;
    }

    @Step("Ввод стажа")
    public ContactUsPage setYearsOfPractice() {
        practice.setValue("8");
        return this;
    }

    @Step("Ввод реферального кода")
    public ContactUsPage setRefferalCode() {
        refferalCode.setValue("39593959195951");
        return this;
    }

    @Step("Подтверждение отправки формы")
    public ContactUsPage submitForm() {
        submitScheduleForm.click();
        return this;
    }

    @Step("Проверка текста об успешной отправке формы")
    public ContactUsPage assertMessage() {
        checkMessage.shouldHave(Condition.text("Thank you! Your submission has been received!"));
        return this;
    }

    @Step("Ввод вопроса пользователя для формы")
    public ContactUsPage askQuestionForm() {
        askQuestion.setValue("Hello everyone,I'm Qa Engineer");
        return this;
    }
}
