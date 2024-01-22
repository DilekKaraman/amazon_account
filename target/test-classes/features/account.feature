
Feature: US001

  Background: Homepage
    Given user goes to homepage

  @positive @UI
  Scenario Outline: is user able to create account on Amazon
    When  user goes to the Hello sign in block
    And   user clicks create your amazon account button
    And   user enters name "<first and last name>"
    And   user enters email
    And   user enters password "<password>"
    And   user enters repassword"<repassword>"
    And   user clicks continue button
    And   user click start puzzle button
    Then  user verifies the "Verify e-mail address" is visible
    Examples:
      | first and last name | password  | repassword |
      | dilek karaman       | 123Dilek& | 123Dilek&  |

  @negg @UI
  Scenario Outline: is user try to create account on Amazon
    When  user goes to the Hello sign in block
    And   user clicks create your amazon account button
    And   user enters name "<first and last name>"
    And   user enters email "<email>"
    And   user enters password "<password>"
    And   user enters repassword"<repassword>"
    And   user clicks continue button
    Then  user verifies the "Verify e-mail address" is not visible
    Examples:
      | first and last name | email             | password | repassword |
      |                     | dilek@hotmail.com | 123456   | 123456     |
      | dilek               |                   | 123456   | 123456     |
      | dilek               | dilek@hotmail.com |          | 123456     |
      | dilek               | dilek@hotmail.com | 123456   |            |
      | dilek               | dilek@hotmail.com | 12345    | 12345      |
      | dilek               | dilek@hotmail.com | *        | *          |
      | dilek               | dilek@hotmail.com | AB       | AB         |
      | dilek               | dilek.hotmail.com | 12Axx*   | 12Axx*     |

