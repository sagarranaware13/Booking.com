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
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on WINDOWS (efb7450a452ac927db7bf902bb3a8a83)] -\u003e xpath: //span[contains(text(),\u0027Sauna\u0027)]] (tried for 60 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-J4HH40MP\u0027, ip: \u0027192.168.0.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\hp\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:57457}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: efb7450a452ac927db7bf902bb3a8a83\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:113)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:283)\r\n\tat pages.HotelListingPage.waitForVisibility(HotelListingPage.java:48)\r\n\tat pages.HotelListingPage.selectFiler(HotelListingPage.java:34)\r\n\tat stepDefinations.StepDefination.user_select_filter_and_Verify_the_hotel_listing(StepDefination.java:85)\r\n\tat ✽.User select filter \"Sauna\" and Verify the hotel listing \"Limerick Strand Hotel\" \"True\"(file:src/test/java/features/filterTesting.feature:9)\r\n",
  "status": "failed"
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
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on WINDOWS (230ab98cb215d7fc89c6d7e8c84225d4)] -\u003e xpath: //span[contains(text(),\u0027Sauna\u0027)]] (tried for 60 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-J4HH40MP\u0027, ip: \u0027192.168.0.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\hp\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:57622}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 230ab98cb215d7fc89c6d7e8c84225d4\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:113)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:283)\r\n\tat pages.HotelListingPage.waitForVisibility(HotelListingPage.java:48)\r\n\tat pages.HotelListingPage.selectFiler(HotelListingPage.java:34)\r\n\tat stepDefinations.StepDefination.user_select_filter_and_Verify_the_hotel_listing(StepDefination.java:85)\r\n\tat ✽.User select filter \"Sauna\" and Verify the hotel listing \"George Limerick Hotel\" \"False\"(file:src/test/java/features/filterTesting.feature:9)\r\n",
  "status": "failed"
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