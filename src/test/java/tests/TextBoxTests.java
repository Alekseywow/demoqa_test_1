package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "800x600";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";

    }

    @Test
    void fillFormTests() {
        open("/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("Alex@ra.ru");
        $("#currentAddress").setValue("Street 1");
        $("#permanentAddress").setValue("Street 2");
        $("#submit").click();


        $("#output #name").shouldHave(text("Alex"));
        $("#output #email").shouldHave(text("Alex@ra.ru"));
        $("#output #currentAddress").shouldHave(text("Street 1"));
        $("#output #permanentAddress").shouldHave(text("Street 2"));

    }


}
