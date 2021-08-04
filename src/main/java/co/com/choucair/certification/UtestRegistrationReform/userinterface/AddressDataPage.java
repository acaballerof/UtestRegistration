package co.com.choucair.certification.UtestRegistrationReform.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressDataPage {
    public static final Target CITY_TEXTBOX = Target.the("Where the user put the city where he lives")
            .located(By.xpath("//input[@id='city']"));
    public static final Target STATE_SELECT = Target.the("Where the user click the state select")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[2]/div[2]/div"));
    public static final Target STATE_SELECT_TEXTBOX = Target.the("Where the user put the state where he lives")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
    public static final Target ZIP_CODE_TEXTBOX = Target.the("Where the writes the zip code of his address")
            .located(By.id("zip"));
    public static final Target COUNTRY_SELECT = Target.the("Where the user click the country select field")
            .located(By.xpath("//div[@name='countryId']"));
    public static final Target COUNTRY_SELECT_TEXTBOX = Target.the("Where the user writes his country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES_BUTTON = Target.the("Click to the next step of registration")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
