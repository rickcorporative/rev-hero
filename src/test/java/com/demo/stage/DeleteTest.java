package com.demo.stage;

import com.demo.core.base.BaseTest;
import com.demo.pages.Pages;
import com.demo.utils.Constants;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;


@Epic("Test Epic")
@Feature("Edit stage")
@Owner("QA Yuliia Drapushko")
public class DeleteTest extends BaseTest {

    @Test(description = "Edit stage test")
    public void editTest(){
        Pages.loginPage().typeEmail(Constants.EMAIL);

        Pages.loginPage().typePassword(Constants.PASSWORD);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.navigationPage().checkIfAuthorized(), "Error! Something went wrong...");

        Pages.navigationPage().clickEditCampaignButton();

        Pages.navigationPage().clickDeleteButton();

        Assert.assertTrue(!Pages.navigationPage().checkIfDeleted(), "Error! Something went wrong...");


    }
}
