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

    @SmokeTest
  Scenario: Dynamic page drag and drop automate
    Given user navigate to dyanamic drag and drop page
    When drag and drop dynamic selenium S and Demosite symbol in First row
    And drag and drop dynamic selenium S and Demosite symbol in Second row
    And  drag and drop dynamic selenium S and Demosite symbol in Third row
    Then verify dynamic draggable element