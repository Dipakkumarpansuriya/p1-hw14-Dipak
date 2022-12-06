package com.orangehrmlive.opensourcedemo.pages;

import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By headerTitleDashboard = By.xpath("//h6[text() = 'Dashboard']");

    public void enterUsername() {
        sendTextToElement(usernameField, "Admin");
    }

    public void enterPassword() {
        sendTextToElement(passwordField, "admin123");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getHeaterTitleDashboard() {
        return getTextFromElement(headerTitleDashboard);

    }


}

