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
	WebElement acceptCookieDesign1;
	
	@FindBy(xpath="//*[@id='cookie_warning']/div/div/div[2]/button")
    WebElement acceptCookieDesign2;
	
	
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

    private void waitForVisibility(WebElement element) throws Error {
        new WebDriverWait(driver, 60)
             .until(ExpectedConditions.visibilityOf(element));
    }
 
    public void getCalenderCheckInLocator(){
        // Wait for txtBox to be visible, then send text
        waitForVisibility(checkInLocator);
        checkInLocator.click();
    }
    
    public void waitForCalendarToDisplay(){
        // Wait for txtBox to be visible, then send text
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
        // Wait for txtBox to be visible, then send text
        waitForVisibility(guestsInputsLocator);
        guestsInputsLocator.click();
    }
    
    public void waitForGguestInputsBox(){
        // Wait for txtBox to be visible, then send text
        waitForVisibility(guestInputsBox);
        
    }
    
    public void selectGuestInputsBoxIcon() {
    	
    	this.getGuestsInputsLocator();
    	this.waitForGguestInputsBox();
    }
    
    public void declineCookies() throws InterruptedException{
    	
    	Thread.sleep(500);
    	waitForVisibility(declineCookie);
    	declineCookie.click();
    }  

    public void acceptCookieDesignOne() throws InterruptedException{
    	
    	Thread.sleep(500);
    	waitForVisibility(acceptCookieDesign1);
    	acceptCookieDesign1.click();
    }
    
    public void acceptCookieDesignTwo() throws InterruptedException{
    	
    	Thread.sleep(500);
    	waitForVisibility(acceptCookieDesign2);
    	acceptCookieDesign2.click();
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

    public void getReservationDates() {
    	
    	this.selectCalenderIcon();
    	
    	 //Work out today and tomorrow
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
	    	    
	    			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    	driver.findElement(By.xpath("//div[@data-bui-ref='calendar-next']")).click();
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
    	
        // to select 2 Adults  
	    int theAdults=0;
	    do {
	    	
	    	WebElement adultDetail=driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[1]/div/div[2]/span[1]"));
		     theAdults=Integer.parseInt(adultDetail.getText());
		    
		    if(!(theAdults == adults)) {
		    	
		    	if(theAdults < adults) {
		    		WebElement incrementAdults=driver.findElement(By.xpath("//button[@aria-label='Increase number of Adults']"));
			    	incrementAdults.click();
			    		
		    	} else {
		    		WebElement decreaseAdults=driver.findElement(By.xpath("//button[@aria-label='Decrease number of Adults']"));
		    		decreaseAdults.click();
			    }
		    }
	    } while(!(theAdults == adults));
	
	    // to select 1 room  
	    int room=0;
	    do {
	    	
	    	WebElement roomDetails=driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[3]/div/div[2]/span[1]"));
	    	room=Integer.parseInt(roomDetails.getText());
		    
		    if(!(room == rooms)) {
		    	
		    	if(room < rooms) {
		    		WebElement incrementRooms=driver.findElement(By.xpath("//button[@aria-label='Increase number of Rooms']"));
		    		incrementRooms.click();
			    		
		    	} else {
		    		WebElement decreaseRooms=driver.findElement(By.xpath("//button[@aria-label='Decrease number of Rooms']"));
		    		decreaseRooms.click();
			    }
		    }
	    } while(!(room == rooms));
	    
	 // to select 1 room  
	    int children=0;
	    do {
	    	
	    	WebElement childrenDetails=driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[2]/div/div[2]/span[1]"));
	    	children=Integer.parseInt(childrenDetails.getText());
		    
		    if(!(children == childrens)) {
		    	
		    	if(children < childrens) {
		    		WebElement incrementChildren=driver.findElement(By.xpath("//button[@aria-label='Increase number of Children']"));
		    		incrementChildren.click();
			    		
		    	} else {
		    		WebElement decreaseChildren=driver.findElement(By.xpath("//button[@aria-label='Decrease number of Children']"));
		    		decreaseChildren.click();
			    }
		    }
	    } while(!(children == childrens));
	
    }
    
	private static void selectDate(WebDriver driver, LocalDate dateToSelect) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
	    WebDriverWait wait = new WebDriverWait(driver, 5, 5);
	    
	    By dateLocator = By.xpath(String.format("//td[@data-date='%s']", formatter.format(dateToSelect)));
	    //Wait for date element to be visible, then click on it
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