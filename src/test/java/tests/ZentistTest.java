package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.*;
@Tag("ZentistTests")
public class ZentistTest extends BaseTest
{
    ScheduleDemo zentist  = new ScheduleDemo();
    TestImonials imonials = new TestImonials();
    ContactUs contactUs = new ContactUs();
    DentalXChange xChange = new DentalXChange();
    BlueprintSmiles blueprintSmiles = new BlueprintSmiles();

    @Test
    void fillScheduleDemoForm()
    {
        zentist.goToScheduleForm()
                .setName()
                .setLastName()
                .setBusinessEmail()
                .setPhoneNumber()
                .setDentalGroup()
                .setYearsOfPractice()
                .setRefferalCode()
                .submitForm()
                .assertMessage();
    }
    @Test
    void readTitleTextImonials()
    {
        imonials.goToImonialsPage();
        imonials.assertTitle();
    }
    @Test
    void fillFormContactUs()
    {
        contactUs.goToContactUs()
                .setName()
                .setLastName()
                .setBusinessEmail()
                .setPhoneNumber()
                .setDentalGroup()
                .setYearsOfPractice()
                .setRefferalCode()
                .askQuestionForm()
                .submitForm()
                .assertMessage();
    }
    @Test
    void checkTitleOnBlueprintSmiles()
    {
        blueprintSmiles.openPage()
                .checkTitle()
                .goToBlueprintSmiles()
                .checkContent();
    }
    @Test
    void checkFAQcontent()
    {
        xChange.goToDentalXChange()
                .faq()
                .checkContentFaq();
    }
}
