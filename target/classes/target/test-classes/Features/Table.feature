#Author: your.email@your.domain.com

@Table
Feature: To test/print the table data 
  
  @tablepagination
  Scenario: To print table data
    Given Ensure the user is in seleniumeasyhome page
    And the user is in table and table pagination
    When the user is in table pagination
    Then print the table data

  @tabledatasearch
  Scenario: To search data in a table
  Given Confirm user is in seleniumeasypage
  And the user is in table and table data search
  When the user is in tabledataserch pass the values to searchfor
  Then view the expected result
  
  @tablefilter
  Scenario: to test table filter page working or not
  Given Make sure the user is in seleniumeasypage
  And the user click table and tablefilter page
  When the user in tablefilter page checks able to click button and changes
  Then the user view the changes in tablefilter page
  
  @tablesortandsearch
  Scenario: to test data can be search and sort
  Given The user in seleniumeasy home page
  And the user click table and tablesort and search
  When the user search and sort for the data 
  Then expected result should be viewed
  
  
  