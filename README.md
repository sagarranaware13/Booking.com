# Booking.com
Kneat - Automation Code Challenge

Kneat - Automation Code Challenge

Information
I have created framework using java and cucumber to automate the tests for the http://booking.com and tested their search filters using dynamic data driven tests created in BDD format.

Technologies used: 
Language: Java 
Design pattern: POM (Page object model)
Tools: Selenium WebDriver 
Framework: BDD

Framework 
The framework designed and packages used explained below.
Src/main/java – It contains the java code which will support our framework.
Packages: 
1.	Test base:- Help us to drive the test case or it is foundation of test case.
a.	Setup (): This method will read the data from properties file and lunch the browser needed for execution as per users choice.
b.	readPropertiesFile(): This is generic method used to read the data from properties file. It will read the data based on key passed.
c.	takeSnapShot(): This method is used to take screen shots.
  
2.	config.properties:- 
a.	global.properties :- This file contains Parameters of the framework that are common like browser, URL, username, password. 
3.	Pages(POM): - Page classes to store elements and actions on elements
a.	Page Factory: HomePage and HotelListingPage are the classed used. This is designed as per page factory design pattern.
4.	Screenshot: screenshot taken during the tests are stored in this package.

Src/test/java- It contains features and step definitions file with runner class.
Packages: 
1.	cucumber.Options():-  This is cucumber runner file from where the execution of the framework started. Please execute this file to run the framework. 
2.	Features: In this package with main cucumber feature is written with one scenario running multiple time using scenario outline.
a.	The test is data driven and used scenario outline to run tests with multiple set of data.
b.	The test is design so dynamic that booking can be done for any no of guests, rooms and days by changing the parameter in example table.
3.	stepDefinations():- 
a.	The actual code to support the test execution is written here 
4.	Reports: The HTML report is generated using “html:target/cucumber-reports” plugin.
a.	Index.html()- The html report is saved in “\target\cucumber-reports” folder.

Other:
1: POM(Maven) :- The maven is used to manage dependency and build the framework.  
2: Junit(Hooks):- Junit hooks like before and after are used to do unit testing and reporting.
3: WebDriverManager: WebDriverManager is a library which allows to automate the management of the binary drivers (e.g. chromedriver, geckodriver, etc.)
 
NOTE: The functions or utilities are written to support the tests. 
1: getReservationDates():  To select the date of 3 months from todays date.
2: selectGuestDetails(): To select the guest details dynamically. 
3: waitForPageLoaded(): To wait for page to load.


Deliverables:
•	A solution with a set of passing tests
•	Git hub link:  https://github.com/sagarranaware13/Booking.com
•	ReadMe file

Sample Data

Location: Limerick
Dates: One night stay (3 months from today’s date)
Number of People: 2 adults
Room: 1 Room

Results:
Select Filter	Hotel Name	Is Listed
Sauna	Limerick Strand Hotel	True
Sauna	George Limerick Hotel	False
5 Star	The Savoy Hotel	True
5 Star	George Limerick Hotel	False
