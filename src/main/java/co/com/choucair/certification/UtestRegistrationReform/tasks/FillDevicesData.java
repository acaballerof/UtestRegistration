package co.com.choucair.certification.UtestRegistrationReform.tasks;

import co.com.choucair.certification.UtestRegistrationReform.model.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.UtestRegistrationReform.userinterface.DevicesDataPage.*;

public class FillDevicesData implements Task {
    UserData userData;

    public FillDevicesData(UserData userData) {
        this.userData = userData;
    }

    public static FillDevicesData thePage(UserData userData) {
        return Tasks.instrumented(FillDevicesData.class,userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COMPUTER_OS_SELECT),
                Enter.theValue(userData.getDeviceOsUser()).into(COMPUTER_OS_TEXTBOX),
                Hit.the(Keys.ENTER).into(COMPUTER_OS_TEXTBOX),
                Click.on(COMPUTER_OS_VERSION_SELECT),
                Enter.theValue(userData.getOsVersionUser()).into(COMPUTER_OS_VERSION_TEXTBOX),
                Hit.the(Keys.ENTER).into(COMPUTER_OS_VERSION_TEXTBOX),
                Click.on(COMPUTER_OS_LANGUAGE_SELECT),
                Enter.theValue(userData.getOsLanguageUser()).into(COMPUTER_OS_LANGUAGE_TEXTBOX),
                Hit.the(Keys.ENTER).into(COMPUTER_OS_LANGUAGE_TEXTBOX),
                Click.on(MOBILE_SELECT),
                Enter.theValue(userData.getMobileDeviceUser()).into(MOBILE_TEXTBOX),
                Hit.the(Keys.ENTER).into(MOBILE_TEXTBOX),
                Click.on(MOBILE_MODEL_SELECT),
                Enter.theValue(userData.getModelMobileUser()).into(MOBILE_MODEL_TEXTBOX),
                Hit.the(Keys.ENTER).into(MOBILE_MODEL_TEXTBOX),
                Click.on(MOBILE_OS_SELECT),
                Enter.theValue(userData.getOsMobileUser()).into(MOBILE_OS_TEXTBOX),
                Hit.the(Keys.ENTER).into(MOBILE_OS_TEXTBOX),
                Click.on(NEXT_LAST_STEP_BUTTON));
    }
}
