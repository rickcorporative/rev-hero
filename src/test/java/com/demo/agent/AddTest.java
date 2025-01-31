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
@Feature("Add agent")
@Owner("QA Yulia Drapushko")
public class AddTest extends BaseTest {

    @Test(description = "Add agent Test")
    public void addTest(){
        Pages.loginPage().typeEmail(Constants.EMAIL);

        Pages.loginPage().typePassword(Constants.PASSWORD);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.navigationPage().checkIfAuthorized(), Constants.ERROR_MESSAGE);

        Pages.agentsPage().open();

        Pages.agentsPage().clickAddNewAgentButton();

        Pages.agentsPage().typeFirstName(Constants.NEW_NAME);

        Pages.agentsPage().typeLastName(Constants.NEW_NAME);

        Pages.agentsPage().clickCreateButton();

        Assert.assertTrue(Pages.navigationPage().checkIfSuccessful(), Constants.ERROR_MESSAGE);

    }
}
