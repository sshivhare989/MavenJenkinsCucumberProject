
Feature: Search box functionality test
  

  @Table
  Scenario: The one where user picks product through search functionaltiy
    When User searches below products in the search box:
    |Belt  |
    |Laptop|
    |camera|
    
    Then product should be added in the cart if avilable
 

