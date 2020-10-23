@Activity
  Feature: The user navigates throughout modules

    Background:
      Given the user login page with "username" and "password"

    Scenario: The user navigates to Activity module
      Given the user navigates to "Activity" module
      Then the user should be in the activity module

