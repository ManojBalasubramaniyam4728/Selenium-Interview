package Cucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("User is on the login page");
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        System.out.println("Entering username: " + username + " and password: " + password);
    }

    @Then("I should see the home page")
    public void i_should_see_the_home_page() {
        System.out.println("Home page is displayed");
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        System.out.println("Error message is displayed");
    }
}