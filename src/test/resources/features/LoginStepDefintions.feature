@login_Task
Feature: Login step
  As user, I should login in with user name and password
  Background: open login page
    Given user is on the login page
  Scenario: Login with "username" and "password"
    When user enter "Tester" and "test"
    Then verify the page login text is a Web Orders