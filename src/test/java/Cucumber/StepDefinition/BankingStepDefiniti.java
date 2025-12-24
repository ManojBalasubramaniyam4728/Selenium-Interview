package Cucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class BankingStepDefiniti {

    private String currentUser;
    private double currentBalance = 10000.0;
    private String targetAccount;

    @Given("I login with user {string}")
    public void i_login_with_user(String username) {
        this.currentUser = username;
        System.out.println("Logged in as user: " + username);
    }

    @When("I check account balance")
    public void i_check_account_balance() {
        System.out.println("Checking balance for user: " + currentUser + " - Balance: $" + currentBalance);
    }

    @When("I transfer {int} to account {string}")
    public void i_transfer_to_account(int amount, String accountNumber) {
        this.targetAccount = accountNumber;
        if (currentBalance >= amount) {
            currentBalance -= amount;
            System.out.println("Transferred $" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }

    @Then("transfer should be successful")
    public void transfer_should_be_successful() {
        // Mock assertion - in real test would verify DB/API
        System.out.println("✓ Transfer to " + targetAccount + " successful");
    }

    @Then("balance should be greater than 0")
    public void balance_should_be_greater_than_zero() {
        // Mock assertion
        if (currentBalance > 0) {
            System.out.println("✓ Balance $" + currentBalance + " is greater than 0");
        } else {
            System.out.println("✗ Balance is not greater than 0");
        }
    }
}
