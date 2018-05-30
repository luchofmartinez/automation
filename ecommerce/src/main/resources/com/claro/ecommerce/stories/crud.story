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
When I click on "Launch demo modal" button
And I write "https://www.google.com" in Url input field
And I write "a1b2" in Alphanumeric input field
And I write "1234567890" in Numeric input field
And I write "mail@domain.com" in Email input field
And I write "secret" in Password input field
And I select text "Option 03" from select field
And I write "comment of student" in Comment input field
And I click on "Option 1" button option
And I click on "Option 2" button option
And I click on "Option 3" button option
And I click on "Option 4" button option
Then All is ok