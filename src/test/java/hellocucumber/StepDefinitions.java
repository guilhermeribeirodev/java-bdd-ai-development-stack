package hellocucumber;

import io.cucumber.java.en.*;

import io.cucumber.java.pt.Dadas;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    String number = "";
    int converted = 0;

    @Given("{string} to be converted as cardinal")
    public void anExampleScenario(String number) {
        this.number = number;
        System.out.println(number);
    }

    @When("it gets converted")
    public void allStepDefinitionsAreImplemented() {
        converted = RomanToCardinal.convert(number);
    }

    @Then("the cardinal result is {string}")
    public void theScenarioPasses(String result) {
        Assertions.assertEquals(result, String.valueOf(converted));
    }

    // TODO - find a better way to organise step scenarios
    // Realised this is a bad way of creating a cucumber validation scenario
    // Will leave in another branch for the demonstration
    @Given("the roman input {string} is not valid")
    public void theRomanInputIsNotValid(String number) {
        this.number = number;
    }

    @Then("the error is displayed")
    public void theErrorIsDisplayed() {
        Assertions.assertThrows(NotRomanNumberException.class);
    }
}
