package com.demo.agent;

import com.demo.core.base.BaseTest;
import com.demo.pages.Pages;
import com.demo.utils.Constants;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;


@Epic("Test Epic")
@Feature("Update")
@Owner("QA Yulia Drapushko")
public class UpdateTest extends BaseTest {

    @Test(description = "Update Test")
    public void updateTest(){
        Pages.loginPage().typeEmail(Constants.EMAIL);

        Pages.loginPage().typePassword(Constants.PASSWORD);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.navigationPage().checkIfAuthorized(), "Error! Something went wrong...");

        Pages.agentsPage().open();

        Pages.agentsPage().clickSettingsButton();

        Pages.agentsPage().clickUpdateOption();

        Pages.agentsPage().typeFirstName(Constants.NEW_NAME);

        Pages.agentsPage().clickUpdateButton();

        Assert.assertTrue(Pages.agentsPage().checkIfUpdated(), "Error! Something went wrong...");
    }
}
