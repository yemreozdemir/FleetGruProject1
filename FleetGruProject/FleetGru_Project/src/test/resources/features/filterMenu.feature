@FLEETG-1707
Feature: Users should be able to use filter menu

  Background:
    Given the user is on the login page

@FLEETG-1697
  Scenario Outline: Manage filter button is functional as a driver
    When the truck driver user enters username "<username>"
    And  the truck driver user enters password "<password>"
    And  the truck driver user clicks enter or login button
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    Then the manage filters button becomes visible

    Examples:Truck drivers role
      | username | password    |
      | user1    | UserUser123 |

  @FLEETG-1698
  Scenario Outline:  Manage filter button is functional as a sales manager and store manager
    When the sales manager or store manager user enters username "<username>"
    And  the sales manager or store manager user enters password "<password>"
    And  the sales manager or store manager user clicks enter or login button
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    Then the manage filters button becomes visible

    Examples: sales manager and store manager role
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |

  @FLEETG-1699
  Scenario Outline: the user can apply filters by clicking as a driver
    When the truck driver user enters username "<username>"
    And  the truck driver user enters password "<password>"
    And  the truck driver user clicks enter or login button
    When the user navigates to Fleet Vehicles module
    When the user waits because it's driver
    When the user scroll to filter icon and clicks
    When the user clicks the manage filters button
    When the user clicks one of the filter
    Then the filter turns clicked

    Examples:Truck drivers role
      | username | password    |
      | user1    | UserUser123 |

  @FLEETG-1700
  Scenario Outline: the user can apply filters by clicking as a sales manager and store manager
    When the sales manager or store manager user enters username "<username>"
    And  the sales manager or store manager user enters password "<password>"
    And  the sales manager or store manager user clicks enter or login button
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    When the user clicks one of the filter
    Then the filter turns clicked

    Examples: sales manager and store manager role
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |

  @FLEETG-1701
  Scenario Outline: the user can apply filters by typing as a driver
    When the truck driver user enters username "<username>"
    And  the truck driver user enters password "<password>"
    And  the truck driver user clicks enter or login button
    When the user navigates to Fleet Vehicles module
    When the user waits because it's driver
    When the user scroll to filter icon and clicks
    When the user clicks the manage filters button
    When the user types "License Plate" into input box
    Then typed filter name becomes clickable

    Examples:Truck drivers role
      | username | password    |
      | user1    | UserUser123 |

  @FLEETG-1702
  Scenario Outline: the user can apply filters by typing as a sales manager and store manager
    When the sales manager or store manager user enters username "<username>"
    And  the sales manager or store manager user enters password "<password>"
    And  the sales manager or store manager user clicks enter or login button
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    When the user types "License Plate" into input box
    Then typed filter name becomes clickable
    Examples:sales manager and store manager role
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |

  @FLEETG-1703
  Scenario Outline: the user can apply multiple filters at the same time as a driver
    When the truck driver user enters username "<username>"
    And  the truck driver user enters password "<password>"
    And  the truck driver user clicks enter or login button
    When the user navigates to Fleet Vehicles module
    When the user waits because it's driver
    When the user scroll to filter icon and clicks
    When the user clicks the manage filters button
    Then filter names become clickable
    Examples: truck driver role
      | username | password    |
      | user1    | UserUser123 |

  @FLEETG-1704
  Scenario Outline: the user can apply multiple filters at the same time as a sales manager and store manager
    When the sales manager or store manager user enters username "<username>"
    And  the sales manager or store manager user enters password "<password>"
    And  the sales manager or store manager user clicks enter or login button
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    Then filter names become clickable
    Examples:sales manager and store manager role
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |

  @FLEETG-1705
  Scenario Outline: the user can remove all filters by clicking reset icon as a driver
    When the truck driver user enters username "<username>"
    And  the truck driver user enters password "<password>"
    And  the truck driver user clicks enter or login button
    When the user navigates to Fleet Vehicles module
    When the user waits because it's driver
    When the user scroll to filter icon and clicks
    When the user clicks the manage filters button
    When filter names become clickable
    When the user clicks the reset icon
    Then all filters removed
    Examples:truck driver role
      | username | password    |
      | user1    | UserUser123 |

  @FLEETG-1706
  Scenario Outline: the user can remove all filters by clicking reset icon as a sales manager store manager
    When the sales manager or store manager user enters username "<username>"
    And  the sales manager or store manager user enters password "<password>"
    And  the sales manager or store manager user clicks enter or login button
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    When filter names become clickable
    When the user clicks the reset icon
    Then all filters removed
    Examples:sales manager and store manager role
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |



