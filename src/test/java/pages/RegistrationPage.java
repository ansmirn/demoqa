package pages;
import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationPage {
    public RegistrationPage openPage() {
    open("/automation-practice-form");
        return this;

    }

    public RegistrationPage setFirstName(String value){
        $("#firstName").setValue(value);
    return this;
    }

    public RegistrationPage setLastName(String value){
        $("#lastName").setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value){
        $("#userEmail").setValue(value);
        return this;
    }
    public RegistrationPage setGender (){
        $("#gender-radio-1").click();
        return this;
    }
    public RegistrationPage setNumber(int value){
        $("#userNumber").setValue(String.valueOf(value));
        return  this;
    }
    public RegistrationPage setSubjects(String value){
        $("#subjectsInput").click();
        $("#subjectsInput").setValue(value);
        $("#subjectsInput").pressEnter();
        return  this;
    }
    public RegistrationPage setHobbies(){
        $("#hobbies-checkbox-3").click();
        return this;
    }
    public RegistrationPage setImage(){
        $("#uploadPicture").uploadFile(new File("/Users/andrejsmirnov/Downloads/89vPCBqmTjdADHb7gE5QXT7vyaHEf28DYS4zmRQ8AxMf79836rzMjcHEgzJh2TlkmgRaA5ish-0EHYlfddeQZJlW.jpg"));
        return this;
    }
    public RegistrationPage setCurrentAdress(String value) {

        $("#currentAddress").setValue(value);
        return this;
    }

    public RegistrationPage setBD (String month, String day, String year ){
        $("#dateOfBirthInput").click();
        calendarComponents.setDate(month,  day,  year );
        return this;
    }
}
