package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {
    public static void main(String[] args) {

        var loginManager = new Login();
        loginManager.testLogin();

        var registrationManager = new Registration();
        registrationManager.testRegistration();

    }
}