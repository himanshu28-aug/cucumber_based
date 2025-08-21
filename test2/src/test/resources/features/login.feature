Feature: OrangeHRM Login

  Scenario: Successful login with valid credentials
    Given I am on the OrangeHRM login page
    When I enter valid username and password
    And I click on login button
    Then I should be redirected to the OrangeHRM home page