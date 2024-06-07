package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;


public class ScheduleDemoPage extends BaseTest {
    private SelenideElement scheduleDemo = $("[href='#schedule-form']");
    private SelenideElement name = $("#First-Name-3");
    private SelenideElement lastname = $("#Last-Name-3");
    private SelenideElement bussinessEmail = $("#Email-3");
    private SelenideElement phoneNum = $("#Phone-3");
    private SelenideElement dentalGroup = $("#practice");
    private SelenideElement practice = $("#How-Many-Practices-4");
    private SelenideElement refferalCode = $("#referral");
    private SelenideElement submitScheduleForm = $("#schedule-submit");
    private SelenideElement checkMessage = $("#schedule-form");




    @Step("Переход к форме DemoSchedule")
    public ScheduleDemoPage goToScheduleForm() {
        scheduleDemo.click();
        return this;
    }

    @Step("Ввод Имени")
    public ScheduleDemoPage setName() {
        name.setValue("Max");
        return this;
    }

    @Step("Ввод Фамилии")
    public ScheduleDemoPage setLastName() {
        lastname.setValue("Muradov");
        return this;
    }

    @Step("Ввод Email")
    public ScheduleDemoPage setBusinessEmail() {
        bussinessEmail.setValue("ABVGD@bk.ru");
        return this;
    }

    @Step("Ввод номера телефона")
    public ScheduleDemoPage setPhoneNumber() {
        phoneNum.setValue("+79837871133");
        return this;
    }

    @Step("Ввод группы")
    public ScheduleDemoPage setDentalGroup() {
        dentalGroup.setValue("Caribe");
        return this;
    }

    @Step("Ввод стажа")
    public ScheduleDemoPage setYearsOfPractice() {
        practice.setValue("8");
        return this;
    }

    @Step("Ввод реферального кода")
    public ScheduleDemoPage setRefferalCode() {
        refferalCode.setValue("39593959195951");
        return this;
    }

    @Step("Подтверждение отправки формы")
    public ScheduleDemoPage submitForm() {
        submitScheduleForm.click();
        return this;
    }

    @Step("Проверка текста об успешной отправке формы")
    public ScheduleDemoPage assertMessage() {
        checkMessage.shouldHave(Condition.text("Thank you! Your submission has been received!"));
        return this;
    }


}
