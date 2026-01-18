#Glerkinmultiplescenarios

Feature:To perform multiple scenarios

Background: To automate the login form
Given we are in login page
When we will enter the valid username in username field
And we will enter the valid password in password field
Then we will click on login butoon


Scenario: to perform the mousehover every menu options
When we will mousehover on admin option
And  we will mousehover on PIM option
When we will mousehover on Leave option
And  we will mousehover on Time option
When we will mousehover on Recruitment option


Scenario:to add multiple employee in PIM option
When we will navigate to PIM option and click on the add button
And we will enter <firstname> in the firstname field
When we will enter <middlename> in the middletname field
And we will enter <lastname> in the lastname field
Then we will click on the Save button

Examples:

|firstname|middlename|lastname|
|sam|abc|xyz|
|virat|abs|kohli|

