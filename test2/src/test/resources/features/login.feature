Feature: Login functionality
  Scenario: Successful login with valid credentials
    Given I open the browser
    When I navigate to the login page
    And I enter username "standard_user" and password "secret_sauce"
    And I click on login button
    Then I should see the homepage