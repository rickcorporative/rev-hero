package com.demo.pages;

import com.demo.core.base.PageTools;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class NavigationPage extends PageTools {
    private static By logoutButton = By.xpath("//a[@data-testid='logout']");


    @Step("Check if authorized")
    public boolean checkIfAuthorized(){
        waitForElementVisibility(logoutButton);
        return isElementVisible(logoutButton);
    }



    @Step("click logout button")
    public void clickLogOutButton(){
        click(logoutButton);
    }


}
