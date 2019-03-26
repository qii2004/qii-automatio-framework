Feature: As a System I should be able use the Oneshield application to get my job done

  Scenario Outline: As a System Admin I want to create an office
    Given Sarah is a valid sa user of the OneShield application
      | <PartnerNo> |
      | <User Role> |
      | <User Id>   |
      | <Password>  |
    When Sarah enter valid details about the office she wants to creates
    Then Sarah should see Office Details and Contact Details

    Examples: User roles
      | PartnerNo | User Role | User Id | Password |
      | 0         | Admin     | Super   | user     |