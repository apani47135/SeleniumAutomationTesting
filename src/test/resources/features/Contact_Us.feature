@contact-us @regression

Feature: WebDriver Univeristy - Contact Us Page

  @contact-us1
  Scenario: Validate Successful Submission - Unique Data
    Given I access the webdriver univeristy contact us page
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message

  Scenario: Validate Successful Submission - Specific Data
    Given I access the webdriver univeristy contact us page
    When I enter a specific first name john
    And I enter a specific last name doe
    And I enter a specific specific email address joe_blogs123@mail.com
    And I enter a specific comment "How are you?"
    And I click on the submit button
    Then I should be presented with a successful contact us submission message
