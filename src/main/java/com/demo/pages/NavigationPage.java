package com.demo.pages;

import com.demo.core.base.PageTools;
import com.demo.utils.Constants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class NavigationPage extends PageTools {
    private static By logoutButton = By.xpath("//a[@data-testid='logout']");
    private By editCampaignButton = By.xpath("//div[div[span[text()='" + Constants.CAMPAIGN_NAME + "']]]//div[contains(@class, '_campaignActionButtons_hwawn_73')]/div[2]");
    private By editStageButton = By.xpath("//div[div[text()='" + Constants.STAGE_NAME + "']]/div[contains(@class,'_actionButtons_1xlv5_18')]/*");
    private By stageNameField = By.xpath("//input[@type='text']");
    private By nextButton = By.xpath("//span[text()='Next']");
    private By saveButton = By.xpath("//span[text()='Save']");
    private By successNote = By.xpath("//div[text()='Saved Successfully']");
    private By stageForDelete = By.xpath("//div[div[text()='" + Constants.STAGE_NAME + "']]");
    private By deleteButton = By.xpath("//div[div[text()='" + Constants.STAGE_NAME + "']]/div[contains(@class,'_actionButtons_1xlv5_18')]/*[local-name()='svg'][2]");

    @Step("Check if authorized")
    public boolean checkIfAuthorized(){
        waitForElementVisibility(logoutButton);
        return isElementVisible(logoutButton);
    }

    @Step("Check if editing was successful")
    public boolean checkIfSuccessful(){
        waitForElementVisibility(successNote);
        return isElementVisible(successNote);
    }

    @Step("Check if stage was deleted")
    public boolean checkIfDeleted(){
        return isElementVisible(stageForDelete);
    }

    @Step("click logout button")
    public void clickLogOutButton(){
        click(logoutButton);
    }

    @Step("click edit button")
    public void clickEditCampaignButton(){
        click(editCampaignButton);
    }

    @Step("click edit stage button")
    public void clickEditStageButton(){
        click(editStageButton);
    }

    @Step("Type new stage name")
    public void typeNewStageName(String value){
        type(value, stageNameField);
    }

    @Step("click next button")
    public void clickNextButton(){
        click(nextButton);
    }

    @Step("Click save button")
    public void clickSaveButton(){
        click(saveButton);
    }

    @Step("Click delete button")
    public void clickDeleteButton(){
        click(deleteButton);
    }



}
