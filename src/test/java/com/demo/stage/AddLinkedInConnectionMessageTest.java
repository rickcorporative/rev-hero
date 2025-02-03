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
@Feature("Add LinkedIn connection message type stage")
@Owner("QA Yuliia Drapushko")
public class AddLinkedInConnectionMessageTest extends BaseTest {

    @Test(description = "add LinkedIn connection message type stage test")
    public void addEmailTest() {
        Actions.loginActions().authorize(Constants.EMAIL, Constants.PASSWORD);

        Pages.navigationPage().clickEditCampaignButton(Constants.CAMPAIGN_NAME);

        Pages.navigationPage().clickAddStageButton();

        Pages.navigationPage().typeStageName(Constants.STAGE_NAME);

        Pages.navigationPage().clickNextButton();

        Pages.navigationPage().markLinkedInConnectionMessageCheckbox();

        Pages.navigationPage().clickNextButton();

        Pages.navigationPage().clickSaveButton();

        Assert.assertTrue(!Pages.navigationPage().checkIfEmailStageCreated(), "Error! LinkedIn connection message type stage was not added...");

    }
}