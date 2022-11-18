
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(className = ("popular-section"))
    WebElement popularSection;
    @FindBy(xpath=("//*[text()[contains(.,' Chikkamagaluru - Bengaluru')]]"))
    WebElement popularRoute;
    @FindBy(css = "a[class='carousel-control-next'][href='#routeSlider']")
    WebElement nextCarousalBtn;
    @FindBy(id=("ui-datepicker-div"))
    WebElement datePicker;
    @FindBy(xpath = "//td[contains(@class,'ui-datepicker-current-day ui-datepicker-today')]")
    WebElement currentDate;
    @FindBy(css = "button[class='btn btn-primary btn-lg btn-block btn-booking']")
    WebElement searchBTN;
    HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    void openKsrtc()
    {
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

    }

    void clickOnNextBtn()
    {
        nextCarousalBtn.click();
    }

    void clickOnPopularRoute()
    {
        popularRoute.click();
    }
    void clickOnCurrentDate()
    {
        currentDate.click();
    }
    void clickOnSearchBTN()
    {
        searchBTN.click();
    }
}
