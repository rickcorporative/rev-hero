package com.demo.pages;

import com.demo.core.base.PageTools;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageTools {
    private By emailField = By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//span[text()='Login']");

    @Step("Check if logged out")
    public boolean checkIfLoggedOut(){
        waitForElementVisibility(loginButton);
        return isElementVisible(loginButton);
    }

    @Step("Set email")
    public void typeEmail(String value){
        type(value,emailField);
    }

    @Step("Set password")
    public void typePassword(String value){
        type(value, passwordField);
    }

    @Step("Click login button")
    public void clickLoginButton(){
        click(loginButton);
    }


}
