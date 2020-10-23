
@Dashboard
Feature: Dashboard page test
  Background:
    Given the user login page with "username" and "password"

  Scenario: the user should be able search a file in the search button
    Given the user search "Firstday" in the search button
    Then  the user should see the correct name of the file as "Firstday"


