package toolsQa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebElementCondition;
import com.codeborne.selenide.conditions.Visible;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.testBase;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class toolsQa extends testBase {

    String fname = "Misha";
    String lname = "Piskareva";
    String email = "Piskareva@mail.sru";
    int number = 1233123412;
    String subjects = "English";
    String cadress = "Pomoika GA, dom 1";

    @Test
    void toolsQa (){
        registrationPage.openPage()
                .setFirstName(fname)
                .setLastName(lname)
                .setEmail(email)
                .setGender()
                .setNumber(number)
                .setSubjects(subjects)
                .setHobbies()
                .setImage()
                .setCurrentAdress(cadress)
                .setBD("November" ,"17" ,"1994");

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

        sleep(9000);



    }
}
