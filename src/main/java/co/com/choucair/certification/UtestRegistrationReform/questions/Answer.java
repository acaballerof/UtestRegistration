package co.com.choucair.certification.UtestRegistrationReform.questions;

import co.com.choucair.certification.UtestRegistrationReform.model.UserData;
import co.com.choucair.certification.UtestRegistrationReform.userinterface.FinalStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.UtestRegistrationReform.userinterface.FinalStepPage.*;

public class Answer implements Question<Boolean> {
    UserData userData;

    public Answer(UserData userData) {
        this.userData = userData;
    }

    public static Answer toThe(UserData userData) {
        return new Answer(userData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String completeSetupMessage = Text.of(COMPLETE_SETUP_BUTTON).viewedBy(actor).asString();

        if (userData.getFinishLabel().equals(completeSetupMessage)) {
            result = true;
        }else {
            result = false;
        }

        return result;
    }
}
