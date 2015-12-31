
Feature: Life of Dental guys

In order to get good salary
As a Dental guy
I want to keep my boss happy

Scenario Outline: I am a Dentist
Given I am a "<DentistType>" Dentist
| country    |
| Bangladesh |
| India      |
When I go to clinic
| clinictype |
| dental     |
| mental     |
Then I "<Workoutput>" with patient
And My boss "<BossReaction>" me
But The assistant "<assistantReaction>" me


Examples:
 |DentistType | Workoutput | BossReaction | assistantReaction |
 |good        | treat      | likes        | hates             |
 |bad         | mess       | hates        | likes			  |
 |average     | treating   | soso         | noReaction        |




