package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ScheduleDemo {
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


    @Step("Открыть страницу")
    public ScheduleDemo openPage() {
        open("https://www.zentist.io/");
        return this;
    }

    @Step("Переход к форме DemoSchedule")
    public ScheduleDemo goToScheduleForm() {
        scheduleDemo.click();
        return this;
    }

    @Step("Ввод Имени")
    public ScheduleDemo setName() {
        name.setValue("Max");
        return this;
    }

    @Step("Ввод Фамилии")
    public ScheduleDemo setLastName() {
        lastname.setValue("Muradov");
        return this;
    }

    @Step("Ввод Email")
    public ScheduleDemo setBusinessEmail() {
        bussinessEmail.setValue("ABVGD@bk.ru");
        return this;
    }

    @Step("Ввод номера телефона")
    public ScheduleDemo setPhoneNumber() {
        phoneNum.setValue("+79837871133");
        return this;
    }

    @Step("Ввод группы")
    public ScheduleDemo setDentalGroup() {
        dentalGroup.setValue("Caribe");
        return this;
    }

    @Step("Ввод стажа")
    public ScheduleDemo setYearsOfPractice() {
        practice.setValue("8");
        return this;
    }

    @Step("Ввод реферального кода")
    public ScheduleDemo setRefferalCode() {
        refferalCode.setValue("39593959195951");
        return this;
    }

    @Step("Подтверждение отправки формы")
    public ScheduleDemo submitForm() {
        submitScheduleForm.click();
        return this;
    }

    @Step("Проверка текста об успешной отправке формы")
    public ScheduleDemo assertMessage() {
        checkMessage.shouldHave(Condition.text("Thank you! Your submission has been received!"));
        return this;
    }


}
