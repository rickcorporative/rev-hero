package com.demo.pages;

import com.demo.core.base.PageTools;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.demo.utils.SelenideTools.sleep;

public class NavigationPage extends PageTools {
    private static By logoutButton = By.xpath("//a[@data-testid='logout']");
    private By editCampaignButton = By.xpath("//div[div[span[text()='%s']]]//div[contains(@class, 'campaignActionButtons')]/div[2]") ;
    private By stageForDelete = By.xpath("//div[div[text()='%s']]");
    private By editStageButton = By.xpath("//div[div[text()='%s']]/div[contains(@class,'actionButtons')]/*");
    private By stageNameField = By.xpath("//input[@type='text']");
    private By delayField = stageNameField;
    private By maxDealsToMoveField = By.xpath("//div[label[span[text()='Max deals to move']]]//input");
    private By nextButton = By.xpath("//span[text()='Next']");
    private By saveButton = By.xpath("//span[text()='Save']");
    private By successNote = By.xpath("//div[text()='Saved Successfully']");
    private By errorNote = By.xpath("//div[text()='Error saving stage. Please try again.']");
    private By deleteButton = By.xpath("//div[div[text()='%s']]/div[contains(@class,'actionButtons')]/*[local-name()='svg'][2]");
    private By addStageButton = By.xpath("//span[text()='Add Stage']");
    private By emailCheckbox = By.xpath("//span[contains(@class, 'css') and text()='Email']");
    private By voicemailCheckbox = By.xpath("//span[contains(@class, 'css') and text()='Voicemail']");
    private By sendToOtherCampaignCheckbox = By.xpath("//span[contains(@class, 'css') and text()='Send to other campaign']");
    private By sendPandadocSignatureCheckbox = By.xpath("//span[contains(@class, 'css') and text()='Send Pandadoc E-Signature']");
    private By sendLinkedInConnectionMessageCheckbox = By.xpath("//span[contains(@class, 'css') and text()='LinkedIn connection message']");
    private By sendLinkedInRegularMessageCheckbox = By.xpath("//span[contains(@class, 'css') and text()='LinkedIn regular message']");
    private By emailSubjectField = By.xpath("//input[@name='emailSubject']");
    private By emailBodyField = By.xpath("//div[contains(@class, 'ql-editor')]/p");

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
    public void clickEditCampaignButton(String campaignName){
        click(editCampaignButton, campaignName);
    }

    @Step("click edit stage button")
    public void clickEditStageButton(String stageName){
        click(editStageButton, stageName);
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
    public void clickDeleteButton(String stageName){
        click(deleteButton, stageName);
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

    @Step("Create an email")
    public void createEmail(String subject, String body){
        type(subject, emailSubjectField);
        setValue(body, emailBodyField);
    }
}
