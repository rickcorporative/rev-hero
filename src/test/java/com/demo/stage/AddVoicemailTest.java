package com.demo.stage;


//TODO: blocked by issue
import com.demo.core.base.BaseTest;
import com.demo.pages.Pages;
import com.demo.utils.Constants;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;


@Epic("Test Epic")
@Feature("Add voicemail type stage")
@Owner("QA Yuliia Drapushko")
public class AddVoicemailTest extends BaseTest {

    @Test(description = "add voicemail type stage test")
    public void addVoicemailTest() {
        Pages.loginPage().typeEmail(Constants.EMAIL);

        Pages.loginPage().typePassword(Constants.PASSWORD);

        Pages.loginPage().clickLoginButton();

        Assert.assertTrue(Pages.navigationPage().checkIfAuthorized(), "Error! Something went wrong...");

        Pages.navigationPage().clickEditCampaignButton();

        Pages.navigationPage().clickAddStageButton();

        Pages.navigationPage().typeStageName(Constants.STAGE_NAME);

        Pages.navigationPage().clickNextButton();

        Pages.navigationPage().markVoicemailCheckbox();

        Pages.navigationPage().clickNextButton();

        Pages.navigationPage().clickSaveButton();

        Assert.assertTrue(!Pages.navigationPage().checkIfEmailStageCreated(), "Error! Something went wrong...");


    }
}