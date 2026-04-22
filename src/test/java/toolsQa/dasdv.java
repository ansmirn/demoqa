import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class dasdv {
    @Test
    void openTextBoxPage() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";

        open("/text-box");
        $("#userName").shouldBe(visible);
    }
}