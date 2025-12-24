@hooks4
Feature: Banking app tests

  Scenario: Check balance
    Given I login with user "manoj"
    When I check account balance
    Then balance should be greater than 0

  Scenario: Transfer money
    Given I login with user "manoj"  
    When I transfer 1000 to account "12345"
    Then transfer should be successful
