@hooks3
Feature: Order placement with conditional hooks

  @db
  Scenario: Place order that needs DB setup
    Given I am on the order page
    When I place an order for "Laptop"
    Then the order should be created successfully

  @api
  Scenario: Place order via API only
    Given I am on the order page
    When I place an order for "Mobile"
    Then the order should be created successfully
