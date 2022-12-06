package com.orangehrmlive.opensourcedemo.testbase.testsuite;

import com.orangehrmlive.opensourcedemo.pages.ForgotPasswordPage;
import com.orangehrmlive.opensourcedemo.testbase.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordPageTest extends BaseTest {
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPasswordPage.clickOnForgotPasswordLink();
        String expectedMessage  = "Reset Password";
        Assert.assertEquals(forgotPasswordPage.getResetPasswordMessage(),expectedMessage,"Not matching message");
    }

}
