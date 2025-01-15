Feature: Interactions features automate

  Background: Get all Options from Interactions
    Given user in index page
    When user clicks Skip sign-in button
    Then User land in Register page
    When user mouse over to  Interactions section
    Then interactions section should be visible

  Scenario: Static page drag and drop automate
    Given user navigate to static drag and drop page
    When drag and drop S Selenium and demosite symbol in first row
    And  drag and drop S Selenium and demosite symbol in second row
    And  drag and drop S Selenium and demosite symbol in third row
    Then verify the dragable element

  Scenario: Dynamic page drag and drop automate
    Given user navigate to dyanamic drag and drop page
    When drag and drop dynamic selenium S and Demosite symbol in First row
    And drag and drop dynamic selenium S and Demosite symbol in Second row
    And  drag and drop dynamic selenium S and Demosite symbol in Third row
    Then verify dynamic draggable element

  Scenario: Automate Default functionality all elements
    Given user navigate to selectable page
    When click default functionality option
    Then select Readability
    And select Single line coding
    And select method chaining
    And select cross browser testing
    And select extent report
    And select data driven testing
    And select functional testing

      @smoke
      Scenario: Automate Serialize page
        Given user in selectable page
        When click Serialize option
        Then select serialize_Readability
        And select serialize_Single line coding
        And select serialize_method chaining
        And select serialize_cross browser testing
        And select serialize_extent report
        And select serialize_data driven testing
        And select serialize_functional testing