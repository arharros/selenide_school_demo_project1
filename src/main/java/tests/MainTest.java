package tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page_objects.DemoQaPracticeForm;
import page_objects.TestsBase;

import static com.codeborne.selenide.Selenide.*;

public class MainTest extends TestsBase {



/*
    @AfterAll //todo tulumbaev delete this method
    public static void waiting() {
        sleep(3000);
    }
*/

    @Test
    public void successPracticeForm() {
        open("/automation-practice-form");
        DemoQaPracticeForm practiceForm = new DemoQaPracticeForm();
        practiceForm.inputFirstName("Ivan");
        practiceForm.inputLastName("Ivanov");
        practiceForm.inputUserEmail("ivanov@company.com");
        practiceForm.inputMobileNumber("1234567891");
        practiceForm.selectMaleGender();
        practiceForm.selectSportsHobbies();
        practiceForm.selectReadingHobbies();
        practiceForm.selectMusicHobbies();
        practiceForm.inputCurrentAddress("Kurchatova 10-25");
        practiceForm.uploadFile();
        practiceForm.selectState("Rajasthan");
        practiceForm.selectCity("Jaiselmer");
        practiceForm.inputDateOfBirth("28", "July", "2022");
        practiceForm.clickSubmit();
    }


}
