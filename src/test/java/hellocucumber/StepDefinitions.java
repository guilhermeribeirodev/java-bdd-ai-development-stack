package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("{string} to be converted as cardinal")
    public void anExampleScenario(String number) {
        System.out.println(number);
    }

    @When("it gets converted")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }
}
