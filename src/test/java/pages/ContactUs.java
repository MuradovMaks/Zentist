package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContactUs
{
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

    public ContactUs()
    {
        open();
    }
    @Step("Переход к форме ContactUs")
    public ContactUs goToContactUs()
    {
        openContactPage.click();
        return this;
    }
    @Step("Ввод Имени")
    public ContactUs setName()
    {
        name.setValue("Max");
        return this;
    }
    @Step("Ввод Фамилии")
    public ContactUs setLastName()
    {
        lastname.setValue("Muradov");
        return this;
    }
    @Step("Ввод Email")
    public ContactUs setBusinessEmail()
    {
        bussinessEmail.setValue("ABVGD@bk.ru");
        return this;
    }
    @Step("Ввод номера телефона")
    public ContactUs setPhoneNumber()
    {
        phoneNum.setValue("+79837871133");
        return this;
    }
    @Step("Ввод группы")
    public ContactUs setDentalGroup()
    {
        dentalGroup.setValue("Caribe");
        return this;
    }
    @Step("Ввод стажа")
    public ContactUs setYearsOfPractice()
    {
        practice.setValue("8");
        return this;
    }
    @Step("Ввод реферального кода")
    public ContactUs setRefferalCode()
    {
        refferalCode.setValue("39593959195951");
        return this;
    }
    @Step("Подтверждение отправки формы")
    public ContactUs submitForm()
    {
        submitScheduleForm.click();
        return this;
    }
    @Step("Проверка текста об успешной отправке формы")
    public ContactUs assertMessage()
    {
        checkMessage.shouldHave(Condition.text("Thank you! Your submission has been received!"));
        return this;
    }
    @Step("Ввод вопроса пользователя для формы")
    public ContactUs askQuestionForm()
    {
        askQuestion.setValue("Hello everyone,I'm Qa Engineer");
        return this;
    }
}
