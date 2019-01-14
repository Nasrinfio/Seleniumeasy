$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Sliders.feature");
formatter.feature({
  "name": "To test adjustments working fine or not",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test sliders working or not",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sliders"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in seleniumeasy page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSliders.the_user_is_in_seleniumeasy_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is in progressbar and clicks draganddrop",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSliders.the_user_is_in_progressbar_and_clicks_draganddrop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user in draganddrop",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSliders.the_user_in_draganddrop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should view the result",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});