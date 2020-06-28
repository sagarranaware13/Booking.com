$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/filterTesting.feature");
formatter.feature({
  "name": "Validating Place API\u0027s",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify booking.com search filters with some new options added",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "User is on booking.com website home page",
  "keyword": "Given "
});
formatter.step({
  "name": "User select the booking details as location \"Limerick\" with 2 adults 1 room and 0 childrens",
  "keyword": "And "
});
formatter.step({
  "name": "User search for the hotels",
  "keyword": "When "
});
formatter.step({
  "name": "User is on hotel listing page",
  "keyword": "And "
});
formatter.step({
  "name": "User select filter \"\u003cFilter name\u003e\" and Verify the hotel listing \"\u003cHotel Name\u003e\" \"\u003cIs Listed\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Filter name",
        "Hotel Name",
        "Is Listed"
      ]
    },
    {
      "cells": [
        "Sauna",
        "Limerick Strand Hotel",
        "True"
      ]
    },
    {
      "cells": [
        "Sauna",
        "George Limerick Hotel",
        "False"
      ]
    },
    {
      "cells": [
        "5 stars",
        "The Savoy Hotel",
        "True"
      ]
    },
    {
      "cells": [
        "5 stars",
        "George Limerick Hotel",
        "False"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify booking.com search filters with some new options added",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on booking.com website home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_on_booking_com_website_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the booking details as location \"Limerick\" with 2 adults 1 room and 0 childrens",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_select_the_booking_details_as_location_with_adults_room_and_childrens(String,Integer,Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for the hotels",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_search_for_the_hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on hotel listing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_is_on_hotel_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select filter \"Sauna\" and Verify the hotel listing \"Limerick Strand Hotel\" \"True\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_select_filter_and_Verify_the_hotel_listing(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify booking.com search filters with some new options added",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on booking.com website home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_on_booking_com_website_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the booking details as location \"Limerick\" with 2 adults 1 room and 0 childrens",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_select_the_booking_details_as_location_with_adults_room_and_childrens(String,Integer,Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for the hotels",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_search_for_the_hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on hotel listing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_is_on_hotel_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select filter \"Sauna\" and Verify the hotel listing \"George Limerick Hotel\" \"False\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_select_filter_and_Verify_the_hotel_listing(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify booking.com search filters with some new options added",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on booking.com website home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_on_booking_com_website_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the booking details as location \"Limerick\" with 2 adults 1 room and 0 childrens",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_select_the_booking_details_as_location_with_adults_room_and_childrens(String,Integer,Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for the hotels",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_search_for_the_hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on hotel listing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_is_on_hotel_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select filter \"5 stars\" and Verify the hotel listing \"The Savoy Hotel\" \"True\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_select_filter_and_Verify_the_hotel_listing(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify booking.com search filters with some new options added",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on booking.com website home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_on_booking_com_website_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the booking details as location \"Limerick\" with 2 adults 1 room and 0 childrens",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_select_the_booking_details_as_location_with_adults_room_and_childrens(String,Integer,Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for the hotels",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_search_for_the_hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on hotel listing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_is_on_hotel_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select filter \"5 stars\" and Verify the hotel listing \"George Limerick Hotel\" \"False\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_select_filter_and_Verify_the_hotel_listing(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});