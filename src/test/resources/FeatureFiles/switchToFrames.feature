Feature: Windows Section automation
  Background: Automate Frames
    Given user in index page
    When user clicks Skip sign-in button
    Then User land in Register page
    When mouse over to Switch to dropdown
    Then Alerts,Window and Iframe options visible
    When click frames option
    Then user Land in Frames page

  Scenario: Single Iframe automate
    Given  user single iframe page
    When user switch into iframe
    And Enter the name into text box
    And come back into the Main page
    And click Nested iframe button

    Scenario: Nested Iframe Automate
      Given user in Nested iframe page
      When user enter into first frame and get text
      When user enter into Second frame and get text
      And user enter the text into text box
      Then User navigate to Parent window

