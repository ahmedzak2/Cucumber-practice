@regressions
Feature:  Login functionality

  In order to do
  AS a valid para banking
  I want to login successfully
  Background: nevigate to login
    Given nevigate to login
   #the first test Scenario
  Scenario: Login Successful11
      #as assumption use do what first step make
    # The action which user is taken
    When  I enter valid "tomsmith"
    And  i enter valid "SuperSecretPassword!"
    And  i click on button1
    Then success happen
    And  user go to homepage

  Scenario: login fail
    When  I enter valid "tomsmith112"
    And  i enter valid "SuperSecretPassword!1234"
    And  i click on button1
    Then login fail