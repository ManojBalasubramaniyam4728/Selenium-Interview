package Cucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("I have Search option in the amazon")
	public void i_have_Search_option_in_the_amazon() {
		System.out.println("Search option is peresent in amazon page");
	}

	@When("I Search for a Product {string} and Price is {int}")
	public void i_Search_for_a_Product_and_Price_is(String product, int price) {
		System.out.println("Searched product is " + product + " and Price is " + price + "");
	}

	@Then("Result for RadeTape Should be displayed")
	public void result_for_RadeTape_Should_be_displayed() {
		System.out.println("Result for RadeTape Should be displayed");
	}

	@Given("I am on the Amazon search page")
	public void i_am_on_the_Amazon_search_page() {
		System.out.println("User is on Amazon search page");
	}

	@When("I search for product {string} with maximum price {int}")
	public void i_search_for_product_with_maximum_price(String productName, int maxPrice) {
		System.out.println("Searching for product: " + productName + " with max price: " + maxPrice);
	}

	@Then("search results for {string} under price {int} should be displayed")
	public void search_results_for_under_price_should_be_displayed(String productName, int maxPrice) {
		System.out.println("Verifying results for: " + productName + " under price: " + maxPrice);
	}

	@Given("I am on the Amazon home page")
	public void i_am_on_the_Amazon_home_page() {
		System.out.println("User is on Amazon home page");
	}

	@Given("I am logged in as {string}")
	public void i_am_logged_in_as(String username) {
		System.out.println("User is logged in as: " + username);
	}

}
