package page_object;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DemoQaPracticeForm {
    private static final String FIRST_NAME = "#firstName";
    private static final String LAST_NAME = "#lastName";
    private static final String USER_EMAIL = "#userEmail";
    private static final String MOBILE_NUMBER = "#userNumber";
    private static final String GENDER_MALE = ".custom-control.custom-radio label[for='gender-radio-1']";
    private static final String GENDER_MALE_SELECTED_OR_NOT = ".custom-control.custom-radio #gender-radio-1";
    private static final String GENDER_FEMALE = ".custom-control.custom-radio label[for='gender-radio-2']";
    private static final String GENDER_FEMALE_SELECTED_OR_NOT = ".custom-control.custom-radio #gender-radio-2";
    private static final String GENDER_OTHER = ".custom-control.custom-radio label[for='gender-radio-3']";
    private static final String GENDER_OTHER_SELECTED_OR_NOT = ".custom-control.custom-radio #gender-radio-3";
    private static final String HOBBIES_SPORTS = ".custom-control.custom-checkbox label[for='hobbies-checkbox-1']";
    private static final String HOBBIES_READING = ".custom-control.custom-checkbox label[for='hobbies-checkbox-2']";
    private static final String HOBBIES_MUSIC = ".custom-control.custom-checkbox label[for='hobbies-checkbox-3']";
    private static final String SUBJECTS = "#subjectsContainer";
    private static final String CURRENT_ADDRESS = "#currentAddress";


    private static final String SUBMIT_BUTTON = "#submit";

    public void inputFirstName(String firstName) {
        $(FIRST_NAME).shouldBe(visible).setValue(firstName);
    }

    public void inputLastName(String lastName) {
        $(LAST_NAME).shouldBe(visible).setValue(lastName);
    }

    public void inputUserEmail(String userEmail) {
        $(USER_EMAIL).shouldBe(visible).setValue(userEmail);
    }

    public void inputMobileNumber(String mobileNumber) {
        $(MOBILE_NUMBER).shouldBe(visible).setValue(mobileNumber);
    }

    public void selectMaleGender() {
        if (!$(GENDER_MALE_SELECTED_OR_NOT).isSelected()) {
            $(GENDER_MALE).click();
        }
    }

    public void selectFemaleGender() {
        if (!$(GENDER_FEMALE_SELECTED_OR_NOT).isSelected()) {
            $(GENDER_FEMALE).click();
        }
    }

    public void selectOtherGender() {
        if (!$(GENDER_OTHER_SELECTED_OR_NOT).isSelected()) {
            $(GENDER_OTHER).click();
        }
    }

    public void inputCurrentAddress(String currentAddress) {
        $(CURRENT_ADDRESS).setValue(currentAddress);
    }

    public void inputSubjects(String subjects) {
        $(SUBJECTS).shouldBe(visible).setValue(subjects);
    }

    public void selectSportsHobbies() {
        $(HOBBIES_SPORTS).click();

    }

    public void selectReadingHobbies() {
        $(HOBBIES_READING).click();

    }

    public void selectMusicHobbies() {
        $(HOBBIES_MUSIC).click();

    }


    public void clickSubmit() {
        $(SUBMIT_BUTTON).click();
    }


}
