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
   
   

 @Demo
    Scenario: Open Google
    Given I am on the Google page
    When I search "10.5"
    Then I should see search result

  @Smoke1 
  Scenario: Login
    Given I visit demosite
    When I login as guest user
    And I select t-shirt
    And I checkout out the item
    And I payout with credit card
    Then the order should be successfully checkout