Feature: A story is a collection of scenarios

Narrative:
In order to start using the calculator
As a user
I want to see the default state

Scenario: A scenario is a collection of executable steps of different type

Given that the calulator exists
When the calculator is turned on
Then the display should read 0.

Scenario: Display changes to reflect button pushes

Given that the calculator is reset
When a <button push> occurs
Then the display should read <display>

Examples:
|button push|display|
|1|1.|
|5|5.|
|9|9.|