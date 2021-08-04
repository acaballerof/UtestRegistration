package co.com.choucair.certification.UtestRegistrationReform.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalDataPage {
    public static final Target JOIN_BUTTON = Target.the("Where the user click the join button to proceed o register")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target FIRST_NAME_TEXTBOX = Target.the("Where the user writes his first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME_TEXTBOX = Target.the("Where the user writes his last name")
            .located(By.id("lastName"));
    public static final Target EMAIL_TEXTBOX = Target.the("Where the user writes his email")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH_SELECT = Target.the("Where the user select his month of birth")
            .located(By.xpath("//select[@id='birthMonth']"));
    public static final Target BIRTH_DAY_SELECT = Target.the("Where the user select his day of birth")
            .located(By.xpath("//select[@id='birthDay']"));
    public static final Target BIRTH_YEAR_SELECT = Target.the("Where the user select his year of birth")
            .located(By.xpath("//select[@id='birthYear']"));
    public static final Target LANGUAGE_SEARCH = Target.the("Where the user the spoken languages")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXT_LOCATION_BUTTON = Target.the("Click to the next step of registration")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
