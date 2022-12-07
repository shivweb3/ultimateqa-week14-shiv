package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnSignInLink();
        Assert.assertEquals(loginPage.getWelcomeText(),"Welcome","Welcome Text not found/ Not Sign In Page");
    }

    @Test
    public void verifyTheErrorMessage() {
        homePage.clickOnSignInLink();
        loginPage.enterEmail("shiv123");
        loginPage.enterPassword("test123");
        loginPage.clickOnSignInButton();
        Assert.assertEquals(loginPage.getErrorMessage(),"Invalid email or password.","Error message not found");
    }
}
