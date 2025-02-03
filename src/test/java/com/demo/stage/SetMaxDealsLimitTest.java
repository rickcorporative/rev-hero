package com.demo.stage;


//TODO: blocked by issue
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
@Feature("Set max deals limit")
@Owner("QA Yuliia Drapushko")
public class SetMaxDealsLimitTest extends BaseTest {

    @Test(description = "Set max deals limit test")
    public void setMaxDealsLimitTest() {
        Actions.loginActions().authorize(Constants.EMAIL, Constants.PASSWORD);

        Pages.navigationPage().clickEditCampaignButton(Constants.CAMPAIGN_NAME);

        Pages.navigationPage().clickAddStageButton();

        Pages.navigationPage().typeStageName(Constants.STAGE_NAME);

        Pages.navigationPage().clickNextButton();

        Pages.navigationPage().markEmailCheckbox();

        Pages.navigationPage().clickNextButton();

        Pages.navigationPage().clickSaveButton();

        Assert.assertTrue(!Pages.navigationPage().checkIfEmailStageCreated(), "Error! The stage was not added properly...");

        Pages.navigationPage().setMaxDealsLimit("30");

        Pages.navigationPage().clickSaveButton();

        Assert.assertTrue(Pages.navigationPage().checkIfSuccessful(), "Error! Max deals limit was not set properly...");

    }
}