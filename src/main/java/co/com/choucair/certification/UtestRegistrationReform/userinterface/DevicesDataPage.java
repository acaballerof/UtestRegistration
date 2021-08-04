package co.com.choucair.certification.UtestRegistrationReform.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesDataPage {
    public static final Target COMPUTER_OS_SELECT = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='osId']"));
    public static final Target COMPUTER_OS_TEXTBOX = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='osId']/input"));
    public static final Target COMPUTER_OS_VERSION_SELECT = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='osVersionId']"));
    public static final Target COMPUTER_OS_VERSION_TEXTBOX = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='osVersionId']/input"));
    public static final Target COMPUTER_OS_LANGUAGE_SELECT = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='osLanguageId']"));
    public static final Target COMPUTER_OS_LANGUAGE_TEXTBOX = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='osLanguageId']/input"));
    public static final Target MOBILE_SELECT = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='handsetMakerId']"));
    public static final Target MOBILE_TEXTBOX = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='handsetMakerId']/input"));
    public static final Target MOBILE_MODEL_SELECT = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='handsetModelId']"));
    public static final Target MOBILE_MODEL_TEXTBOX = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='handsetModelId']/input"));
    public static final Target MOBILE_OS_SELECT = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target MOBILE_OS_TEXTBOX = Target.the("Where the user writes his email")
            .located(By.xpath("//div[@name='handsetOSId']/input"));
    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("Where the user writes his email")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
