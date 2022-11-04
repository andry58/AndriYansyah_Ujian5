Feature: Checkout Product

  Scenario: User doing checkout product
    When User click button checkout
    And User typing firstname lastname
    And User typing company name just optional
    And User choose country
    And User typing address one
    And User typing address two just optional
    And User typing city
    And User choose province
    And User typing postcode
    And User typing phone number
    And User enter notes just optional

    And User click button place order
    Then Showing message Thank you. Your order has been received
