Feature: As a student I want to register successfully

  @test
  Scenario: valid Registration
    Given I navigate to the website
    When I click sign up button
    And I click  sign up
    And I enter the email
    And I enter the username
    And I enter Password
    And I enter confirm Password
    And I click on Submit button
    Then Enrolled courses displayed