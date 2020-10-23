
  Feature: Deck Tests

    Background:
      Given the user login page with "User2" and "Userpass123"
      Then  the user navigates to "deck" module
@titles
    Scenario: Verify all the titles
      And  the user should see the all the correct titles
      |Common|Company|Daily|Developers|IT|Personal|QA Engineers|Create new board|



  @ToDo
  Scenario: Add new tasks in the work-flow chart
        Then the user click on "QA Engineers" button
        And the user should be able to send new task to the To Do list
    |story_01|story_02|story_03|story_04|story_05|story_06|story_07|story_08|story_09|story_10|


    @moveAStory
    Scenario: The user should be able to move A story
      Then  the user click on "QA Engineers" button
      And the user moves a story from "ToDo" to "Doing"