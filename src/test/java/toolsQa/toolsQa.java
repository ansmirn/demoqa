package toolsQa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebElementCondition;
import com.codeborne.selenide.conditions.Visible;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class toolsQa {
    @BeforeAll
    static void beforeAll (){
        Configuration.baseUrl = "https://demoqa.com";

    }
    String fname = "Misha";
    String lname = "Piskareva";
    String email = "Piskareva@mail.sru";
    int number = 1233123412;
    String subjects = "English";
    String cadress = "Pomoika GA, dom 1";
    @Test
    void toolsQa (){
        open("/automation-practice-form");
        $("#firstName").setValue(fname);
        $("#lastName").setValue(lname);
        $("#userEmail").setValue(email);
        $("#gender-radio-1").click();
        $("#userNumber").setValue(String.valueOf(number));
        $("#subjectsInput").click();
        $("#subjectsInput").setValue(subjects);
        $("#subjectsInput").pressEnter();
        $("#hobbies-checkbox-3").click();
        $("#uploadPicture").uploadFile(new File("/Users/andrejsmirnov/Downloads/89vPCBqmTjdADHb7gE5QXT7vyaHEf28DYS4zmRQ8AxMf79836rzMjcHEgzJh2TlkmgRaA5ish-0EHYlfddeQZJlW.jpg"));
        $("#currentAddress").setValue(cadress);
        $("#state").scrollIntoView("{behavior: 'instant', block: 'center'}").click();
        $("#react-select-3-option-3").click();
        $("#city").click();
        $("#react-select-4-option-1").click();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(visible);
        $(".modal-body").shouldHave(allOf(
                text(fname),
                text(lname),
                text(email),
                text(String.valueOf(number)),
                text(subjects),
                text("89vPCBqmTjdADHb7gE5QXT7vyaHEf28DYS4zmRQ8AxMf79836rzMjcHEgzJh2TlkmgRaA5ish-0EHYlfddeQZJlW.jpg"),
                text(cadress),
                text("Rajasthan Jaiselmer")));



    }
}
