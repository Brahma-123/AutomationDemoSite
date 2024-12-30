Feature: Windows Section automation
  Scenario: Automate All alerts
    Given user in index page
    When user clicks Skip sign-in button
    Then User land in Register page
    When mouse over to Switch to dropdown
    Then Alerts,Window and Iframe options visible
    And click Windows options
    Then Windows page visible

