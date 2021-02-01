Feature: Google Homepage Search

  Background:
    Given Open Google search home Page

  @simpleSearch
  Scenario: User can search with “Google Search”
    Given I am on the homepage
    When I type 'Simertik' into the search field
    And I click the Google Search button
    Then I go to the search results page
    And the first result is 'Simetrik | Collaborative and automatic reconciliator'

