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


@Epic("Test Epic")
@Feature("Add agent")
@Owner("QA Yulia Drapushko")
public class AddTest extends BaseTest {

    @Test(description = "Add agent Test")
    public void addTest(){
        Actions.loginActions().authorize(Constants.EMAIL, Constants.PASSWORD);

        Actions.mainActions().openVirtualAgentsPage();

        Pages.agentsPage().clickAddNewAgentButton();

        Pages.agentsPage().typeFirstName(Actions.mainActions().getUniqueName());

        Pages.agentsPage().typeLastName(Actions.mainActions().getUniqueName());

        Pages.agentsPage().clickCreateButton();

        Assert.assertTrue(Pages.navigationPage().checkIfSuccessful(), "Error! The agent was not added properly...");

    }
}
