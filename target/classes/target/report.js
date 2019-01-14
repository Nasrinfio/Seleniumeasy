$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/SimpleForm.feature");
formatter.feature({
  "name": "To test user can fill the simple form",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test radiobutton working or not",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@radiobtn"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Confirm the user is in seleniumeasypage",
  "keyword": "Given "
});
formatter.match({
  "location": "Homepage.seleniumeasypage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User clicks the Inputform and radiobutton",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage.the_User_clicks_the_Inputform_and_radiobutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the radiobtn fill the details",
  "keyword": "When "
});
formatter.match({
  "location": "Radiobutton.clickradiobutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the radiobutton",
  "keyword": "Then "
});
formatter.match({
  "location": "Radiobutton.the_user_clicks_the_radiobutton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});