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
public class EditTest extends BaseTest {

    @Test(description = "Edit stage test")
    public void editTest(){
        Pages.loginPage().typeEmail(Constants.EMAIL);

        Pages.loginPage().typePassword(Constants.PASSWORD);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.navigationPage().checkIfAuthorized(), Constants.ERROR_MESSAGE);

        Pages.navigationPage().clickEditCampaignButton(Constants.CAMPAIGN_NAME);

        Pages.navigationPage().clickEditStageButton(Constants.STAGE_NAME);

        Pages.navigationPage().typeNewStageName(Constants.NEW_NAME);

        Pages.navigationPage().clickNextButton();

        Pages.navigationPage().clickNextButton();

        Pages.navigationPage().clickSaveButton();

        Assert.assertTrue(Pages.navigationPage().checkIfSuccessful(), Constants.ERROR_MESSAGE);

    }
}
