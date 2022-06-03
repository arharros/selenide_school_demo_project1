package page_object;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DemoQaPracticeForm {
    private static final String FIRST_NAME = "#firstName";
    private static final String LAST_NAME = "#lastName";
    private static final String USER_EMAIL = "#userEmail";
    private static final String MOBILE_NUMBER = "#userNumber";
    private static final String GENDER_MALE = ".custom-control-inline #gender-radio-1";
    private static final String SUBJECTS = "#subjectsContainer";


    private static final String SUBMIT_BUTTON = "#submit";

    public void inputFirstName(String firstName) {
       $(FIRST_NAME).shouldBe(Condition.visible).setValue(firstName);
    }

    public void inputLastName(String lastName) {
        $(LAST_NAME).shouldBe(Condition.visible).setValue(lastName);
    }

    public void inputUserEmail(String userEmail) {
        $(USER_EMAIL).shouldBe(Condition.visible).setValue(userEmail);
    }

    public void inputMobileNumber(String mobileNumber) {
        $(MOBILE_NUMBER).shouldBe(Condition.visible).setValue(mobileNumber);
    }

    public void selectMaleGender() {
        $(GENDER_MALE).parent().shouldHave(text("male")).click();
    }

    public void clickSubmit() {
        $(SUBMIT_BUTTON).shouldBe(visible).click();
    }

    public void inputSubjects(String subjects) {
        $(SUBJECTS).shouldBe(visible).setValue(subjects);
    }

}
