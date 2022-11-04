Feature: Search Item

  Scenario: User searching for product not found
    When User click button search for product not found
    And User typing helm product search
    And User press enter for product not found
    Then Showing message no product were found

  Scenario: User search product item
    When User click button search
    And User typing dress product search
    And User press enter
    Then Showing dress product
