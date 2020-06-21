@networks
Feature: My Feature

  @location-validation
  Scenario Outline: Verify that city Bikes service provides right location information
    Given Citybikes networks service is invoked
    When a success response is received
    Then Verify that City "<city>" is present in Country "<country>"
    And the company in the city is located at latitude "<latitude>" longitude "<longitude>"
    Examples:
      | city      | country | latitude | longitude |
      | Frankfurt | DE      | 50.1072  | 8.66375   |

  @location-not-null
  Scenario Outline: Verify that city Bikes service provides right location information
    Given Citybikes networks service is invoked
    When a success response is received
    Then Verify that City "<city>" is present in Country "<country>"
    And the company in the city has valid latitude and longitude
    Examples:
      | city      | country |
      | Frankfurt | DE      |