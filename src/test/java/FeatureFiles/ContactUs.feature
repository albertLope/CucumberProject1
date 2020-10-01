Feature: Contact us functionality

#  Scenario: Contact us functionality positive scenario
#
#    Given Navigate to website
#    And Login to website username as "technostudyy@gmail.com" password as "China1949."
#    When User fill the contact us page and Message is "Give my money back"
#    Then "successfully" message should be displayed

  Scenario Outline: Contact us functionality positive scenario

    Given Navigate to website
    And Login to website username as "technostudyy@gmail.com" password as "China1949."
    When User fill the contact us page and Message is "<MessageText>"
    Then "<result>" message should be displayed

    Examples:
      | MessageText                                | result       |
      | Give my money back                         | successfully |
      | this is my message                         | successfully |
      | I am going to tell you something important | successfully |
      |                                            | error        |
