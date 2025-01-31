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
@Feature("Delete")
@Owner("QA Yulia Drapushko")
public class DeleteTest extends BaseTest {

    @Test(description = "Delete Test")
    public void deleteTest(){
        Pages.loginPage().typeEmail(Constants.EMAIL);

        Pages.loginPage().typePassword(Constants.PASSWORD);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.navigationPage().checkIfAuthorized(), Constants.ERROR_MESSAGE);

        Pages.agentsPage().open();

        Pages.agentsPage().clickSettingsButton();

        Pages.agentsPage().clickDeleteOption();

        Assert.assertTrue(Pages.agentsPage().checkIfDeleted(), Constants.ERROR_MESSAGE);
    }
}
