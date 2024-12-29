Feature: Signup
  Background: Navigate to Register page
    Given user in index page
    When user clicks Skip sign-in button
    Then User land in Register page
  Scenario: User Registration
    Given user in Register page
    When user Enter Firstname "Brahmananda" and Last name "Reddy"
    And Enter Address "kadapa"
    And Enter Email id "reddy@gmail.com"
    And Enter phone number "9585858585"
    And Select gener and Hobbies
    And Select Language
    And Select Skills and country
    And Select Date of Birth
    And enter password "Reddy@123" and Confirm password "Reddy@123"
    And Click Submit button
    Then Need to check

