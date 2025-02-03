package com.demo.stage;

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
@Feature("Delete stage")
@Owner("QA Yuliia Drapushko")
public class DeleteTest extends BaseTest {

    @Test(description = "Delete stage test")
    public void deleteTest(){
        Actions.loginActions().authorize(Constants.EMAIL, Constants.PASSWORD);

        Pages.navigationPage().clickEditCampaignButton(Constants.CAMPAIGN_NAME);

        Pages.navigationPage().clickDeleteButton(Constants.STAGE_NAME);

        Assert.assertTrue(!Pages.navigationPage().checkIfDeleted(), "Error! The stage was not deleted...");


    }
}
