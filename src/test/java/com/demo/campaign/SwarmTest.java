package com.demo.campaign;

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
public class SwarmTest extends BaseTest {

    @Test(description = "Create campaign test")
    public void swarmTest() {

        Pages.loginPage().typeEmail(Constants.EMAIL);

        Pages.loginPage().typePassword(Constants.PASSWORD);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.navigationPage().checkIfAuthorized(), Constants.ERROR_MESSAGE);

        Pages.campaignPage().createCampaign();

        Pages.campaignPage().typeName(Constants.CAMPAIGN_NAME);

        Pages.campaignPage().selectTypeOption("SWARM");

        Pages.campaignPage().clickStartButton();

        Assert.assertTrue(Pages.campaignPage().checkIfCreated(), Constants.ERROR_MESSAGE);

    }
}