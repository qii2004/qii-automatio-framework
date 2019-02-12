Feature: As a System I should be able use the Oneshield application to get my job done

  Scenario Outline: As a System Admin I want to create an Region
    Given user is a valid sa user of the OneShield application
      | <PartnerNo> |
      | <User Role> |
      | <User Id>   |
      | <Password>  |
    When user enter valid details about the Region
    Then user should see Region Name

    Examples: User roles
      | PartnerNo | User Role | User Id | Password |
      | 0         | Admin     | Super   | user     |