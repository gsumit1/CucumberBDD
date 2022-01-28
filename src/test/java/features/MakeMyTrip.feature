@login
Feature: Booking Flight

  @flights
  Scenario: Booking Round Trip Flight
    Given user login to makemytrip using Guest account
    When the user booking flight with following info
      | Type       | From  | To     | Departure Date | Return Date | Pax | Class    |
      | Round Trip | Delhi | Mumbai | 28/01          | 29/01       |   1 | Business |
    And user book the cheapest available flight with credit card
    Then flight should be booked successfullly

  Scenario Outline: Purchase with Cards
    Given I log in Swaglabs as <“user”>
    When I add following products to cart
      | Products              |
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |
    Then the products should be added to the cart
    When I checkout from the cart
    And I finish the payment with <“card”>
    Then the order should be successfully completed

    Examples: 
      | user          | card |
      | standard_user | CC   |
      | admin_user    | DC   |
