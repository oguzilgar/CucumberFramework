$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Deck.feature");
formatter.feature({
  "name": "Deck Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user login page with \"User2\" and \"Userpass123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_stepDefs.the_user_login_page_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"deck\" module",
  "keyword": "Then "
});
formatter.match({
  "location": "Activity_StepDefs.the_user_navigates_to_module(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should be able to move A story",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@moveAStory"
    }
  ]
});
formatter.step({
  "name": "the user click on \"QA Engineers\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "Deck_StepDefs.the_user_click_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user moves a story from \"ToDo\" to \"Doing\"",
  "keyword": "And "
});
formatter.match({
  "location": "Deck_StepDefs.the_user_moves_a_story_from_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});