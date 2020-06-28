package stepDefinations;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import testbase.testBase;
import testbase.testBase;
import pages.HomePage;
import pages.HotelListingPage;

public class StepDefination extends testBase    {
	
	WebDriver driver;
	
	HomePage objHomePage;
	HotelListingPage objHotelListingPage; 
	testBase testBaseObj=new testBase();
	
	@Before
	public void beforeScenario() throws Exception
	{	
		driver=testBaseObj.setup();
		String url=testBaseObj.readPropertiesFile("baseUrl");
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@After
	public void afterScenario() throws IOException {
		driver.close();
		}
	
	@Given("User is on booking.com website home page")
	public void user_is_on_booking_com_website_home_page() throws IOException, InterruptedException {
		// Verify user is on home page 
		
		objHomePage=new HomePage(driver);
		String homePageTitle = objHomePage.verifyHomePageTitle();
		objHomePage.acceptCookiePopUp();
		assertTrue(homePageTitle.contains("Official site"));
	}

	@Given("User select the booking details as location {string} with {int} adults {int} room and {int} childrens")
	public void user_select_the_booking_details_as_location_with_adults_room_and_childrens(String location, Integer adults, Integer rooms, Integer childrens) {
		
		objHomePage.setLocationDetails(location);
		objHomePage.getReservationDates();
		objHomePage.selectGuestDetails(adults, rooms, childrens);
	}
	
	@When("User search for the hotels")
	public void user_search_for_the_hotels() {
		objHomePage.getSearchButton();
	}

	@When("User is on hotel listing page")
	public void user_is_on_hotel_listing_page() {
		
		objHotelListingPage=new HotelListingPage(driver);
		String hotelPageTitle = objHotelListingPage.verifyHotelPageTitle();
		Assert.assertTrue(hotelPageTitle.contains("Book your hotel now!"));
	}

	@Then("User select filter {string} and Verify the hotel listing {string} {string}")
	public void user_select_filter_and_Verify_the_hotel_listing(String filterName, String hotel, String status) throws Exception {
	
		boolean bool = Boolean.parseBoolean(status);
		objHotelListingPage.selectFiler(filterName);
		objHotelListingPage.checkForHotel(hotel, bool);
		testBaseObj.takeSnapShot();
	}
}
