package toolsQa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebElementCondition;
import com.codeborne.selenide.conditions.Visible;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.allOf;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class toolsQa {
    @BeforeAll
    static void beforeAll (){
        Configuration.baseUrl = "https://demoqa.com";

    }
    String name = "Piskareva";
    String email = "Piskareva@mail.sru";
    String cadress = "Pomoika GA";
    String padress = "Pomoika GA, dom 1";
    @Test
    void toolsQa (){
        open("/text-box");
        $("#userName").setValue(name);
        $("#userEmail").setValue(email);
        $("#currentAddress").setValue(cadress);
        $("#permanentAddress").setValue(padress);
        $("#submit").click();
        $("#output").shouldHave(allOf(
                text(name),
                text(email),
                text(cadress),
                text(padress)
        ));
        sleep(5000);


    }
}
