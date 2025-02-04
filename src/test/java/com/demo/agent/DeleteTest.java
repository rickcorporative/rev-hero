package com.demo.agent;

import com.demo.actions.Actions;
import com.demo.core.base.BaseTest;
import com.demo.pages.Pages;
import com.demo.utils.Constants;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.demo.utils.SelenideTools.sleep;


@Epic("Test Epic")
@Feature("Delete")
@Owner("QA Yulia Drapushko")
public class DeleteTest extends BaseTest {

    @Test(description = "Delete Test")
    public void deleteTest(){

        Actions.loginActions().authorize(Constants.EMAIL, Constants.PASSWORD);

        Actions.mainActions().openVirtualAgentsPage();

        Pages.agentsPage().clickSettingsButton(Constants.NAME,Constants.NAME);

        Pages.agentsPage().clickDeleteOption();

        Assert.assertTrue(Pages.agentsPage().checkIfDeleted(), "Error! The agent was not deleted...");
    }
}
