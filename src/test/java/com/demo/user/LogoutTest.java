package com.demo.user;

import com.demo.core.base.BaseTest;
import com.demo.pages.Pages;
import com.demo.utils.Constants;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;


@Epic("Test Epic")
@Feature("Logout")
@Owner("QA Yulia Drapushko")
public class LogoutTest extends BaseTest {

    @Test(description = "Logout Test")
    public void logoutTest() {

        Pages.loginPage().typeEmail(Constants.EMAIL);

        Pages.loginPage().typePassword(Constants.PASSWORD);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.navigationPage().checkIfAuthorized(), "Error! You were not authorized...");

        Pages.navigationPage().clickLogOutButton();

        Assert.assertTrue(Pages.loginPage().checkIfLoggedOut(), "Error! You are still in your account...");
    }
}