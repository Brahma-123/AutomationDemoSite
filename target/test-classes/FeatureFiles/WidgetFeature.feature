Feature: Widget page automation

  Background: Get all Options from Widgets
    Given user in index page
    When user clicks Skip sign-in button
    Then User land in Register page
    When user mouse over to  Widget section
    Then all options should be visible


  Scenario: Automate to Accordion Page
    Given user in Accordion page
    When get the text from Group one Redability
    When click Redability secion Panel will close
    When clicks Single line coding section related text visible
    And Again clicks Single line coding that panel will close
    When clicks method chaining option related text visible
    And Again clicks Method chaining panel will close
    When clicks cross browser test related text visible
    And Again clicks cross browser test option panel will close


  Scenario: Automate Auto complete page
    Given user in Auto complete page
    When  enters "India" name into text box
    Then select country from list
    And Clear the country from search

  Scenario: Automate Disable Date Picker
    Given user in Date Picker page
    When click disabled Date picker
    Then Calendar should open
    When Select Date,Month and Year
    Then selected date month and year should be selected


  Scenario: Automate enable date picker
    Given user in Date Picker page
    When click enable date picker
    Then enable Calendar should open
    When Send the date into Text box
    Then get the selected date and close the calendar by clicking enter


  Scenario: Automate Slider page
    Given user in slider page
    When set the slider at fifty percentage
    And set the slider at ninety percentage
    And set the slider at five percentage


