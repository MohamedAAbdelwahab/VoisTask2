
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchResultsPage {
    WebDriver driver;
    @FindBy(xpath = ("(//input[@name='SrvcSelectBtnForward'])"))
    List<WebElement> searchResults;
    @FindBy(className = "availSeatClassS")
    List<WebElement> availableSeats;
    @FindBy(css = "li[class='p-2 Forward-boarding active1']")
    WebElement firstAvailableBoardingPoint;
    @FindBy(css = "li[class='p-2 Forward-droping']")
    WebElement firstAvailableDroppingPoint;
    @FindBy(name = "mobileNo")
    WebElement customerMobileNumber;
    @FindBy(name = "email")
    WebElement customerEmail;
    @FindBy(name = "passengerName")
    WebElement passengerName;
    @FindBy(name = "genderCodeId")
    WebElement gender;
    @FindBy(name="passengerAge")
    WebElement passengerAge;
    @FindBy(name = "concessionIds")
    WebElement concession;
    @FindBy(id="PgBtn")
    WebElement makePayment;
    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    void selectFirstSearchResult() {
        for (WebElement element : searchResults) {
            if (element.isDisplayed()) {
                element.click();
                break;
            }
        }
    }

    void selectFirstAvailableSeat() {
        availableSeats.get(0).click();

    }

    void chooseFirstAvailableBoardingPoint() {
        firstAvailableBoardingPoint.click();
    }

    void chooseFirstAvailableDroppingPoint() {
        firstAvailableDroppingPoint.click();
    }

    void enterCustomerMobileNumber(String mobile) {
        customerMobileNumber.sendKeys(mobile);
    }

    void enterCustomerEmail(String email) {
        customerEmail.sendKeys(email);
    }

    void enterPassengerName(String name) {
        passengerName.sendKeys(name);
    }

    void enterPassengerAge(String age) {
        passengerAge.sendKeys(age);
    }

    void selectPassengerGender(int index) {
        Select genderSelector=new Select(gender);
        genderSelector.selectByIndex(index);
    }

    void selectConcession(int index) {
        Select concessionSelector=new Select(concession);
        concessionSelector.selectByIndex(index);
    }

    void clickOnMakePayment()
    {
        makePayment.click();
    }



}
