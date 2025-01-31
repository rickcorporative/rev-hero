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
@Feature("Delete stage")
@Owner("QA Yuliia Drapushko")
public class DeleteTest extends BaseTest {

    @Test(description = "Delete stage test")
    public void deleteTest(){
        Pages.loginPage().typeEmail(Constants.EMAIL);

        Pages.loginPage().typePassword(Constants.PASSWORD);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.navigationPage().checkIfAuthorized(), Constants.ERROR_MESSAGE);

        Pages.navigationPage().clickEditCampaignButton(Constants.CAMPAIGN_NAME);

        Pages.navigationPage().clickDeleteButton();

        Assert.assertTrue(!Pages.navigationPage().checkIfDeleted(), Constants.ERROR_MESSAGE);


    }
}
