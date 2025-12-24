package Cucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentStepDefinition {
	@Given("I am on the payment page")
    public void i_am_on_the_payment_page() {
        System.out.println("User is on the payment page");
    }

    @When("I pay amount {int} with card {string}")
    public void i_pay_amount_with_card(Integer amount, String cardNumber) {
        System.out.println("Paying amount: " + amount + " with card: " + cardNumber);
    }

    @Then("payment should be successful")
    public void payment_should_be_successful() {
        System.out.println("Payment is successful");
    }

    @Then("payment should be declined")
    public void payment_should_be_declined() {
        System.out.println("Payment is declined");
    }
}
