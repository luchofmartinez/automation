
Scenario: Open the application form

Given Join the web page http://automationcourse.herokuapp.com/crud.html
When click on button "Launch demo modal"
Then open the application form

Scenario: Complete the application form

Given the form is open
When i complete all the form fields
Then complete "Date to" field
And complete "Date from" field
And complete "Url" field
And complete "Alphanumeric" field
And complete "Numeric" field
And complete "Email" field
And complete "Password" field
And select a option in "Select" field
And select a image in "File" field
And complete "Comment" field

