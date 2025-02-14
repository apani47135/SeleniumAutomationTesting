@login @regression
Feature: WebDriver Univeristy - Login Page

  Background:
    Given I access the webdriver univeristy login page


  Scenario Outline: Validate - Successful & Unsuccessful login
    When I enter a username <username>
    And I enter a password <password>
    And I click on the login button
    Then I should be presented with message <loginValidationText>

    Examples:
    |username | password| loginValidationText|
    |webdriver|webdriver123|validation succeeded|
    |webdriver|webdriver1  |validation failed   |
    |webdriver| webdriver2 |validation failed|

