@login
Feature: Login feature test
 @Smoke 
  Scenario: Login
    Given I visit "/login"
    When I enter "Bob" in the "user name" field
    And I enter "tester" in the "password" field
    And I press the "login" button
    Then I should see the "welcome" page

 @Regression
  Scenario: Login2
    Given I visit "/login"
   