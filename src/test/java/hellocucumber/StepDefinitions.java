package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    String number = "";
    int result = 0;

    @Given("{string} to be converted as cardinal")
    public void anExampleScenario(String number) {
        this.number = number;
        System.out.println(number);
    }

    @When("it gets converted")
    public void allStepDefinitionsAreImplemented() {
        result = RomanToCardinal.convert(number);
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
        Assertions.assertEquals(5, result );
    }
}
