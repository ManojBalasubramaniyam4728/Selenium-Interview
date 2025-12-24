package Cucumber.StepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class DataTabelStepDefinition {
	
	@Given("I am on the shopping cart page")
    public void i_am_on_the_shopping_cart_page() {
        System.out.println("Step: I am on the shopping cart page");
    }
	
	@When("I add the following products to the cart")
	public void i_add_the_following_products_to_the_cart(DataTable productNameAndquantity) {
		List<List<String>> productNameAndquantityList = productNameAndquantity.asLists(String.class);
		for (List<String> list : productNameAndquantityList) {
			System.out.println(list.toString());
		}
	}
	
	@Then("all products should be added to the cart successfully")
    public void all_products_should_be_added_to_the_cart_successfully() {
        System.out.println("Step: all products should be added to the cart successfully");
    }
	
	@When("I add the following products with quantity to the cart")
	public void i_add_the_following_products_with_quantity_to_the_cart(DataTable productTable) {
	    List<Map<String, String>> products = productTable.asMaps(String.class, String.class);
	    
	    for (Map<String, String> product : products) {
	        String productName = product.get("productName");
	        String quantity = product.get("quantity");
	        System.out.println("Adding " + quantity + " of " + productName + " to cart");
	    }
	}

}