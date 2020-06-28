Feature: Validating Place API's

@Test 
Scenario Outline: Verify booking.com search filters with some new options added
	Given User is on booking.com website home page
	And User select the booking details as location "Limerick" with 2 adults 1 room and 0 childrens
	When User search for the hotels
	And User is on hotel listing page
	Then User select filter "<Filter name>" and Verify the hotel listing "<Hotel Name>" "<Is Listed>"
	
Examples:
	| Filter name | Hotel Name | Is Listed |
	| Sauna | Limerick Strand Hotel | True |
	| Sauna | George Limerick Hotel | False |
	| 5 stars | The Savoy Hotel | True |
	| 5 stars | George Limerick Hotel | False |