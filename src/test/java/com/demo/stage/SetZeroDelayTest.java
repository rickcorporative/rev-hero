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
@Feature("Set delay to zero")
@Owner("QA Yuliia Drapushko")
public class SetZeroDelayTest extends BaseTest {

    @Test(description = "Set zero delay test")
    public void setZeroDelayTest() {
        Actions.loginActions().authorize(Constants.EMAIL, Constants.PASSWORD);

        Pages.navigationPage().clickEditCampaignButton(Constants.CAMPAIGN_NAME);

        Pages.navigationPage().clickAddStageButton();

        Pages.navigationPage().typeStageName(Constants.STAGE_NAME);

        Pages.navigationPage().clickNextButton();

        Pages.navigationPage().markEmailCheckbox();

        Pages.navigationPage().clickNextButton();

        Pages.navigationPage().clickSaveButton();

        Assert.assertTrue(!Pages.navigationPage().checkIfEmailStageCreated(), "Error! The stage was not added properly...");

        Pages.navigationPage().setDelay("0");

        Pages.navigationPage().clickSaveButton();

        Assert.assertTrue(Pages.navigationPage().checkIfSuccessful(), "Error! The delay was not added properly...");

    }
}