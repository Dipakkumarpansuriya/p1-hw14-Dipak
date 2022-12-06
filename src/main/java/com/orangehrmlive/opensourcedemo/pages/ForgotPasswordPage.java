package com.orangehrmlive.opensourcedemo.pages;

import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {
    By forgotPasswordLink = By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']");
    By resetPasswordTitle = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");

    public void clickOnForgotPasswordLink(){
        clickOnElement(forgotPasswordLink);
    }
    public String getResetPasswordMessage(){
        return getTextFromElement(resetPasswordTitle);
    }

}
