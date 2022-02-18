Feature: Creat account of facebook
As a user yon need to open facebook home page and do the the validation


Scenario: Validate First Name field
Given User need to be on Facebook login page
When User enter user first name
Then User checks user first name is present

#Scenario: Validate create user multiple fields
#Given User need to be on facebook login page
#When user enters user first name 
#And User enter surname
#Then user checks user first name is present 
#And user check user surname is present
#But User Mobile field should br blank
