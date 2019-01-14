#Author: your.email@your.domain.com
@Forms
Feature: To test user can fill the simple form

  @simple
  Scenario: To test simple form working or not
    Given Ensure the user is in seleniumeasy home page
    And the user clicks the Input form and simple form
    When the user clicks the simple form fill the details
    Then The user view the result

  @check
  Scenario: To test Checkbox demo form working or not
    Given Ensure the user is in Seleniumeasy home page
    And the User clicks the Inputform and checkbox form
    When the user clicks the checkbox fill the details
    Then the user view the result

  @radiobtn
  Scenario: To test radiobutton working or not
    Given Confirm the user is in seleniumeasypage
     And the User clicks the Inputform and radiobutton
     When the user clicks the radiobtn fill the details
     Then the user clicks the radiobutton 
     
   @input
   Scenario: To test inputform working or not
   Given the user is in seleniumeasypage
   And the user clicks the Inputform and inputformdemo
   When the user clicks the inputform fill the details
   Then the user views expected result
   
   @dropdown
   Scenario: test dropdownform working or not
   Given the user in seleniumhome page
   And the user click inputform and dropdownform
   When the user clicks the dropdownform fill the details
   Then the user view result
   
   @ajax
   Scenario: To test ajax form working or not
   Given Make sure user is in seleniumeasypage
   And the user clicks the Inputform and ajaxform
   When the user clicks the ajaxform fill the details
   Then the user see the expected result
   
  @jquery
  Scenario: test jquery form working or not
  Given user in seleniumeasyhome page
  And the user click the inputform and jqueryform
  When the user click the jqueryform fill the details
  Then the user can view the expected result
   
   