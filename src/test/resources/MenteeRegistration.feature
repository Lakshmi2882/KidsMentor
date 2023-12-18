Feature: I want to register to become a mentee.

  Background:
    Given I navigate to the website
    When I click start as a mentee
    Then welcome page displayed

  @test
  Scenario Outline: valid mentee registration
    When I enter first name "<firstName>"
    And I enter last name "<lastName>"
    And I enter the email "<emailAddress>"
    And I enter Password "<password>"
    And I click Mentee checkbox
    And I click terms and condition
    And I click join now
    Then welcome page displayed

    Examples:
      |firstName|lastName|emailAddress|password|
      |  Markh       |  John      |  markh@gmail.com          |    Mark123@    |