Feature: Search on Amazon

#Senario example
  Scenario: Validate Search feature on Amazon
    Given I have Search option in the amazon
    When I Search for a Product "RadeTape" and Price is 1000
    Then Result for RadeTape Should be displayed
    
 #senario example with tag
  @smoke
  Scenario: Validate product search with price filter
  	Given I am on the Amazon search page
  	When I search for product "Laptop" with maximum price 50000
  	Then search results for "Laptop" under price 50000 should be displayed
  
  #Scenario Outline example with tag
  @regression
  Scenario Outline: Validate product search with different prices
  	Given I am on the Amazon search page
  	When I search for product "<productName>" with maximum price <maxPrice>
  	Then search results for "<productName>" under price <maxPrice> should be displayed

  	Examples:
    	| productName | maxPrice |
    	| Laptop      | 50000    |
    	| Mobile      | 20000    |
    	| Headphones  | 5000     |

