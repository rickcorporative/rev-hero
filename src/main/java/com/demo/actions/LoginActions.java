package com.demo.actions;

import com.demo.pages.Pages;
import com.demo.utils.Constants;

public class LoginActions {

    public void authorize(String email, String password){
        Pages.loginPage().typeEmail(email);

        Pages.loginPage().typePassword(password);

        Pages.loginPage().clickLoginButton();
    }

}
