package org.example;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {
    ChromeDriver driver;

    public Registration () {
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver = new ChromeDriver();
        driver.get("https://web.facebook.com/");
    }
    public void testRegistration() {

        var createNewAccountButton = getCreateNewAccountButton();
        clickCreateNewAccountButton(createNewAccountButton);
        waitEvent();

        var firstNameElement = getFirstNameElement();
        setElementValue(firstNameElement,"Mennaz");

        var surNameElement = getSurNameElement();
        setElementValue(surNameElement,"Gamal");

        var mobileNumberOrEmailAddressElement = getMobileNumberOrEmailAddressElement();
        setElementValue(mobileNumberOrEmailAddressElement,"01012345678");

        var newPasswordElement = getNewPasswordElement();
        setElementValue(newPasswordElement,"M@g12345654321");

        SelectDayDateElement();
        SelectMonthDateElement();
        SelectYearDateElement();

        getGenderElement();

        var signUp = getSignUpButton();
        signUp.click();
    }

    private WebElement getCreateNewAccountButton()
    {
        return driver.findElementByXPath("//a[text()='Create New Account']");
    }

    private void clickCreateNewAccountButton(WebElement element)
    {
       element.click();
    }
    private void waitEvent ()
    {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
    }
    private WebElement getFirstNameElement() {
        return driver.findElementByName("firstname");
    }
    private WebElement getSurNameElement() {
        return driver.findElementByName("lastname");
    }
    private WebElement getMobileNumberOrEmailAddressElement() {
        return driver.findElementByName("reg_email__");
    }
    private WebElement getNewPasswordElement() {
        return driver.findElementByName("reg_passwd__");
    }

    private void SelectDayDateElement() {
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("20");
    }
    private void SelectMonthDateElement() {
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("10");
    }
    private void SelectYearDateElement() {
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("1996");
    }
private void getGenderElement()
{
    var gender = driver.findElementByClassName("_8esa");
    gender.click();
}

    private WebElement getSignUpButton()
    {
        return driver.findElementByXPath("//button[text()='Sign Up']");
    }

    private void clickSignUpButton(WebElement element)
    {
        element.click();
    }

    private void setElementValue(WebElement element, String value) {
        element.sendKeys(value);
    }
}