@hooks2
Feature: Ordered hooks demo

  Scenario: Successful login
    Given I am on the login page
    When I enter username "manoj" and password "Password123"
    Then I should see the home page
