
@files
  Feature: Files module

    Scenario Outline: login with different credentials
      Given the user login page with "<username>" and "<password>"
      Then the user should be on the homepage

      Examples: users
      |username|password    |
      |User1   |Userpass123 |
      |User2   |Userpass123 |
      |User3   |Userpass123 |
      |User4   |Userpass123 |
      |User5   |Userpass123 |

@listOfFiles
      Scenario: Check the all files names
        Given the user login page with "User2" and "Userpass123"
        Then  the files names should be
              |SELENIUM_CUCUMBER_TESTNG_JUNIT_QUESTIONS|image (1)|test_01|test_01|java|SQL|







