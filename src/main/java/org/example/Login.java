package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    ChromeDriver driver;

    public Login() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver = new ChromeDriver();
        driver.get("https://web.facebook.com/");
    }

    public void testLogin() {
        var emailElement = getEmailElement();
        var passwordElement = getPasswordElement();

        setElementValue(emailElement,"tlvhischfc_1655644090@tfbnw.net");
        setElementValue(passwordElement,"123454321@mg");

        var loginButton = driver.findElementByXPath("//button[text()='Log In']");
        loginButton.click();
    }

    private WebElement getPasswordElement() {
        return driver.findElementById("pass");
    }

    private WebElement getEmailElement() {
        return driver.findElementById("email");
    }

    private void setElementValue(WebElement element, String value) {
        element.sendKeys(value);
    }


}
