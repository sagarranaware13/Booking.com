package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HotelListingPage {

	 WebDriver driver;
	 
	 @FindBy(xpath="//span[contains(text(),'Sauna')]")
     WebElement filterSauna;

	 @FindBy(xpath="//span[contains(text(),'5 stars')]")
     WebElement filterStar;

	 public HotelListingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

	 public void selectFiler(String filterName) {
	
		 WebElement element = driver.findElement(By.xpath("//span[contains(text(),'"+filterName+"')]"));
		 waitForVisibility(element);
		 element.click();
		 HotelListingPage.waitForPageLoaded(driver);
		
	 }
	 
	 public String verifyHotelPageTitle(){

		 waitForPageLoaded(driver);
		 return driver.getTitle();
	  }
	 
    private void waitForVisibility(WebElement element) throws Error {
        new WebDriverWait(driver, 60)
             .until(ExpectedConditions.visibilityOf(element));
    }
 
    public void getFilter(String filterName){
        // Wait for txtBox to be visible, then send text
        waitForVisibility(filterSauna);
        filterSauna.click();
        waitForPageLoaded(driver);
     }

    public void getFilterStar(){
        // Wait for txtBox to be visible, then send text
        waitForVisibility(filterStar);
        filterStar.click();
        waitForPageLoaded(driver);
        
     }
    
    public void checkForHotel(String hotel, boolean status) throws Exception {
		
		List<WebElement> list=driver.findElements(By.cssSelector(".sr-hotel__name"));
	    
		for(WebElement ele:list) {
			
	    	String hotelName=ele.getText();
	    	if(hotelName.equalsIgnoreCase(hotel)) {
	    
	    		status=true;
	    		System.out.println("Hotel is present and verified =  "+hotelName+ "  Is Listed = "+status);
	    		break;
	    		
	    	} else {
	    		
	    		status=false;
	    		
	    	}
	    	
	    }
		
		if(status==false) {
			
			System.out.println("Hotel is not present = "+hotel+ "   Is Listed = " + status);
			
		}
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