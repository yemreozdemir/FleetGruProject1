@FLEETG-1495 @FLEETG-1513
Feature: FleetGru App Login Feature
  User Story:
  As a user, I should be able to login with correct credentials to
  different accounts.And dashboard should be displayed.

  Accounts are: truck driver, sales manager, store manager

  Background:
    Given the user is on the login page
@FLEETG-1485
  Scenario Outline: user is able to login with valid credentials as a truck driver verification

    When the truck driver user enters username "<username>"
    And  the truck driver user enters password "<password>"
    And  the truck driver user clicks enter or login button
    Then the truck driver user can see Quick Launchpad page

    Examples:Truck drivers role
      | username | password    |
      | user1    | UserUser123 |

@FLEETG-1486
  Scenario Outline: user is able to login with valid credentials as a sales manager and store manager verification

    When the sales manager or store manager user enters username "<username>"
    And  the sales manager or store manager user enters password "<password>"
    And  the sales manager or store manager user clicks enter or login button
    Then the sales manager or store manager user can see Dashboard page

    Examples:sales manager and store manager role
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |

@FLEETG-1487
  Scenario Outline: "Invalid username or password" should be displayed for invalid
  (valid username-invalid password and invalid username-valid password) credentials

    When the user enters username "<invalidUsername>" and password "<invalidPassword>"
    And  the user clicks enter or login button
    Then the user should see warning message

    Examples: invalid credentials
      | invalidUsername | invalidPassword |
      | userf           | UserUser123     |
      | user1           | UserUser123f    |
      | salesmanager10f | UserUser123     |
      | salesmanager101 | UserUser123f    |
      | storemanager5f  | UserUser123     |
      | storemanager51  | UserUser123f    |

@FLEETG-1491
  Scenario: User should see the password in bullet signs by default

    When the user enters password
    Then the user should see the password in bullet signs

@FLEETG-1489
  Scenario: User land on the "Forgot Password" page after clicking on the "Forgot your password?" link

    When the user clicks forgot password button
    Then the user should land on forgot password page

@FLEETG-1490
  Scenario: User should see "Remember Me on This Computer" link exists and is clickable on the login page
    When the user is able to see remember me on this computer link
    Then the user should be able to click check box

@FLEETG-1492
  Scenario: Verify if the "Enter" key of the keyboard is working correctly on the login page
    When the user enters valid credentials and hits enter key instead of clicking login button
    Then the user should be able to navigate correct page

@FLEETG-1488
  Scenario: "Please fill out this field" message should be displayed if the password or username is empty

    When the user does not fill username or password
    And  the user clicks on login button
    Then the user should be able to see warning message on login page

@FLEETG-1493 @FLEETG-1513
  Scenario Outline: All users can see their own usernames in the profile menu, after successful login, for truck driver

    When the truck driver user enters username "<username>"
    And the truck driver user enters password "<password>"
    And the truck driver user clicks enter or login button
    Then the truck driver user can see username "<username>" in profile menu on Quick Launchpad page

    Examples: Truck drivers role
      | username | password    |
      | user1    | UserUser123 |

@FLEETG-1494
  Scenario Outline: All users can see their own usernames in the profile menu, after successful login, for sales manager and store manager

    When the sales manager or store manager user enters username "<username>"
    And the sales manager or store manager user enters password "<password>"
    And the sales manager or store manager user clicks enter or login button
    Then the sales manager or store manager user can see username "<username>" in profile menu on Dashboard page

    Examples: store manager and sales manager role

      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |


