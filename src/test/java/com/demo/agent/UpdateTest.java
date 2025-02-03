package com.demo.agent;

import com.beust.ah.A;
import com.demo.actions.Actions;
import com.demo.actions.MainActions;
import com.demo.core.base.BaseTest;
import com.demo.pages.Pages;
import com.demo.utils.Constants;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;


@Epic("Test Epic")
@Feature("Update")
@Owner("QA Yulia Drapushko")
public class UpdateTest extends BaseTest {

    @Test(description = "Update Test")
    public void updateTest(){
        Actions.loginActions().authorize(Constants.EMAIL, Constants.PASSWORD);

        Actions.mainActions().openVirtualAgentsPage();

        Pages.agentsPage().clickSettingsButton(Constants.NAME, Constants.NAME);

        Pages.agentsPage().clickUpdateOption();

        Pages.agentsPage().typeFirstName(Constants.NEW_NAME);

        Pages.agentsPage().clickUpdateButton();

        Assert.assertTrue(Pages.agentsPage().checkIfUpdated(), "Error! The agent was not updated...");
    }
}
