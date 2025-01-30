package com.demo;

import com.demo.core.base.BaseTest;
import com.demo.pages.Pages;
import com.demo.utils.Constants;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Test Epic")
@Feature("Create campaign")
@Owner("QA Yuliia Drapushko")
public class ProspectTest extends BaseTest {

    @Test(description = "Create campaign test")
    public void prospectTest() {

        Pages.loginPage().typeEmail(Constants.EMAIL);

        Pages.loginPage().typePassword(Constants.PASSWORD);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.campaignPage().checkIfAuthorized(), "Error! Something went wrong. You were not authorized...");

        Pages.campaignPage().createCampaign();

        Pages.campaignPage().typeName("Campaign-1");

        Pages.campaignPage().selectTypeOption("Prospecting");

        Pages.campaignPage().clickStartButton();

        Assert.assertTrue(Pages.campaignPage().checkIfCreated(), "Error! Something went wrong. Campaign wasn`t created...");

    }
}