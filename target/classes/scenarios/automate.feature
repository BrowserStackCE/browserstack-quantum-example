@Web
Feature: Google Search

  @automate
  Scenario: Search Quantum
    Given I am on Google Search Page
    When I search for "perfecto mobile quantum"
    Then it should have "perfecto" in search results
    Then I am on Google Search Page
