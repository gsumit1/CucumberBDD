Feature: Login feature test

  @Register
  Scenario: Register with username & passowrd
    Given I am on travel portal
    When I register with details
      | UserName         | Sumit   |
      | Password         | IBM@123 |
      | Confirm Password | IBM@123 |
    Then I should be successfully register

  @RegisterOutline
  Scenario Outline: Register with username & passowrd
    Given I am on travel portal
    When I register with "<UserName>" "<Password>" "<Confirm Password>"
    Then I should be successfully register

    Examples: 
      | UserName | Password | Confirm Password |
      | Sumit    | IBM@123  | IBM@123          |
      | Ghosh    | IBM@123  | IBM@123          |


	
   
   @Demo
    Scenario: Open Google
    Given I am on the Google page
    When I search "10.5"
    Then I should see search result


