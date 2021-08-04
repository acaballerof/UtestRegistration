package co.com.choucair.certification.UtestRegistrationReform.tasks;

import co.com.choucair.certification.UtestRegistrationReform.model.UserData;
import co.com.choucair.certification.UtestRegistrationReform.userinterface.AddressDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.UtestRegistrationReform.userinterface.AddressDataPage.*;

public class FillAdressData implements Task {
    UserData userData;

    public FillAdressData(UserData userData) {this.userData = userData; }

    public static FillAdressData thePage(UserData userData) {return Tasks.instrumented(FillAdressData.class,userData); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(userData.getCityAdressUser()).into(CITY_TEXTBOX),
                Hit.the(Keys.ARROW_DOWN).into(CITY_TEXTBOX),
                Hit.the(Keys.ENTER).into(CITY_TEXTBOX),
                Enter.theValue(userData.getCityZipCodeUser()).into(ZIP_CODE_TEXTBOX),
                Click.on(COUNTRY_SELECT),
                Enter.theValue(userData.getCountryAdressUser()).into(COUNTRY_SELECT_TEXTBOX),
                Hit.the(Keys.ENTER).into(COUNTRY_SELECT_TEXTBOX),
                Click.on(STATE_SELECT),
                Enter.theValue(userData.getStateAdressUser()).into(STATE_SELECT_TEXTBOX),
                Hit.the(Keys.ENTER).into(STATE_SELECT_TEXTBOX),
                Click.on(NEXT_DEVICES_BUTTON));
    }
}
