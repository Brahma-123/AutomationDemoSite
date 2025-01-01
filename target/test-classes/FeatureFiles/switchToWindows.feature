Feature: Windows Section automation
  Background: Automate All Windows
    Given user in index page
    When user clicks Skip sign-in button
    Then User land in Register page
    When mouse over to Switch to dropdown
    Then Alerts,Window and Iframe options visible
    And click Windows options
    Then Windows page visible

  Scenario: New Tabbed Windows
    Given user in Windows page
    When user clicks New Tabbed windows button
    Then _Blank text with Click button visible
    When press click button
    Then new window should open in same browser

  Scenario: New separate window
    Given user in Windows page
    When clicks new separate window button
    Then new window with Some specification text will be visible
    When Press click button from Seperate widow
    Then new separate window should open

    Scenario: separate multiple windows
      Given user in Windows page
      When clicks separate multiple windows button
      Then open multiple windows text visible
      When press click button in Multiple Windows text section
      Then New separate windows should be open
