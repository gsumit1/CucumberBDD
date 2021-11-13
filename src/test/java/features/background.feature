@bacground
Feature: Login feature test

  Background: user on google page
    Given I am on the Google page

  Scenario: Open Google
    When I search "India"
    Then I should see search result

  Scenario: Open Google
    When I search "US"
    Then I should see search result
