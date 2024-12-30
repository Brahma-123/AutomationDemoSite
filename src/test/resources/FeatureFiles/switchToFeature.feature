Feature: SwitchTo feature contains Alerts,Iframes and Windows

  Background: Automate All alerts
    Given user in index page
    When user clicks Skip sign-in button
    Then User land in Register page
    When mouse over to Switch to dropdown
    Then Alerts,Window and Iframe options visible
    And click Alerts options
    Then user land in alerts page

  Scenario: Alert with Ok
    Given user in Alerts page
    When user click alert with ok button
    Then Click the button to display and Alert box button visible
    When user click above Button to display button
    Then Alert popup should be visible with okay button
    When click Ok button popup

  Scenario: Accepting the Alert
    Given user in Alerts page
    When user clicks Alert with Okay&Cancel button
    Then okay Confirm box button visible
    When Clicks Okay Confirm box button
    Then Alert popup will be visible with Okay and Cancel button
    When user clicks Okay You pressed okay text visible under Confirm text box

  Scenario: Canceling the Alert
    Given user in Alerts page
    When user clicks Alert with Okay&Cancel button
    Then okay Confirm box button visible
    When Clicks Okay Confirm box button
    Then Alert popup will be visible with Okay and Cancel button
    When user clicks Cancel you pressed cancel Text visible under Confirm text box button

  Scenario: Enter name and accept the alert
    Given user in Alerts page
    When user clicks alert with text box button
    Then prompt box button visible
    When Clicks Prompt box button
    Then Alert with Text box should be visible
    When clear the text from text box and enter "This is Brahma"
    Then accept the alert

  Scenario: Entering the name then clicking cancel button on Prompt Alert
    Given user in Alerts page
    When user clicks alert with text box button
    Then prompt box button visible
    When Clicks Prompt box button
    Then Alert with Text box should be visible
    When clear the text from text box and enter "This is Brahma"
    Then click cancel button on textbox alert popup


