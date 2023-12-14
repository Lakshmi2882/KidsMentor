Feature: As a student I want to register successfully

  Background:
    Given I navigate to the website
    When I click sign up button
    And I click  sign up
 #Background for common features
  # parameterization helps to change functionality without affecting the code
  #when is for action and And is subsequent of when
  #13 to 17 and 29 to 33 are re usability
  @test1
  Scenario Outline: valid Registration
    When I enter the email "<email>"
    And I enter the username "<userName>"
    And I enter Password "<password>"
    And I enter confirm Password "<confirmedPassword>"
    And I click on Submit button
    Then Enrolled courses displayed

    Examples:
      |email           |userName   |password         |confirmedPassword|
      | Nathanhhi@yahoo.com | Nathanhhi   |    Nathan123@   |     Nathan123@  |
      |   vedhhi@gmail.com  |    Vedhhi   |   Vedd123$      |      Vedd123$   |
      |    Markhhi@mail.com |    Markhhi   |  Mark123&       |     Mark123&    |


  @test2
  Scenario Outline: To validate invalid email address
    When I enter the email "<invalidEmail>"
    And I enter the username "<userName>"
    And I enter Password "<password>"
    And I enter confirm Password "<confirmedPassword>"
    And I click on Submit button
    Then the text "Please enter a valid email" is displayed

    Examples:
      |invalidEmail      | userName   | password   | confirmedPassword |
      | Joabhyahoo.com    |   Joab     | Joab123@   |  Joab123@         |
      |   Zedh@gmail.     |    Zed     |   Zedd123$ |   Zedd123$        |
      |    Jackh@.com     |    Jack    |  Jack123&  |   Jack123&        |