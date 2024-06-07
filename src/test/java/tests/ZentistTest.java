package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("ZentistTests")
public class ZentistTest extends BaseTest {
    ScheduleDemoPage zentist = new ScheduleDemoPage();
    TestImonialsPage imonials = new TestImonialsPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    DentalXChangePage xChange = new DentalXChangePage();
    BlueprintSmilesPage blueprintSmilesPage = new BlueprintSmilesPage();

    @Test
    void fillScheduleDemoFormTest() {
        zentist.openPage();
        zentist
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
    void readTitleTextImonialsTest() {

        imonials.openPage();
        imonials
                .goToImonialsPage()
                .assertTitle();
    }

    @Test
    void fillFormContactUsTest() {
        contactUsPage
                .openPage();
        contactUsPage
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
    void checkTitleOnBlueprintSmilesTest() {
        blueprintSmilesPage.openPage()
                .checkTitle()
                .goToBlueprintSmiles()
                .checkContent();
    }

    @Test
    void checkFAQcontentTest() {
        xChange.openPage();
        xChange
                .goToDentalXChange()
                .faq()
                .checkContentFaq();
    }
}
