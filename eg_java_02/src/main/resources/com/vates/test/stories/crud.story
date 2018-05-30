Meta:
@application application_name
@flow flow_name
@process process_name
@project project_name
@user user_name
@storyId US9999

Narrative:
As a student
I want do student crud operation
So that my information is up to date

Scenario: Example of common Behaviour.

Given I open the web page
When I click on button Launch demo modal
And I write "https://www.google.com" in Url input field
And I write "A!B"C#D$F%" in Alphanumeric input field
And I write "1234567890" in Numeric input field
And I write "mail@domain.com" in Email input field
And I write "secret" in Password input field
And I select text "Option 03" from select field
And I write "comment of student" in Comment input field
And I click on button Option 1
And I click on button Option 2
And I click on button Option 3
And I click on button Option 4
Then All is ok
And Example how create a table:
    | Area of focus | Story | Definitions |
    | business      |   yes |          no |
    | testing       |   yes |       maybe |
    | development   |   yes |         yes |
