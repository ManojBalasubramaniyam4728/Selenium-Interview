@all
Feature: Search on Amazon

  Background:
    Given I am on the Amazon home page
    And I am logged in as "testuser"

  @background
  Scenario: Validate Search feature on Amazon
    Given I have Search option in the amazon
    When I Search for a Product "RadeTape" and Price is 1000
    Then Result for RadeTape Should be displayed
    
	@background
  Scenario: Validate product search with price filter
    Given I am on the Amazon search page
    When I search for product "Laptop" with maximum price 50000
    Then search results for "Laptop" under price 50000 should be displayed
