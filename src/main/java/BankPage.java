
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BankPage {
    WebDriver driver;
    @FindBy(id = ("cnumber"))
    WebElement cardNumberInputField;
    @FindBy(id = ("expmon"))
    WebElement month;
    @FindBy(id = "expyr")
    WebElement year;
    @FindBy(id = "cvv2")
    WebElement cvv2;
    @FindBy(id = "cname2")
    WebElement cardHolderName;


    public BankPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    void enterCardNumber(String cardNumber) {
        cardNumberInputField.sendKeys(cardNumber);
    }

    void enterCvv2(String cvv2Value) {
        cvv2.sendKeys(cvv2Value);
    }

    void enterCardHolderName(String name) {
        cardHolderName.sendKeys(name);
    }



    void selectPassengerGender(int index) {
        Select monthSelector = new Select(month);
        monthSelector.selectByIndex(index);
    }

    void selectConcession(int index) {
        Select yearSelector = new Select(year);
        yearSelector.selectByIndex(index);
    }





}
