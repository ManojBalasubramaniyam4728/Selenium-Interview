package Cucumber.StepDefinition;

import io.cucumber.java.en.*;

public class ConditionalHooksStepDefinition {
	
	@Given("I am on the order page")
    public void i_am_on_the_order_page() {
        System.out.println("Step: User is on order page");
    }

    @When("I place an order for {string}")
    public void i_place_an_order_for(String product) {
        System.out.println("Step: Placing order for " + product);
    }

    @Then("the order should be created successfully")
    public void the_order_should_be_created_successfully() {
        System.out.println("Step: Order created successfully");
    }
}
