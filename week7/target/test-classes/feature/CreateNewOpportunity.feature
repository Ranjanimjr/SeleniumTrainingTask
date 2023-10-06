Feature: Create new opportunity

Scenario Outline: verify opporutinity name created

When Click on toggle menu button from the left corner 
And Click view All and click Sales from App Launcher
And Click on Opportunity tab
And Click on New button
When Enter Opportunity name as <Salesforce Automation by *Your Name*>
And Choose close date as Today 
And Select Stage as Need Analysis
Then click Save and VerifyOppurtunity Name

Examples:
|Salesforce Automation by *Your Name*|
|Salesforce Automation by Janaranjani|