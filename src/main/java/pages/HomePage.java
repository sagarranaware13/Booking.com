package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver){
		this.driver = driver;
        PageFactory.initElements(driver, this); 
       }

	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']")
	WebElement acceptCookieDesignOne;
	
	@FindBy(xpath="//*[@id='cookie_warning']/div/div/div[2]/button")
    WebElement acceptCookieDesignTwo;
	
    @FindBy(xpath="//button[@id='onetrust-reject-all-handler']")
    WebElement declineCookie;
    
    @FindBy(xpath="//div[@id='onetrust-banner-sdk']")
    List<WebElement> theAcceptCookiePopUp;

    @FindBy(xpath="//input[@type='search']")
    WebElement location;

    @FindBy(xpath="//div[contains(@class, 'b-datepicker')][@data-mode='checkin']")
    WebElement checkInLocator;

    @FindBy(css = ".bui-calendar__content")
    WebElement calendarLocator;

    @FindBy(xpath="//label[@id='xp__guests__toggle']")
    WebElement guestsInputsLocator;

    @FindBy(css = "#xp__guests__inputs-container")
    WebElement guestInputsBox;

    @FindBy(xpath="//span[contains(text(),'Search')]")
    WebElement searchButton;

    @FindBy(xpath = "//div[@data-bui-ref='calendar-next']")
    WebElement calenderNextMonth;
    
    @FindBy(xpath="//*[@id='xp__guests__inputs-container']/div/div/div[3]/div/div[2]/span[1]")
    WebElement presentRoomCount;
    
    @FindBy(xpath = "//button[@aria-label='Increase number of Rooms']")
	WebElement incrementTheRoom;
	
    @FindBy(xpath = "//button[@aria-label='Decrease number of Rooms']")
	WebElement decreaseTheRoom;
	
    @FindBy(xpath="//*[@id='xp__guests__inputs-container']/div/div/div[2]/div/div[2]/span[1]")
    WebElement presentChildrenCount;
    
    @FindBy(xpath = "//button[@aria-label='Increase number of Children']")
	WebElement incrementTheChildren;
	
    @FindBy(xpath = "//button[@aria-label='Decrease number of Children']")
	WebElement decreaseTheChildren;
	
    @FindBy(xpath="//*[@id='xp__guests__inputs-container']/div/div/div[1]/div/div[2]/span[1]")
    WebElement presentGuestCount;
    
    @FindBy(xpath = "//button[@aria-label='Increase number of Adults']")
	WebElement incrementTheAdult;
	
    @FindBy(xpath = "//button[@aria-label='Decrease number of Adults']")
	WebElement decreaseTheAdult;
	
	public void incrementChildren() {
		waitForVisibility(incrementTheChildren);
		incrementTheChildren.click();
	}
	
	public void decreaseChildren() {
		waitForVisibility(decreaseTheChildren);
		decreaseTheChildren.click();
	}
	
    public String GetPresentChildrenCount() {
    	waitForVisibility(presentChildrenCount);
    	return presentChildrenCount.getText();
    }
   
	public void incrementAdult() {
		waitForVisibility(incrementTheAdult);
		incrementTheAdult.click();
	}
	
	public void decreaseAdults() {
		waitForVisibility(decreaseTheAdult);
		decreaseTheAdult.click();
	}
	
    public String getPresentGuestCount() {
    	waitForVisibility(presentGuestCount);
    	return presentGuestCount.getText();
    }
    
    public void incrementRooms() {
		waitForVisibility(incrementTheRoom);
		incrementTheRoom.click();
	}
	
	public void decreaseRooms() {
		waitForVisibility(decreaseTheRoom);
		decreaseTheRoom.click();
	}
	
    public String getPresentRoomCount() {
    	waitForVisibility(presentRoomCount);
    	return presentRoomCount.getText();
    }
    public void getCalenderNextMonth() {
    	waitForVisibility(calenderNextMonth);
    	calenderNextMonth.click();
    }
    void waitForVisibility(WebElement element) throws Error {
        new WebDriverWait(driver, 60)
             .until(ExpectedConditions.visibilityOf(element));
    }
 
    public void getCalenderCheckInLocator(){
        waitForVisibility(checkInLocator);
        checkInLocator.click();
    }
    
    public void waitForCalendarToDisplay(){
        waitForVisibility(calendarLocator);
    }
    
    public void selectCalenderIcon() {
    	this.getCalenderCheckInLocator();
    	this.waitForCalendarToDisplay();
    }
    
    public void getSearchButton(){
    	searchButton.click();
    	waitForPageLoaded(driver);
    }
    
    public void getGuestsInputsLocator(){
        waitForVisibility(guestsInputsLocator);
        guestsInputsLocator.click();
    }
    
    public void waitForGguestInputsBox(){
        waitForVisibility(guestInputsBox);
    }
    
    public void selectGuestInputsBoxIcon() {
    	this.getGuestsInputsLocator();
    	this.waitForGguestInputsBox();
    }
    
    public void declineCookies() throws InterruptedException{
    	waitForVisibility(declineCookie);
    	declineCookie.click();
    }  

    public void acceptCookieDesignOne() throws InterruptedException{
    	waitForVisibility(acceptCookieDesignOne);
    	acceptCookieDesignOne.click();
    }
    
    public void acceptCookieDesignTwo() throws InterruptedException{
    	waitForVisibility(acceptCookieDesignTwo);
    	acceptCookieDesignTwo.click();
    }
    
    public void acceptCookiePopUp() throws InterruptedException{
    	
    	if(theAcceptCookiePopUp.size() !=0) {
    		this.acceptCookieDesignOne();
    	
    	} else {
    		this.acceptCookieDesignTwo();
    		
    	}
      }  
    
    public String verifyHomePageTitle(){
    	waitForPageLoaded(driver);
    	return driver.getTitle();
    }

    public void setLocation(String setLocation){
    	location.sendKeys(setLocation);
    	
    }
    
    public void setLocationDetails(String setLocation){

    	this.setLocation(setLocation);
    }

    // this method is used to select date 
    public void getReservationDates() {
    	
    	this.selectCalenderIcon();
    	
    	LocalDate today = LocalDate.now();
	    LocalDate reservationStartDate = today.plusMonths(3);
	    LocalDate reservationEndDate=reservationStartDate.plusDays(1);
	    
	    String reservationStart=reservationStartDate.getMonth().toString().toLowerCase();
	    String reservationStartMonth = reservationStart.substring(0, 1).toUpperCase() + reservationStart.substring(1);
	    
	    List<WebElement> nextMonthSelection;
	    try {
	    	do {
	    		nextMonthSelection=driver.findElements(By.xpath("//div[contains(text(),'"+reservationStartMonth+"')]"));
	    		if(nextMonthSelection.size() < 1) {
	    	    	
	    			this.getCalenderNextMonth();
				}
		    } while(nextMonthSelection.size() < 1); 
		    
	    } catch (NoSuchElementException e) {
			System.out.println("The month of reservation is not found");
		}
	    //Use selectDate method to click on the relevant dates
	    selectDate(driver, reservationStartDate);
	    selectDate(driver, reservationEndDate);
    }
    
    public void selectGuestDetails(int adults, int rooms, int childrens ) {
    	this.selectGuestInputsBoxIcon();
    
    	int theAdults=0;
	    do {
	    	
	    	String adultDetail=getPresentGuestCount();
		     theAdults=Integer.parseInt(adultDetail);
		    
		    if(!(theAdults == adults)) {
		    	
		    	if(theAdults < adults) {
		
		    		incrementAdult();
			    		
		    	} else {
		    		
		    		decreaseAdults();
			    }
		    }
	    } while(!(theAdults == adults));
	
	   int room=0;
	    do {
	    	
	    	String roomDetails=getPresentRoomCount();
	    	room=Integer.parseInt(roomDetails);
		    
		    if(!(room == rooms)) {
		    	
		    	if(room < rooms) {
		    		
		    		incrementRooms();	
		    	} else {
		    		decreaseRooms();
		    	
		    	}
		    }
	    } while(!(room == rooms));
	    
	    int children=0;
	    do {
	    	
	    	String childrenDetails=GetPresentChildrenCount();
	    	children=Integer.parseInt(childrenDetails);
		    
		    if(!(children == childrens)) {
		    	
		    	if(children < childrens) {
		    		incrementChildren();
			    		
		    	} else {
		    		decreaseChildren();
		    		
			    }
		    }
	    } while(!(children == childrens));
    }
    
	private static void selectDate(WebDriver driver, LocalDate dateToSelect) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
	    WebDriverWait wait = new WebDriverWait(driver, 5, 5);
	    
	    By dateLocator = By.xpath(String.format("//td[@data-date='%s']", formatter.format(dateToSelect)));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(dateLocator)).click();
		}
	
	public static void waitForPageLoaded(WebDriver driver) {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait1 = new WebDriverWait(driver, 30);
            wait1.until(expectation);
        } catch (Throwable error) {
            
        }
    }
  }