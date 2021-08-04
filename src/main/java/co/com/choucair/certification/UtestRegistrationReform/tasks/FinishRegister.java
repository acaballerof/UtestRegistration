package co.com.choucair.certification.UtestRegistrationReform.tasks;

import co.com.choucair.certification.UtestRegistrationReform.model.UserData;
import co.com.choucair.certification.UtestRegistrationReform.userinterface.FinalStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.UtestRegistrationReform.userinterface.FinalStepPage.*;

public class FinishRegister implements Task {
    UserData userData;

    public FinishRegister(UserData userData) {
        this.userData = userData;
    }

    public static FinishRegister thePage(UserData userData) {
        return Tasks.instrumented(FinishRegister.class,userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(userData.getPasswordUser()).into(PASSWORD_TEXTBOX),
                Enter.theValue(userData.getPasswordUser()).into(REPEAT_PASSWORD_TEXTBOX),
                Click.on(STAY_INFORMED_CHECKBOX),
                Click.on(TERMS_OF_USE_CHECKBOX),
                Click.on(PRIVACY_CHECKBOX));
    }
}
