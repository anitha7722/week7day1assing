Feature: Login to the Leataps Application 

Scenario: Create Leads


And Type username as 'DemoSaleManager'
And Type password as 'crmsfa'
And Click Login Button 
And Click CRMSFA
And Click Create Leads
And Enter Company Name as <CompanyName>
And Enter First Name as <FirstName>
And Enter Last Name as <LastName>
And Click Submit
Then Verify login is Successfull


Examples:

|CompanyName|FristName|lastName|
|AathiraCons|ANitha|NAnu|