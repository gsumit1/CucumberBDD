@Rest
Feature: Record a new trade
  @RestDemo
  Scenario: Validate the post request
    Given the following trade:
    | security | buySell | quantity | priceInCents |
    | APPL     | BUY     | 10       | 10000        |
    When I record the trade 
    Then the recorded trade should include the following details:
      | security | buySell | quantity | priceInCents | 
      | APPL     | BUY     | 10       | 10000        | 
