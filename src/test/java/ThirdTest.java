import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ThirdTest extends BaseTest {
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    BankPage bankPage;

    @Test(priority = 1)
    void openKsrtc() {
        homePage = new HomePage(driver);
        homePage.openKsrtc();

    }

    @Test(priority = 2)
    void choosePopularRoute() {
        util.scrollToElementUsingJs(homePage.popularSection);
        homePage.clickOnNextBtn();
        homePage.clickOnPopularRoute();
    }

    @Test(priority = 3)
    void pickADate() {
        util.scrollToElementUsingJs(homePage.datePicker);
        homePage.clickOnCurrentDate();

    }

    @Test(priority = 4)
    void clickOnSearchBTN() {
        util.scrollToElementUsingJs(homePage.searchBTN);
        homePage.clickOnSearchBTN();

    }

    @Test(priority = 5)
    void selectFirstSearchResult() {
        searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.selectFirstSearchResult();

    }

    @Test(priority = 6)
    void enterPassengerData() {
        util.scrollToElementUsingJs(driver.findElement(By.xpath("//*[text()[contains(.,'Total Fare Details')]]")));
        searchResultsPage.selectFirstAvailableSeat();
        searchResultsPage.chooseFirstAvailableBoardingPoint();
        searchResultsPage.chooseFirstAvailableDroppingPoint();
        searchResultsPage.enterCustomerMobileNumber("6789125987");
        searchResultsPage.enterCustomerEmail("test@test.com");
        util.scrollToElementUsingJs(searchResultsPage.passengerName);
        searchResultsPage.enterPassengerName("Test");
        searchResultsPage.selectPassengerGender(1);
        searchResultsPage.enterPassengerAge("17");
        searchResultsPage.selectConcession(1);
        searchResultsPage.clickOnMakePayment();
    }

    @Test(priority = 7)
    void enterPaymentData() {
        bankPage = new BankPage(driver);
        bankPage.enterCardNumber("5123-4500-0000-008");
        bankPage.selectPassengerGender(1);
        bankPage.selectConcession(1);
        bankPage.enterCvv2("100");
        bankPage.enterCardHolderName("Test");

    }

}
