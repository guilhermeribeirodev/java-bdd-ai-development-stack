package hellocucumber;

import io.cucumber.java.en.*;

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
}
