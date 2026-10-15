package selenide;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideOnGitHub {

    @Test
    void SearchSelenide (){
        open("https://github.com");
        $("[aria-label = 'Search or jump to, type / to search']").click();
        $("[aria-label='Search or jump to']").setValue("Selenide").pressEnter();
        $("[href = '/selenide/selenide']").click();
        $("[href='/selenide/selenide/wiki']").click();
        $("[href='/selenide/selenide/wiki/SoftAssertions']").click();
        $("body").shouldHave(text("Using JUnit5 extend test class:"));
        sleep(5000);
    }

}
