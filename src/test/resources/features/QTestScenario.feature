Feature:
  Demonstrate creation of new or update existing feature scenario directly in repo

  Scenario:
    Given Mark, the <uw> is logged into application for partner <0>
    When Mark creates a new vendor
    Then Mark should be able to see the Vendor in the summary table
