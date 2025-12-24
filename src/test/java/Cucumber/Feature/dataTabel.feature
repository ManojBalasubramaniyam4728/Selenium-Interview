Feature: Add multiple items to cart using data table
	
	@DataTableAsList
  Scenario: Add products to cart with quantities as List
    Given I am on the shopping cart page
    When I add the following products to the cart
      | Laptop      | 1        |
      | Mobile      | 2        |
      | Headphones  | 3        |
    Then all products should be added to the cart successfully
    
    @DataTableAsMap
    Scenario: Add products to cart with quantities as Map
    Given I am on the shopping cart page
    When I add the following products with quantity to the cart
      | productName | quantity |
      | Laptop      | 1        |
      | Mobile      | 2        |
      | Headphones  | 3        |
    Then all products should be added to the cart successfully
