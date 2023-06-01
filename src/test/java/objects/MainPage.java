package objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement logo = $(".indexpage-main__logo img"),
            mainTitle = $(".indexpage-main__title");
    private final ElementsCollection socialNetworks = $$(".social.for-desktop a[target='_blank']"),
            newsBlocks = $$(".news__date");

    @Step("Open the main page")
    @Deprecated
    public MainPage openMainPage() {
        open("https://aix.kz/");
        return this;
    }

    @Step("Check if the logo on the top left corner is visible")
    public void checkLogoVisible() {
        logo.shouldBe(Condition.visible);
    }

    @Step("Check if there are 3 official social network icons")
    public void verifySocialNetworkAmount() {
        socialNetworks.shouldHave(size(3));
    }

    @Step("Check if there are 3 news links visible")
    public void verifyOurServicesAmount() {
        newsBlocks.shouldHave(size(3));
    }

    @Step("FAILED TEST - index page title is  FAKETEXT")
    public void mainPageTitleCheck() {
        mainTitle.shouldHave(Condition.text("FAKETEXT"));
    }
}
