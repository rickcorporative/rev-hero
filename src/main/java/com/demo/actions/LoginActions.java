package com.demo.actions;

import com.demo.pages.Pages;
import org.testng.Assert;


public class LoginActions {

    public void authorize(String email, String password){
        Pages.loginPage().typeEmail(email);

        Pages.loginPage().typePassword(password);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.navigationPage().checkIfAuthorized(), "Error! Something is wrong. You were not logged in...");
    }

}
