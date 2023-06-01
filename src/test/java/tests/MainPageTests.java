package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

@Owner("Alena Shomanova")
@Story("The main page's content")
@Tag("MainPageTests")
public class MainPageTests extends TestBase {

    @DisplayName("The main page logo visibility")
    @Test
    void logoExistsTest() {
        mainPage.checkLogoVisible();
    }

    @DisplayName("The correct amount of news headings is shown on the main page")
    @Test
    void ourServicesAmountTest() {
        mainPage.verifyOurServicesAmount();
    }

    @DisplayName("The correct amount of social media links in the footer")
    @Test
    void socialNetworkAmountTest() {
        mainPage.verifySocialNetworkAmount();
    }

    @DisplayName("FAILED TEST - index page title is  FAKETEXT")
    @Test
    void mainPageCorrectTextNegativeTest() {
        mainPage.mainPageTitleCheck();
    }
}
