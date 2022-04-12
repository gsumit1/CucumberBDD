@test1234
Feature: Flight Reservation

  Scenario: One Way Flight Reservation
    Given I am on travel portal
    When I search Flight
      | From | London   |
      | To   | New York |
    Then I should have confirmation message

   
  Scenario: Register with username & passowrd
    Given I am on travel portal
    When I register with details
      | UserName         | Sumit   |
      | Password         | IBM@123 |
      | Confirm Password | IBM@123 |
    Then I should be successfully register