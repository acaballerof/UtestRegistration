package co.com.choucair.certification.UtestRegistrationReform.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalStepPage {
    public static final Target PASSWORD_TEXTBOX = Target.the("Where the user writes his email")
            .located(By.id("password"));
    public static final Target REPEAT_PASSWORD_TEXTBOX = Target.the("Where the user writes his email")
            .located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED_CHECKBOX = Target.the("Where the user writes his email")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/input"));
    public static final Target TERMS_OF_USE_CHECKBOX = Target.the("Where the user writes his email")
            .located(By.id("termOfUse"));
    public static final Target PRIVACY_CHECKBOX = Target.the("Where the user writes his email")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Last button of the registration form")
            .located(By.xpath("//a[@id='laddaBtn']/span"));
}
