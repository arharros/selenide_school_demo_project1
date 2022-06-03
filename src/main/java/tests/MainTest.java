package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page_object.DemoQaPracticeForm;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainTest {
    private static final String GENDER = "#gender-radio-1";

    @BeforeAll
    public static void openBrowser() {
        Configuration.baseUrl = ("https://demoqa.com");
        Configuration.browserSize = "1280x1080";
        open("/automation-practice-form");

    }

    @AfterAll //todo tulumbaev delete this method
    public static void waiting() {
        sleep(3000);
    }

    @Test
    public void successPracticeForm() {
        DemoQaPracticeForm practiceForm = new DemoQaPracticeForm();
        practiceForm.inputFirstName("Ivan");
        practiceForm.inputLastName("Ivanov");
        practiceForm.inputUserEmail("ivanov@company.com");
        practiceForm.selectMaleGender();
        practiceForm.inputMobileNumber("1234567891");
//        practiceForm.inputSubjects("Maths");

        $("#subjectsContainer").shouldBe(visible).click();

//        practiceForm.clickSubmit();
    }
}
