Feature: Login functionality on bstackdemo

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters username "demouser" and password "testingisfun99"
    And Clicks on login button
    Then User should be redirected to the homepage