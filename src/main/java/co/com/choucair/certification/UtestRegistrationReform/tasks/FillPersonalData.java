package co.com.choucair.certification.UtestRegistrationReform.tasks;


import co.com.choucair.certification.UtestRegistrationReform.model.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.UtestRegistrationReform.userinterface.PersonalDataPage.*;

public class FillPersonalData implements Task {
    UserData userData;

    public FillPersonalData(UserData userData) {
        this.userData = userData;
    }

    public static FillPersonalData thePage(UserData userData) { return Tasks.instrumented(FillPersonalData.class,userData); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JOIN_BUTTON),
                Enter.theValue(userData.getFirstNameUser()).into(FIRST_NAME_TEXTBOX),
                Enter.theValue(userData.getLastNameUser()).into(LAST_NAME_TEXTBOX),
                Enter.theValue(userData.getEmailUser()).into(EMAIL_TEXTBOX),
                SelectFromOptions.byVisibleText(userData.getBirthMonthUser()).from(BIRTH_MONTH_SELECT),
                SelectFromOptions.byVisibleText(userData.getBirthDayUser()).from(BIRTH_DAY_SELECT),
                SelectFromOptions.byVisibleText(userData.getBirthYearUser()).from(BIRTH_YEAR_SELECT),
                Enter.theValue(userData.getLanguageUser()).into(LANGUAGE_SEARCH),
                Hit.the(Keys.ENTER).into(LANGUAGE_SEARCH),
                Click.on(NEXT_LOCATION_BUTTON));
    }
}
