package com.demo.campaign;

import com.demo.actions.Actions;
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
public class OutcomeTest extends BaseTest {

    @Test(description = "Create campaign test")
    public void outcomeTest() {

        Actions.loginActions().authorize(Constants.EMAIL, Constants.PASSWORD);

        Pages.campaignPage().createCampaign();

        Pages.campaignPage().typeName(Constants.CAMPAIGN_NAME);

        Pages.campaignPage().selectTypeOption("Outcome");

        Pages.campaignPage().clickStartButton();

        Assert.assertTrue(Pages.campaignPage().checkIfCreated(), "Error! Outcome campaign was not added...");

    }
}