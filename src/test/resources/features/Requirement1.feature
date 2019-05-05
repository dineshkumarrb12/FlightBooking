Feature: To verify addition operator

Scenario: Positive Numbers
Given I open the calculator
And switch it on
When I press 2 + 3
And I press =
Then result should be 5
And close the application
# This is my comment

Scenario: 1st Number is negative
Given I open the calculator
When I press -2 + 3 =
Then result should be -1

Scenario: 2nd number is negative
Given I open the calculator
When I press 1 + -3 =
Then result should be -2

Scenario Outline: Addition of positive Numbers
Given I open the calculator
When I press <number1> + <number2> = 
Then result should be <result>

Examples:
| number1 | number2 | result |
|   2     |    3    | 5      |
|   1     |    8    | 9      |
|   5     |    4    | 9      |
|   8     |    2    | 10     |
|   3     |    4    | 7      |
|   3     |    3    | 6      |
