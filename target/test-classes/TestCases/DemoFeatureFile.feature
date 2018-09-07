Feature: Using the demo site
  As a user
  I want to use the search bar
  So that I can browse through items

  Scenario: Search for an item of clothing on the website
    Given the search bar
    When I enter a search term
    And I click search
    Then I can see items that match my search terms