package com.demo.pages;

import com.demo.core.base.PageTools;
import com.demo.utils.Constants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.demo.utils.SelenideTools.sleep;

public class NavigationPage extends PageTools {
    private static By logoutButton = By.xpath("//a[@data-testid='logout']");
    private By editCampaignButton;
    private By editStageButton = By.xpath("//div[div[text()='" + Constants.STAGE_NAME + "']]/div[contains(@class,'_actionButtons_1xlv5_18')]/*");
    private By stageNameField = By.xpath("//input[@type='text']");
    private By delayField = stageNameField;
    private By maxDealsToMoveField = By.xpath("//div[label[span[text()='Max deals to move']]]//input");
    private By nextButton = By.xpath("//span[text()='Next']");
    private By saveButton = By.xpath("//span[text()='Save']");
    private By successNote = By.xpath("//div[text()='Saved Successfully']");
    private By errorNote = By.xpath("//div[text()='Error saving stage. Please try again.']");
    private By stageForDelete = By.xpath("//div[div[text()='" + Constants.STAGE_NAME + "']]");
    private By deleteButton = By.xpath("//div[div[text()='" + Constants.STAGE_NAME + "']]/div[contains(@class,'_actionButtons_1xlv5_18')]/*[local-name()='svg'][2]");
    private By addStageButton = By.xpath("//span[text()='Add Stage']");
    private By emailCheckbox = By.xpath("//span[contains(@class, 'css-ahj2mt-MuiTypography-root') and text()='Email']");
    private By voicemailCheckbox = By.xpath("//span[contains(@class, 'css-ahj2mt-MuiTypography-root') and text()='Voicemail']");
    private By sendToOtherCampaignCheckbox = By.xpath("//span[contains(@class, 'css-ahj2mt-MuiTypography-root') and text()='Send to other campaign']");
    private By sendPandadocSignatureCheckbox = By.xpath("//span[contains(@class, 'css-ahj2mt-MuiTypography-root') and text()='Send Pandadoc E-Signature']");
    private By sendLinkedInConnectionMessageCheckbox = By.xpath("//span[contains(@class, 'css-ahj2mt-MuiTypography-root') and text()='LinkedIn connection message']");
    private By sendLinkedInRegularMessageCheckbox = By.xpath("//span[contains(@class, 'css-ahj2mt-MuiTypography-root') and text()='LinkedIn regular message']");


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

    @Step("Check if email stage was created")
    public boolean checkIfEmailStageCreated(){
        waitForElementVisibility(errorNote);
        return isElementVisible(errorNote);
    }

    @Step("click logout button")
    public void clickLogOutButton(){
        click(logoutButton);
    }

    @Step("click edit button")
    public void clickEditCampaignButton(String campaign){
        editCampaignButton = By.xpath("//div[div[span[text()='" + campaign + "']]]//div[contains(@class, '_campaignActionButtons_hwawn_73')]/div[2]");
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

    @Step("Click add stage button")
    public void clickAddStageButton(){
        scrollToElement(addStageButton);
        sleep(3);
        click(addStageButton);
    }

    @Step("Type new name")
    public void typeStageName(String value){
        type(value, stageNameField);
    }

    @Step("Mark email")
    public void markEmailCheckbox(){
        click(emailCheckbox);
    }

    @Step("Mark voicemail")
    public void markVoicemailCheckbox(){
        click(voicemailCheckbox);
    }

    @Step("Mark send to other campaign")
    public void markSendToOtherCampaign(){
        click(sendToOtherCampaignCheckbox);
    }

    @Step("Mark Send Pandadoc E-Signature")
    public void markSendPandadocSignatureCheckbox(){
        click(sendPandadocSignatureCheckbox);
    }

    @Step("Mark LinkedIn connection message")
    public void markLinkedInConnectionMessageCheckbox(){
        click(sendLinkedInConnectionMessageCheckbox);
    }

    @Step("Mark LinkedIn regular message")
    public void markLinkedInRegularMessageCheckbox(){
        click(sendLinkedInRegularMessageCheckbox);
    }

    @Step("Set delay")
    public void setDelay(String value){
        type(value, delayField);
    }

    @Step("Set max deals limit")
    public void setMaxDealsLimit(String value){
        type(value, maxDealsToMoveField);
    }
}
