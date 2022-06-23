package page_objects;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestsBase {

    @BeforeAll
    public static void openBrowser() {
        Configuration.baseUrl = ("https://demoqa.com");
        Configuration.browserSize = "1280x1080";
    }
}
