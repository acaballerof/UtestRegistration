package co.com.choucair.certification.UtestRegistrationReform.stepdefinitions;

import co.com.choucair.certification.UtestRegistrationReform.model.UserData;
import co.com.choucair.certification.UtestRegistrationReform.questions.Answer;
import co.com.choucair.certification.UtestRegistrationReform.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisterStepDefinitions {


    @Before
    public void setStage() { setTheStage(new OnlineCast());}

    @Given("^than Luis want to join the utest community page$")
    public void thanLuisWantToJoinTheUtestCommunityPage() {
        theActorCalled("Luis").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fill out the registration form$")
    public void heFillOutTheRegistrationForm(List<UserData> UserData) {
        theActorInTheSpotlight().attemptsTo(FillPersonalData.thePage(UserData.get(0)),FillAdressData.thePage(UserData.get(0)),FillDevicesData.thePage(UserData.get(0)), FinishRegister.thePage(UserData.get(0)));
    }

    @Then("^he complete the registration process$")
    public void heCompleteTheRegistrationProcess(List<UserData> UserData) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(UserData.get(0))));
    }
}
