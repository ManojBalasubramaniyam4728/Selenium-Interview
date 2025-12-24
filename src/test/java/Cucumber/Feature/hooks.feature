@hooks
Feature: User login to application

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter username "manoj" and password "Password123"
    Then I should see the home page

  Scenario: Unsuccessful login with invalid password
    Given I am on the login page
    When I enter username "manoj" and password "wrongPass"
    Then I should see an error message
