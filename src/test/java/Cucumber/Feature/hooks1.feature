@hooks1
Feature: Payment processing

  Scenario: Successful payment with valid card
    Given I am on the payment page
    When I pay amount 1000 with card "4111111111111111"
    Then payment should be successful

  Scenario: Declined payment with invalid card
    Given I am on the payment page
    When I pay amount 500 with card "0000000000000000"
    Then payment should be declined
