Feature: Amazon Search Functionality

  Background:
    Given I have opened Amazon Mobile Web page

  @amazon
  Scenario Outline: Searching for a product on Amazon
      When I enter "<product>" in the search bar
      Then I click on the search button
      Examples:
        | product |
        | monitor |

## bu senaryo çalışmadı. hoca da problemi bulamadı