package pages;
import static com.codeborne.selenide.Selenide.*;

public class calendarComponents {
    public  static void setDate(String month, String day, String year){
        $(".react-datepicker__month-select").selectOption("November");
        $(".react-datepicker__year-select").selectOption("1994");
        $(".react-datepicker__day--0" + day).click();
    }
}
