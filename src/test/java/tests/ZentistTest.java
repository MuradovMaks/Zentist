package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("ZentistTests")
public class ZentistTest extends BaseTest {
    ScheduleDemo zentist = new ScheduleDemo();
    TestImonials imonials = new TestImonials();
    ContactUs contactUs = new ContactUs();
    DentalXChange xChange = new DentalXChange();
    BlueprintSmiles blueprintSmiles = new BlueprintSmiles();

    @Test
    void fillScheduleDemoForm() {
        zentist.openPage()
                .goToScheduleForm()
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
    void readTitleTextImonials() {

        imonials.openPage()
                .goToImonialsPage()
                .assertTitle();
    }

    @Test
    void fillFormContactUs() {
        contactUs.openPage()
                .goToContactUs()
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
    void checkTitleOnBlueprintSmiles() {
        blueprintSmiles.openPage()
                .checkTitle()
                .goToBlueprintSmiles()
                .checkContent();
    }

    @Test
    void checkFAQcontent() {
        xChange.openPage()
                .goToDentalXChange()
                .faq()
                .checkContentFaq();
    }
}
